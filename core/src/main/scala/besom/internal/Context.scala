package besom.internal

import com.google.protobuf.struct.*
import besom.util.*
import besom.types.{ ResourceType, URN, Label, ProviderType }
import besom.internal.logging.*
import scala.annotation.implicitNotFound
import besom.internal.ComponentResource

case class InvokeOptions()

type Providers = Map[String, ProviderResource]

@implicitNotFound(s"""|Pulumi code has to be written with a Context in scope.
                      |
                      |Context is available by default in your main pulumi function, inside of `Pulumi.run`.
                      |NOTE: Every pulumi program should only have ONE `Pulumi.run` call.
                      |
                      |If you are writing code outside of `Pulumi.run`, you can pass a Context explicitly.
                      |This can be done by just adding a `(using Context)` clause to your function.""".stripMargin)
trait Context extends TaskTracker:
  private[besom] def initializeStack: Result[Unit]
  private[besom] def featureSupport: FeatureSupport
  private[besom] def resources: Resources
  private[besom] def runInfo: RunInfo
  private[besom] def monitor: Monitor
  private[besom] def getParentURN: Result[URN]
  private[besom] def config: Config

  private[besom] def isDryRun: Boolean
  private[besom] def logger: BesomLogger

  private[besom] def registerComponentResource(
    name: NonEmptyString,
    typ: ResourceType
  )(using Context): Result[ComponentBase]

  private[besom] def registerProvider[R <: Resource: ResourceDecoder, A: ProviderArgsEncoder](
    typ: ProviderType,
    name: NonEmptyString,
    args: A,
    options: CustomResourceOptions
  )(using Context): Output[R]

  private[besom] def registerResource[R <: Resource: ResourceDecoder, A: ArgsEncoder](
    typ: ResourceType,
    name: NonEmptyString,
    args: A,
    options: ResourceOptions
  )(using Context): Output[R]

  private[besom] def readResource[R <: Resource: ResourceDecoder, A: ArgsEncoder](
    typ: ResourceType,
    name: NonEmptyString,
    args: A,
    options: ResourceOptions
  )(using Context): Output[R]

  private[besom] def registerResourceOutputs(
    name: NonEmptyString,
    typ: ResourceType,
    urnResult: Result[URN],
    outputs: Result[Struct]
  )(using Context): Result[Unit]

  private[besom] def close(): Result[Unit]

class ComponentContext(private val globalContext: Context, private val componentURN: Result[URN]) extends Context:
  export globalContext.{getParentURN => _, *}

  def getParentURN: Result[URN] = componentURN

class ContextImpl(
  private[besom] val runInfo: RunInfo,
  private[besom] val featureSupport: FeatureSupport,
  private[besom] val config: Config,
  private[besom] val logger: BesomLogger,
  private[besom] val monitor: Monitor,
  private[besom] val engine: Engine,
  private[besom] val taskTracker: TaskTracker,
  private[besom] val resources: Resources,
  private val stackPromise: Promise[Stack]
) extends Context
    with TaskTracker:

  export taskTracker.{registerTask, waitForAllTasks, fail}

  private[besom] def isDryRun: Boolean = runInfo.dryRun

  private[besom] def getParentURN: Result[URN] =
    stackPromise.get.flatMap(_.urn.getData).map(_.getValue).flatMap {
      case Some(urn) => Result.pure(urn)
      case None      => Result.fail(Exception("Stack urn is not available. This should not happen."))
    }

  private[besom] def initializeStack: Result[Unit] =
    Stack.initializeStack(runInfo)(using this).flatMap(stackPromise.fulfill)

  private[besom] def registerComponentResource(
    name: NonEmptyString,
    typ: ResourceType
  )(using Context): Result[ComponentBase] =
    val label = Label.fromNameAndType(name, typ)

    MDC(Key.LabelKey, label) {
      ResourceOps().registerResourceInternal[ComponentBase, EmptyArgs](
        typ,
        name,
        EmptyArgs(),
        ComponentResourceOptions() // TODO pass initial ResourceTransformations here
      )
    }

  private[besom] def registerProvider[R <: Resource: ResourceDecoder, A: ProviderArgsEncoder](
    typ: ProviderType,
    name: NonEmptyString,
    args: A,
    options: CustomResourceOptions
  )(using Context): Output[R] =
    MDC(Key.LabelKey, Label.fromNameAndType(name, typ)) {
      Output.ofData(ResourceOps().registerResourceInternal[R, A](typ, name, args, options).map(OutputData(_)))
    }

  private[besom] def registerResource[R <: Resource: ResourceDecoder, A: ArgsEncoder](
    typ: ResourceType,
    name: NonEmptyString,
    args: A,
    options: ResourceOptions
  )(using Context): Output[R] =
    MDC(Key.LabelKey, Label.fromNameAndType(name, typ)) {
      Output.ofData(ResourceOps().registerResourceInternal[R, A](typ, name, args, options).map(OutputData(_)))
    }

  private[besom] def readResource[R <: Resource: ResourceDecoder, A: ArgsEncoder](
    typ: ResourceType,
    name: NonEmptyString,
    args: A,
    options: ResourceOptions
  )(using Context): Output[R] = ???

  private[besom] def registerResourceOutputs(
    name: NonEmptyString,
    typ: ResourceType,
    urnResult: Result[URN],
    outputs: Result[Struct]
  )(using Context): Result[Unit] =
    MDC(Key.LabelKey, Label.fromNameAndType(name, typ)) {
      ResourceOps().registerResourceOutputsInternal(urnResult, outputs)
    }

  private[besom] def close(): Result[Unit] =
    for
      _ <- monitor.close()
      _ <- engine.close()
    yield ()

  private[besom] def readOrRegisterResource[R <: Resource: ResourceDecoder, A: ArgsEncoder](
    typ: ResourceType,
    name: NonEmptyString,
    args: A,
    options: ResourceOptions
  ): Output[R] =
    // val effect: Output[R] = ???
    // registerResourceCreation(typ, name, effect) // put into ConcurrentHashMap eagerly!
    // effect
    ???

object Context:

  def apply(
    runInfo: RunInfo,
    featureSupport: FeatureSupport,
    config: Config,
    logger: BesomLogger,
    monitor: Monitor,
    engine: Engine,
    taskTracker: TaskTracker,
    resources: Resources,
    stackPromise: Promise[Stack]
  ): Context =
    new ContextImpl(runInfo, featureSupport, config, logger, monitor, engine, taskTracker, resources, stackPromise)

  def apply(
    runInfo: RunInfo,
    featureSupport: FeatureSupport,
    config: Config,
    logger: BesomLogger,
    monitor: Monitor,
    engine: Engine,
    taskTracker: TaskTracker
  ): Result[Context] =
    for
      resources    <- Resources()
      stackPromise <- Promise[Stack]()
    yield apply(runInfo, featureSupport, config, logger, monitor, engine, taskTracker, resources, stackPromise)

  def apply(
    runInfo: RunInfo,
    taskTracker: TaskTracker,
    monitor: Monitor,
    engine: Engine,
    logger: BesomLogger,
    featureSupport: FeatureSupport,
    config: Config
  ): Result[Context] =
    for
      ctx <- apply(runInfo, featureSupport, config, logger, monitor, engine, taskTracker)
      _   <- ctx.initializeStack
    yield ctx
