// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package pulumirpc.provider

/** @param urn
  *   the Pulumi URN for this resource.
  * @param olds
  *   the old Pulumi inputs for this resource, if any.
  * @param news
  *   the new Pulumi inputs for this resource.
  * @param sequenceNumber
  *   the sequence number for this resource, or 0 if sequence is unknown.
  */
@SerialVersionUID(0L)
final case class CheckRequest(
    urn: _root_.scala.Predef.String = "",
    olds: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None,
    news: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None,
    sequenceNumber: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[CheckRequest] {
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
      if (olds.isDefined) {
        val __value = olds.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (news.isDefined) {
        val __value = news.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = sequenceNumber
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(4, __value)
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
        val __v = urn
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      olds.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      news.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = sequenceNumber
        if (__v != 0) {
          _output__.writeInt32(4, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withUrn(__v: _root_.scala.Predef.String): CheckRequest = copy(urn = __v)
    def getOlds: com.google.protobuf.struct.Struct = olds.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)
    def clearOlds: CheckRequest = copy(olds = _root_.scala.None)
    def withOlds(__v: com.google.protobuf.struct.Struct): CheckRequest = copy(olds = Option(__v))
    def getNews: com.google.protobuf.struct.Struct = news.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)
    def clearNews: CheckRequest = copy(news = _root_.scala.None)
    def withNews(__v: com.google.protobuf.struct.Struct): CheckRequest = copy(news = Option(__v))
    def withSequenceNumber(__v: _root_.scala.Int): CheckRequest = copy(sequenceNumber = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = urn
          if (__t != "") __t else null
        }
        case 2 => olds.orNull
        case 3 => news.orNull
        case 4 => {
          val __t = sequenceNumber
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(urn)
        case 2 => olds.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => news.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => _root_.scalapb.descriptors.PInt(sequenceNumber)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: pulumirpc.provider.CheckRequest.type = pulumirpc.provider.CheckRequest
    // @@protoc_insertion_point(GeneratedMessage[pulumirpc.CheckRequest])
}

object CheckRequest extends scalapb.GeneratedMessageCompanion[pulumirpc.provider.CheckRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.provider.CheckRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.provider.CheckRequest = {
    var __urn: _root_.scala.Predef.String = ""
    var __olds: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None
    var __news: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None
    var __sequenceNumber: _root_.scala.Int = 0
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __urn = _input__.readStringRequireUtf8()
        case 18 =>
          __olds = Option(__olds.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.struct.Struct](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 26 =>
          __news = Option(__news.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.struct.Struct](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 32 =>
          __sequenceNumber = _input__.readInt32()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    pulumirpc.provider.CheckRequest(
        urn = __urn,
        olds = __olds,
        news = __news,
        sequenceNumber = __sequenceNumber,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.provider.CheckRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      pulumirpc.provider.CheckRequest(
        urn = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        olds = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.Struct]]),
        news = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.Struct]]),
        sequenceNumber = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ProviderProto.javaDescriptor.getMessageTypes().get(9)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ProviderProto.scalaDescriptor.messages(9)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.struct.Struct
      case 3 => __out = com.google.protobuf.struct.Struct
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = pulumirpc.provider.CheckRequest(
    urn = "",
    olds = _root_.scala.None,
    news = _root_.scala.None,
    sequenceNumber = 0
  )
  implicit class CheckRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.provider.CheckRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.provider.CheckRequest](_l) {
    def urn: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.urn)((c_, f_) => c_.copy(urn = f_))
    def olds: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct] = field(_.getOlds)((c_, f_) => c_.copy(olds = Option(f_)))
    def optionalOlds: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.struct.Struct]] = field(_.olds)((c_, f_) => c_.copy(olds = f_))
    def news: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct] = field(_.getNews)((c_, f_) => c_.copy(news = Option(f_)))
    def optionalNews: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.struct.Struct]] = field(_.news)((c_, f_) => c_.copy(news = f_))
    def sequenceNumber: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.sequenceNumber)((c_, f_) => c_.copy(sequenceNumber = f_))
  }
  final val URN_FIELD_NUMBER = 1
  final val OLDS_FIELD_NUMBER = 2
  final val NEWS_FIELD_NUMBER = 3
  final val SEQUENCENUMBER_FIELD_NUMBER = 4
  def of(
    urn: _root_.scala.Predef.String,
    olds: _root_.scala.Option[com.google.protobuf.struct.Struct],
    news: _root_.scala.Option[com.google.protobuf.struct.Struct],
    sequenceNumber: _root_.scala.Int
  ): _root_.pulumirpc.provider.CheckRequest = _root_.pulumirpc.provider.CheckRequest(
    urn,
    olds,
    news,
    sequenceNumber
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.CheckRequest])
}
