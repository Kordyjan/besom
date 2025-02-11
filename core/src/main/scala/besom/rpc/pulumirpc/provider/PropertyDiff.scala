// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package pulumirpc.provider

/** @param kind
  *   The kind of diff asdsociated with this property.
  * @param inputDiff
  *   The difference is between old and new inputs, not old and new state.
  */
@SerialVersionUID(0L)
final case class PropertyDiff(
    kind: pulumirpc.provider.PropertyDiff.Kind = pulumirpc.provider.PropertyDiff.Kind.ADD,
    inputDiff: _root_.scala.Boolean = false,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[PropertyDiff] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = kind.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value)
        }
      };
      
      {
        val __value = inputDiff
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
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
        val __v = kind.value
        if (__v != 0) {
          _output__.writeEnum(1, __v)
        }
      };
      {
        val __v = inputDiff
        if (__v != false) {
          _output__.writeBool(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withKind(__v: pulumirpc.provider.PropertyDiff.Kind): PropertyDiff = copy(kind = __v)
    def withInputDiff(__v: _root_.scala.Boolean): PropertyDiff = copy(inputDiff = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = kind.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 2 => {
          val __t = inputDiff
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(kind.scalaValueDescriptor)
        case 2 => _root_.scalapb.descriptors.PBoolean(inputDiff)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: pulumirpc.provider.PropertyDiff.type = pulumirpc.provider.PropertyDiff
    // @@protoc_insertion_point(GeneratedMessage[pulumirpc.PropertyDiff])
}

object PropertyDiff extends scalapb.GeneratedMessageCompanion[pulumirpc.provider.PropertyDiff] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.provider.PropertyDiff] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.provider.PropertyDiff = {
    var __kind: pulumirpc.provider.PropertyDiff.Kind = pulumirpc.provider.PropertyDiff.Kind.ADD
    var __inputDiff: _root_.scala.Boolean = false
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __kind = pulumirpc.provider.PropertyDiff.Kind.fromValue(_input__.readEnum())
        case 16 =>
          __inputDiff = _input__.readBool()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    pulumirpc.provider.PropertyDiff(
        kind = __kind,
        inputDiff = __inputDiff,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.provider.PropertyDiff] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      pulumirpc.provider.PropertyDiff(
        kind = pulumirpc.provider.PropertyDiff.Kind.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(pulumirpc.provider.PropertyDiff.Kind.ADD.scalaValueDescriptor).number),
        inputDiff = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ProviderProto.javaDescriptor.getMessageTypes().get(13)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ProviderProto.scalaDescriptor.messages(13)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => pulumirpc.provider.PropertyDiff.Kind
    }
  }
  lazy val defaultInstance = pulumirpc.provider.PropertyDiff(
    kind = pulumirpc.provider.PropertyDiff.Kind.ADD,
    inputDiff = false
  )
  sealed abstract class Kind(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
    type EnumType = Kind
    def isAdd: _root_.scala.Boolean = false
    def isAddReplace: _root_.scala.Boolean = false
    def isDelete: _root_.scala.Boolean = false
    def isDeleteReplace: _root_.scala.Boolean = false
    def isUpdate: _root_.scala.Boolean = false
    def isUpdateReplace: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Kind] = pulumirpc.provider.PropertyDiff.Kind
    final def asRecognized: _root_.scala.Option[pulumirpc.provider.PropertyDiff.Kind.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[pulumirpc.provider.PropertyDiff.Kind.Recognized])
  }
  
  object Kind extends _root_.scalapb.GeneratedEnumCompanion[Kind] {
    sealed trait Recognized extends Kind
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Kind] = this
    
    /** this property was added
      */
    @SerialVersionUID(0L)
    case object ADD extends Kind(0) with Kind.Recognized {
      val index = 0
      val name = "ADD"
      override def isAdd: _root_.scala.Boolean = true
    }
    
    /** this property was added, and this change requires a replace
      */
    @SerialVersionUID(0L)
    case object ADD_REPLACE extends Kind(1) with Kind.Recognized {
      val index = 1
      val name = "ADD_REPLACE"
      override def isAddReplace: _root_.scala.Boolean = true
    }
    
    /** this property was removed
      */
    @SerialVersionUID(0L)
    case object DELETE extends Kind(2) with Kind.Recognized {
      val index = 2
      val name = "DELETE"
      override def isDelete: _root_.scala.Boolean = true
    }
    
    /** this property was removed, and this change requires a replace
      */
    @SerialVersionUID(0L)
    case object DELETE_REPLACE extends Kind(3) with Kind.Recognized {
      val index = 3
      val name = "DELETE_REPLACE"
      override def isDeleteReplace: _root_.scala.Boolean = true
    }
    
    /** this property's value was changed
      */
    @SerialVersionUID(0L)
    case object UPDATE extends Kind(4) with Kind.Recognized {
      val index = 4
      val name = "UPDATE"
      override def isUpdate: _root_.scala.Boolean = true
    }
    
    /** this property's value was changed, and this change requires a replace
      */
    @SerialVersionUID(0L)
    case object UPDATE_REPLACE extends Kind(5) with Kind.Recognized {
      val index = 5
      val name = "UPDATE_REPLACE"
      override def isUpdateReplace: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends Kind(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
    lazy val values = scala.collection.immutable.Seq(ADD, ADD_REPLACE, DELETE, DELETE_REPLACE, UPDATE, UPDATE_REPLACE)
    def fromValue(__value: _root_.scala.Int): Kind = __value match {
      case 0 => ADD
      case 1 => ADD_REPLACE
      case 2 => DELETE
      case 3 => DELETE_REPLACE
      case 4 => UPDATE
      case 5 => UPDATE_REPLACE
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = pulumirpc.provider.PropertyDiff.javaDescriptor.getEnumTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = pulumirpc.provider.PropertyDiff.scalaDescriptor.enums(0)
  }
  implicit class PropertyDiffLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.provider.PropertyDiff]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.provider.PropertyDiff](_l) {
    def kind: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.provider.PropertyDiff.Kind] = field(_.kind)((c_, f_) => c_.copy(kind = f_))
    def inputDiff: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.inputDiff)((c_, f_) => c_.copy(inputDiff = f_))
  }
  final val KIND_FIELD_NUMBER = 1
  final val INPUTDIFF_FIELD_NUMBER = 2
  def of(
    kind: pulumirpc.provider.PropertyDiff.Kind,
    inputDiff: _root_.scala.Boolean
  ): _root_.pulumirpc.provider.PropertyDiff = _root_.pulumirpc.provider.PropertyDiff(
    kind,
    inputDiff
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.PropertyDiff])
}
