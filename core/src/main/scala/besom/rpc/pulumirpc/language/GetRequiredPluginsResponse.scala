// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package pulumirpc.language

/** @param plugins
  *   a list of plugins required by this program.
  */
@SerialVersionUID(0L)
final case class GetRequiredPluginsResponse(
    plugins: _root_.scala.Seq[pulumirpc.plugin.PluginDependency] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[GetRequiredPluginsResponse] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      plugins.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      plugins.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearPlugins = copy(plugins = _root_.scala.Seq.empty)
    def addPlugins(__vs: pulumirpc.plugin.PluginDependency *): GetRequiredPluginsResponse = addAllPlugins(__vs)
    def addAllPlugins(__vs: Iterable[pulumirpc.plugin.PluginDependency]): GetRequiredPluginsResponse = copy(plugins = plugins ++ __vs)
    def withPlugins(__v: _root_.scala.Seq[pulumirpc.plugin.PluginDependency]): GetRequiredPluginsResponse = copy(plugins = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => plugins
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(plugins.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: pulumirpc.language.GetRequiredPluginsResponse.type = pulumirpc.language.GetRequiredPluginsResponse
    // @@protoc_insertion_point(GeneratedMessage[pulumirpc.GetRequiredPluginsResponse])
}

object GetRequiredPluginsResponse extends scalapb.GeneratedMessageCompanion[pulumirpc.language.GetRequiredPluginsResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.language.GetRequiredPluginsResponse] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.language.GetRequiredPluginsResponse = {
    val __plugins: _root_.scala.collection.immutable.VectorBuilder[pulumirpc.plugin.PluginDependency] = new _root_.scala.collection.immutable.VectorBuilder[pulumirpc.plugin.PluginDependency]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __plugins += _root_.scalapb.LiteParser.readMessage[pulumirpc.plugin.PluginDependency](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    pulumirpc.language.GetRequiredPluginsResponse(
        plugins = __plugins.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.language.GetRequiredPluginsResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      pulumirpc.language.GetRequiredPluginsResponse(
        plugins = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[pulumirpc.plugin.PluginDependency]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = LanguageProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = LanguageProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = pulumirpc.plugin.PluginDependency
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = pulumirpc.language.GetRequiredPluginsResponse(
    plugins = _root_.scala.Seq.empty
  )
  implicit class GetRequiredPluginsResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.language.GetRequiredPluginsResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.language.GetRequiredPluginsResponse](_l) {
    def plugins: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[pulumirpc.plugin.PluginDependency]] = field(_.plugins)((c_, f_) => c_.copy(plugins = f_))
  }
  final val PLUGINS_FIELD_NUMBER = 1
  def of(
    plugins: _root_.scala.Seq[pulumirpc.plugin.PluginDependency]
  ): _root_.pulumirpc.language.GetRequiredPluginsResponse = _root_.pulumirpc.language.GetRequiredPluginsResponse(
    plugins
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.GetRequiredPluginsResponse])
}
