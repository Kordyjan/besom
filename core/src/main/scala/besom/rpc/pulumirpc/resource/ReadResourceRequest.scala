// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package pulumirpc.resource

/** ReadResourceRequest contains enough information to uniquely qualify and read a resource's state.
  *
  * @param id
  *   the ID of the resource to read.
  * @param type
  *   the type of the resource object.
  * @param name
  *   the name, for URN purposes, of the object.
  * @param parent
  *   an optional parent URN that this child resource belongs to.
  * @param properties
  *   optional state sufficient to uniquely identify the resource.
  * @param dependencies
  *   a list of URNs that this read depends on, as observed by the language host.
  * @param provider
  *   an optional reference to the provider to use for this read.
  * @param version
  *   the version of the provider to use when servicing this request.
  * @param acceptSecrets
  *   when true operations should return secrets as strongly typed.
  * @param additionalSecretOutputs
  *   a list of output properties that should also be treated as secret, in addition to ones we detect.
  * @param acceptResources
  *   when true operations should return resource references as strongly typed.
  * @param pluginDownloadURL
  *   the server url of the provider to use when servicing this request.
  */
@SerialVersionUID(0L)
final case class ReadResourceRequest(
    id: _root_.scala.Predef.String = "",
    `type`: _root_.scala.Predef.String = "",
    name: _root_.scala.Predef.String = "",
    parent: _root_.scala.Predef.String = "",
    properties: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None,
    dependencies: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    provider: _root_.scala.Predef.String = "",
    version: _root_.scala.Predef.String = "",
    acceptSecrets: _root_.scala.Boolean = false,
    additionalSecretOutputs: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    acceptResources: _root_.scala.Boolean = false,
    pluginDownloadURL: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[ReadResourceRequest] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = id
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = `type`
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = parent
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      if (properties.isDefined) {
        val __value = properties.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      dependencies.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
      }
      
      {
        val __value = provider
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
        }
      };
      
      {
        val __value = version
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
        }
      };
      
      {
        val __value = acceptSecrets
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(9, __value)
        }
      };
      additionalSecretOutputs.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, __value)
      }
      
      {
        val __value = acceptResources
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(12, __value)
        }
      };
      
      {
        val __value = pluginDownloadURL
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(13, __value)
        }
      };
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
      {
        val __v = id
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = `type`
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = parent
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      properties.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      dependencies.foreach { __v =>
        val __m = __v
        _output__.writeString(6, __m)
      };
      {
        val __v = provider
        if (!__v.isEmpty) {
          _output__.writeString(7, __v)
        }
      };
      {
        val __v = version
        if (!__v.isEmpty) {
          _output__.writeString(8, __v)
        }
      };
      {
        val __v = acceptSecrets
        if (__v != false) {
          _output__.writeBool(9, __v)
        }
      };
      additionalSecretOutputs.foreach { __v =>
        val __m = __v
        _output__.writeString(10, __m)
      };
      {
        val __v = acceptResources
        if (__v != false) {
          _output__.writeBool(12, __v)
        }
      };
      {
        val __v = pluginDownloadURL
        if (!__v.isEmpty) {
          _output__.writeString(13, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withId(__v: _root_.scala.Predef.String): ReadResourceRequest = copy(id = __v)
    def withType(__v: _root_.scala.Predef.String): ReadResourceRequest = copy(`type` = __v)
    def withName(__v: _root_.scala.Predef.String): ReadResourceRequest = copy(name = __v)
    def withParent(__v: _root_.scala.Predef.String): ReadResourceRequest = copy(parent = __v)
    def getProperties: com.google.protobuf.struct.Struct = properties.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)
    def clearProperties: ReadResourceRequest = copy(properties = _root_.scala.None)
    def withProperties(__v: com.google.protobuf.struct.Struct): ReadResourceRequest = copy(properties = Option(__v))
    def clearDependencies = copy(dependencies = _root_.scala.Seq.empty)
    def addDependencies(__vs: _root_.scala.Predef.String *): ReadResourceRequest = addAllDependencies(__vs)
    def addAllDependencies(__vs: Iterable[_root_.scala.Predef.String]): ReadResourceRequest = copy(dependencies = dependencies ++ __vs)
    def withDependencies(__v: _root_.scala.Seq[_root_.scala.Predef.String]): ReadResourceRequest = copy(dependencies = __v)
    def withProvider(__v: _root_.scala.Predef.String): ReadResourceRequest = copy(provider = __v)
    def withVersion(__v: _root_.scala.Predef.String): ReadResourceRequest = copy(version = __v)
    def withAcceptSecrets(__v: _root_.scala.Boolean): ReadResourceRequest = copy(acceptSecrets = __v)
    def clearAdditionalSecretOutputs = copy(additionalSecretOutputs = _root_.scala.Seq.empty)
    def addAdditionalSecretOutputs(__vs: _root_.scala.Predef.String *): ReadResourceRequest = addAllAdditionalSecretOutputs(__vs)
    def addAllAdditionalSecretOutputs(__vs: Iterable[_root_.scala.Predef.String]): ReadResourceRequest = copy(additionalSecretOutputs = additionalSecretOutputs ++ __vs)
    def withAdditionalSecretOutputs(__v: _root_.scala.Seq[_root_.scala.Predef.String]): ReadResourceRequest = copy(additionalSecretOutputs = __v)
    def withAcceptResources(__v: _root_.scala.Boolean): ReadResourceRequest = copy(acceptResources = __v)
    def withPluginDownloadURL(__v: _root_.scala.Predef.String): ReadResourceRequest = copy(pluginDownloadURL = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = id
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = `type`
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = parent
          if (__t != "") __t else null
        }
        case 5 => properties.orNull
        case 6 => dependencies
        case 7 => {
          val __t = provider
          if (__t != "") __t else null
        }
        case 8 => {
          val __t = version
          if (__t != "") __t else null
        }
        case 9 => {
          val __t = acceptSecrets
          if (__t != false) __t else null
        }
        case 10 => additionalSecretOutputs
        case 12 => {
          val __t = acceptResources
          if (__t != false) __t else null
        }
        case 13 => {
          val __t = pluginDownloadURL
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(id)
        case 2 => _root_.scalapb.descriptors.PString(`type`)
        case 3 => _root_.scalapb.descriptors.PString(name)
        case 4 => _root_.scalapb.descriptors.PString(parent)
        case 5 => properties.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => _root_.scalapb.descriptors.PRepeated(dependencies.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 7 => _root_.scalapb.descriptors.PString(provider)
        case 8 => _root_.scalapb.descriptors.PString(version)
        case 9 => _root_.scalapb.descriptors.PBoolean(acceptSecrets)
        case 10 => _root_.scalapb.descriptors.PRepeated(additionalSecretOutputs.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 12 => _root_.scalapb.descriptors.PBoolean(acceptResources)
        case 13 => _root_.scalapb.descriptors.PString(pluginDownloadURL)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: pulumirpc.resource.ReadResourceRequest.type = pulumirpc.resource.ReadResourceRequest
    // @@protoc_insertion_point(GeneratedMessage[pulumirpc.ReadResourceRequest])
}

object ReadResourceRequest extends scalapb.GeneratedMessageCompanion[pulumirpc.resource.ReadResourceRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.resource.ReadResourceRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.resource.ReadResourceRequest = {
    var __id: _root_.scala.Predef.String = ""
    var __type: _root_.scala.Predef.String = ""
    var __name: _root_.scala.Predef.String = ""
    var __parent: _root_.scala.Predef.String = ""
    var __properties: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None
    val __dependencies: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var __provider: _root_.scala.Predef.String = ""
    var __version: _root_.scala.Predef.String = ""
    var __acceptSecrets: _root_.scala.Boolean = false
    val __additionalSecretOutputs: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var __acceptResources: _root_.scala.Boolean = false
    var __pluginDownloadURL: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __id = _input__.readStringRequireUtf8()
        case 18 =>
          __type = _input__.readStringRequireUtf8()
        case 26 =>
          __name = _input__.readStringRequireUtf8()
        case 34 =>
          __parent = _input__.readStringRequireUtf8()
        case 42 =>
          __properties = Option(__properties.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.struct.Struct](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 50 =>
          __dependencies += _input__.readStringRequireUtf8()
        case 58 =>
          __provider = _input__.readStringRequireUtf8()
        case 66 =>
          __version = _input__.readStringRequireUtf8()
        case 72 =>
          __acceptSecrets = _input__.readBool()
        case 82 =>
          __additionalSecretOutputs += _input__.readStringRequireUtf8()
        case 96 =>
          __acceptResources = _input__.readBool()
        case 106 =>
          __pluginDownloadURL = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    pulumirpc.resource.ReadResourceRequest(
        id = __id,
        `type` = __type,
        name = __name,
        parent = __parent,
        properties = __properties,
        dependencies = __dependencies.result(),
        provider = __provider,
        version = __version,
        acceptSecrets = __acceptSecrets,
        additionalSecretOutputs = __additionalSecretOutputs.result(),
        acceptResources = __acceptResources,
        pluginDownloadURL = __pluginDownloadURL,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.resource.ReadResourceRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      pulumirpc.resource.ReadResourceRequest(
        id = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        `type` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        parent = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        properties = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.Struct]]),
        dependencies = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        provider = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        version = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        acceptSecrets = __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        additionalSecretOutputs = __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        acceptResources = __fieldsMap.get(scalaDescriptor.findFieldByNumber(12).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        pluginDownloadURL = __fieldsMap.get(scalaDescriptor.findFieldByNumber(13).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ResourceProto.javaDescriptor.getMessageTypes().get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ResourceProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 5 => __out = com.google.protobuf.struct.Struct
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = pulumirpc.resource.ReadResourceRequest(
    id = "",
    `type` = "",
    name = "",
    parent = "",
    properties = _root_.scala.None,
    dependencies = _root_.scala.Seq.empty,
    provider = "",
    version = "",
    acceptSecrets = false,
    additionalSecretOutputs = _root_.scala.Seq.empty,
    acceptResources = false,
    pluginDownloadURL = ""
  )
  implicit class ReadResourceRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.resource.ReadResourceRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.resource.ReadResourceRequest](_l) {
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def parent: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.parent)((c_, f_) => c_.copy(parent = f_))
    def properties: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct] = field(_.getProperties)((c_, f_) => c_.copy(properties = Option(f_)))
    def optionalProperties: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.struct.Struct]] = field(_.properties)((c_, f_) => c_.copy(properties = f_))
    def dependencies: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.dependencies)((c_, f_) => c_.copy(dependencies = f_))
    def provider: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.provider)((c_, f_) => c_.copy(provider = f_))
    def version: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def acceptSecrets: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.acceptSecrets)((c_, f_) => c_.copy(acceptSecrets = f_))
    def additionalSecretOutputs: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.additionalSecretOutputs)((c_, f_) => c_.copy(additionalSecretOutputs = f_))
    def acceptResources: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.acceptResources)((c_, f_) => c_.copy(acceptResources = f_))
    def pluginDownloadURL: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.pluginDownloadURL)((c_, f_) => c_.copy(pluginDownloadURL = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val TYPE_FIELD_NUMBER = 2
  final val NAME_FIELD_NUMBER = 3
  final val PARENT_FIELD_NUMBER = 4
  final val PROPERTIES_FIELD_NUMBER = 5
  final val DEPENDENCIES_FIELD_NUMBER = 6
  final val PROVIDER_FIELD_NUMBER = 7
  final val VERSION_FIELD_NUMBER = 8
  final val ACCEPTSECRETS_FIELD_NUMBER = 9
  final val ADDITIONALSECRETOUTPUTS_FIELD_NUMBER = 10
  final val ACCEPTRESOURCES_FIELD_NUMBER = 12
  final val PLUGINDOWNLOADURL_FIELD_NUMBER = 13
  def of(
    id: _root_.scala.Predef.String,
    `type`: _root_.scala.Predef.String,
    name: _root_.scala.Predef.String,
    parent: _root_.scala.Predef.String,
    properties: _root_.scala.Option[com.google.protobuf.struct.Struct],
    dependencies: _root_.scala.Seq[_root_.scala.Predef.String],
    provider: _root_.scala.Predef.String,
    version: _root_.scala.Predef.String,
    acceptSecrets: _root_.scala.Boolean,
    additionalSecretOutputs: _root_.scala.Seq[_root_.scala.Predef.String],
    acceptResources: _root_.scala.Boolean,
    pluginDownloadURL: _root_.scala.Predef.String
  ): _root_.pulumirpc.resource.ReadResourceRequest = _root_.pulumirpc.resource.ReadResourceRequest(
    id,
    `type`,
    name,
    parent,
    properties,
    dependencies,
    provider,
    version,
    acceptSecrets,
    additionalSecretOutputs,
    acceptResources,
    pluginDownloadURL
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.ReadResourceRequest])
}
