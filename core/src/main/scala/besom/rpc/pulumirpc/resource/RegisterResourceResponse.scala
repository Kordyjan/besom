// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package pulumirpc.resource

/** RegisterResourceResponse is returned by the engine after a resource has finished being initialized.  It includes the
  * auto-assigned URN, the provider-assigned ID, and any other properties initialized by the engine.
  *
  * @param urn
  *   the URN assigned by the engine.
  * @param id
  *   the unique ID assigned by the provider.
  * @param object
  *   the resulting object properties, including provider defaults.
  * @param stable
  *   if true, the object's state is stable and may be trusted not to change.
  * @param stables
  *   an optional list of guaranteed-stable properties.
  * @param propertyDependencies
  *   a map from property keys to the dependencies of the property.
  */
@SerialVersionUID(0L)
final case class RegisterResourceResponse(
    urn: _root_.scala.Predef.String = "",
    id: _root_.scala.Predef.String = "",
    `object`: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None,
    stable: _root_.scala.Boolean = false,
    stables: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    propertyDependencies: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies] = _root_.scala.collection.immutable.Map.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[RegisterResourceResponse] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = urn
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = id
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      if (`object`.isDefined) {
        val __value = `object`.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = stable
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(4, __value)
        }
      };
      stables.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
      }
      propertyDependencies.foreach { __item =>
        val __value = pulumirpc.resource.RegisterResourceResponse._typemapper_propertyDependencies.toBase(__item)
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
      {
        val __v = urn
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = id
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      `object`.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = stable
        if (__v != false) {
          _output__.writeBool(4, __v)
        }
      };
      stables.foreach { __v =>
        val __m = __v
        _output__.writeString(5, __m)
      };
      propertyDependencies.foreach { __v =>
        val __m = pulumirpc.resource.RegisterResourceResponse._typemapper_propertyDependencies.toBase(__v)
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withUrn(__v: _root_.scala.Predef.String): RegisterResourceResponse = copy(urn = __v)
    def withId(__v: _root_.scala.Predef.String): RegisterResourceResponse = copy(id = __v)
    def getObject: com.google.protobuf.struct.Struct = `object`.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)
    def clearObject: RegisterResourceResponse = copy(`object` = _root_.scala.None)
    def withObject(__v: com.google.protobuf.struct.Struct): RegisterResourceResponse = copy(`object` = Option(__v))
    def withStable(__v: _root_.scala.Boolean): RegisterResourceResponse = copy(stable = __v)
    def clearStables = copy(stables = _root_.scala.Seq.empty)
    def addStables(__vs: _root_.scala.Predef.String *): RegisterResourceResponse = addAllStables(__vs)
    def addAllStables(__vs: Iterable[_root_.scala.Predef.String]): RegisterResourceResponse = copy(stables = stables ++ __vs)
    def withStables(__v: _root_.scala.Seq[_root_.scala.Predef.String]): RegisterResourceResponse = copy(stables = __v)
    def clearPropertyDependencies = copy(propertyDependencies = _root_.scala.collection.immutable.Map.empty)
    def addPropertyDependencies(__vs: (_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies) *): RegisterResourceResponse = addAllPropertyDependencies(__vs)
    def addAllPropertyDependencies(__vs: Iterable[(_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies)]): RegisterResourceResponse = copy(propertyDependencies = propertyDependencies ++ __vs)
    def withPropertyDependencies(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]): RegisterResourceResponse = copy(propertyDependencies = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = urn
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = id
          if (__t != "") __t else null
        }
        case 3 => `object`.orNull
        case 4 => {
          val __t = stable
          if (__t != false) __t else null
        }
        case 5 => stables
        case 6 => propertyDependencies.iterator.map(pulumirpc.resource.RegisterResourceResponse._typemapper_propertyDependencies.toBase(_)).toSeq
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(urn)
        case 2 => _root_.scalapb.descriptors.PString(id)
        case 3 => `object`.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => _root_.scalapb.descriptors.PBoolean(stable)
        case 5 => _root_.scalapb.descriptors.PRepeated(stables.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 6 => _root_.scalapb.descriptors.PRepeated(propertyDependencies.iterator.map(pulumirpc.resource.RegisterResourceResponse._typemapper_propertyDependencies.toBase(_).toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: pulumirpc.resource.RegisterResourceResponse.type = pulumirpc.resource.RegisterResourceResponse
    // @@protoc_insertion_point(GeneratedMessage[pulumirpc.RegisterResourceResponse])
}

object RegisterResourceResponse extends scalapb.GeneratedMessageCompanion[pulumirpc.resource.RegisterResourceResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.resource.RegisterResourceResponse] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.resource.RegisterResourceResponse = {
    var __urn: _root_.scala.Predef.String = ""
    var __id: _root_.scala.Predef.String = ""
    var __object: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None
    var __stable: _root_.scala.Boolean = false
    val __stables: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    val __propertyDependencies: _root_.scala.collection.mutable.Builder[(_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies), _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]] = _root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __urn = _input__.readStringRequireUtf8()
        case 18 =>
          __id = _input__.readStringRequireUtf8()
        case 26 =>
          __object = Option(__object.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.struct.Struct](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 32 =>
          __stable = _input__.readBool()
        case 42 =>
          __stables += _input__.readStringRequireUtf8()
        case 50 =>
          __propertyDependencies += pulumirpc.resource.RegisterResourceResponse._typemapper_propertyDependencies.toCustom(_root_.scalapb.LiteParser.readMessage[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry](_input__))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    pulumirpc.resource.RegisterResourceResponse(
        urn = __urn,
        id = __id,
        `object` = __object,
        stable = __stable,
        stables = __stables.result(),
        propertyDependencies = __propertyDependencies.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.resource.RegisterResourceResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      pulumirpc.resource.RegisterResourceResponse(
        urn = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        id = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        `object` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.Struct]]),
        stable = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        stables = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        propertyDependencies = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(pulumirpc.resource.RegisterResourceResponse._typemapper_propertyDependencies.toCustom(_)).toMap
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ResourceProto.javaDescriptor.getMessageTypes().get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ResourceProto.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = com.google.protobuf.struct.Struct
      case 6 => __out = pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.pulumirpc.resource.RegisterResourceResponse.PropertyDependencies,
      _root_.pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = pulumirpc.resource.RegisterResourceResponse(
    urn = "",
    id = "",
    `object` = _root_.scala.None,
    stable = false,
    stables = _root_.scala.Seq.empty,
    propertyDependencies = _root_.scala.collection.immutable.Map.empty
  )
  /** PropertyDependencies describes the resources that a particular property depends on.
    *
    * @param urns
    *   A list of URNs this property depends on.
    */
  @SerialVersionUID(0L)
  final case class PropertyDependencies(
      urns: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[PropertyDependencies] {
      @transient
      private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
      private[this] def __computeSerializedSize(): _root_.scala.Int = {
        var __size = 0
        urns.foreach { __item =>
          val __value = __item
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
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
        urns.foreach { __v =>
          val __m = __v
          _output__.writeString(1, __m)
        };
        unknownFields.writeTo(_output__)
      }
      def clearUrns = copy(urns = _root_.scala.Seq.empty)
      def addUrns(__vs: _root_.scala.Predef.String *): PropertyDependencies = addAllUrns(__vs)
      def addAllUrns(__vs: Iterable[_root_.scala.Predef.String]): PropertyDependencies = copy(urns = urns ++ __vs)
      def withUrns(__v: _root_.scala.Seq[_root_.scala.Predef.String]): PropertyDependencies = copy(urns = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => urns
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PRepeated(urns.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: pulumirpc.resource.RegisterResourceResponse.PropertyDependencies.type = pulumirpc.resource.RegisterResourceResponse.PropertyDependencies
      // @@protoc_insertion_point(GeneratedMessage[pulumirpc.RegisterResourceResponse.PropertyDependencies])
  }
  
  object PropertyDependencies extends scalapb.GeneratedMessageCompanion[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies] = this
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.resource.RegisterResourceResponse.PropertyDependencies = {
      val __urns: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __urns += _input__.readStringRequireUtf8()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      pulumirpc.resource.RegisterResourceResponse.PropertyDependencies(
          urns = __urns.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        pulumirpc.resource.RegisterResourceResponse.PropertyDependencies(
          urns = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = pulumirpc.resource.RegisterResourceResponse.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = pulumirpc.resource.RegisterResourceResponse.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = pulumirpc.resource.RegisterResourceResponse.PropertyDependencies(
      urns = _root_.scala.Seq.empty
    )
    implicit class PropertyDependenciesLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies](_l) {
      def urns: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.urns)((c_, f_) => c_.copy(urns = f_))
    }
    final val URNS_FIELD_NUMBER = 1
    def of(
      urns: _root_.scala.Seq[_root_.scala.Predef.String]
    ): _root_.pulumirpc.resource.RegisterResourceResponse.PropertyDependencies = _root_.pulumirpc.resource.RegisterResourceResponse.PropertyDependencies(
      urns
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.RegisterResourceResponse.PropertyDependencies])
  }
  
  @SerialVersionUID(0L)
  final case class PropertyDependenciesEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Option[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies] = _root_.scala.None,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[PropertyDependenciesEntry] {
      @transient
      private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
      private[this] def __computeSerializedSize(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        if (value.isDefined) {
          val __value = value.get
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
          val __v = key
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        value.foreach { __v =>
          val __m = __v
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__m.serializedSize)
          __m.writeTo(_output__)
        };
        unknownFields.writeTo(_output__)
      }
      def withKey(__v: _root_.scala.Predef.String): PropertyDependenciesEntry = copy(key = __v)
      def getValue: pulumirpc.resource.RegisterResourceResponse.PropertyDependencies = value.getOrElse(pulumirpc.resource.RegisterResourceResponse.PropertyDependencies.defaultInstance)
      def clearValue: PropertyDependenciesEntry = copy(value = _root_.scala.None)
      def withValue(__v: pulumirpc.resource.RegisterResourceResponse.PropertyDependencies): PropertyDependenciesEntry = copy(value = Option(__v))
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry.type = pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry
      // @@protoc_insertion_point(GeneratedMessage[pulumirpc.RegisterResourceResponse.PropertyDependenciesEntry])
  }
  
  object PropertyDependenciesEntry extends scalapb.GeneratedMessageCompanion[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry] = this
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry = {
      var __key: _root_.scala.Predef.String = ""
      var __value: _root_.scala.Option[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies] = _root_.scala.None
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __key = _input__.readStringRequireUtf8()
          case 18 =>
            __value = Option(__value.fold(_root_.scalapb.LiteParser.readMessage[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry(
          key = __key,
          value = __value,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry(
          key = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = pulumirpc.resource.RegisterResourceResponse.javaDescriptor.getNestedTypes().get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = pulumirpc.resource.RegisterResourceResponse.scalaDescriptor.nestedMessages(1)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = pulumirpc.resource.RegisterResourceResponse.PropertyDependencies
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry(
      key = "",
      value = _root_.scala.None
    )
    implicit class PropertyDependenciesEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    @transient
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry, (_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies)] =
      _root_.scalapb.TypeMapper[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry, (_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies)](__m => (__m.key, __m.getValue))(__p => pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry(__p._1, Some(__p._2)))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Option[pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]
    ): _root_.pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry = _root_.pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry(
      key,
      value
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.RegisterResourceResponse.PropertyDependenciesEntry])
  }
  
  implicit class RegisterResourceResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.resource.RegisterResourceResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.resource.RegisterResourceResponse](_l) {
    def urn: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.urn)((c_, f_) => c_.copy(urn = f_))
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def `object`: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct] = field(_.getObject)((c_, f_) => c_.copy(`object` = Option(f_)))
    def optionalObject: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.struct.Struct]] = field(_.`object`)((c_, f_) => c_.copy(`object` = f_))
    def stable: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.stable)((c_, f_) => c_.copy(stable = f_))
    def stables: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.stables)((c_, f_) => c_.copy(stables = f_))
    def propertyDependencies: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]] = field(_.propertyDependencies)((c_, f_) => c_.copy(propertyDependencies = f_))
  }
  final val URN_FIELD_NUMBER = 1
  final val ID_FIELD_NUMBER = 2
  final val OBJECT_FIELD_NUMBER = 3
  final val STABLE_FIELD_NUMBER = 4
  final val STABLES_FIELD_NUMBER = 5
  final val PROPERTYDEPENDENCIES_FIELD_NUMBER = 6
  @transient
  private[resource] val _typemapper_propertyDependencies: _root_.scalapb.TypeMapper[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry, (_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies)] = implicitly[_root_.scalapb.TypeMapper[pulumirpc.resource.RegisterResourceResponse.PropertyDependenciesEntry, (_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies)]]
  def of(
    urn: _root_.scala.Predef.String,
    id: _root_.scala.Predef.String,
    `object`: _root_.scala.Option[com.google.protobuf.struct.Struct],
    stable: _root_.scala.Boolean,
    stables: _root_.scala.Seq[_root_.scala.Predef.String],
    propertyDependencies: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.resource.RegisterResourceResponse.PropertyDependencies]
  ): _root_.pulumirpc.resource.RegisterResourceResponse = _root_.pulumirpc.resource.RegisterResourceResponse(
    urn,
    id,
    `object`,
    stable,
    stables,
    propertyDependencies
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.RegisterResourceResponse])
}
