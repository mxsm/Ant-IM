// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AntMessage.proto

package com.github.mxsm.serialization.protobuf;

/**
 * Protobuf enum {@code com.github.mxsm.serialization.protobuf.CtrlMessageType}
 */
public enum CtrlMessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 连接类型
   * </pre>
   *
   * <code>CONN = 0;</code>
   */
  CONN(0),
  /**
   * <pre>
   * 关闭连接类型
   * </pre>
   *
   * <code>CLOSE = 1;</code>
   */
  CLOSE(1),
  /**
   * <pre>
   * 确认收取类型
   * </pre>
   *
   * <code>ACK = 2;</code>
   */
  ACK(2),
  /**
   * <pre>
   * 确认已读类型，预留
   * </pre>
   *
   * <code>RCV = 3;</code>
   */
  RCV(3),
  /**
   * <pre>
   * 正在输入中类型
   * </pre>
   *
   * <code>TYPING = 4;</code>
   */
  TYPING(4),
  /**
   * <pre>
   * 拨号类型
   * </pre>
   *
   * <code>DIAL = 5;</code>
   */
  DIAL(5),
  /**
   * <pre>
   * 接听类型
   * </pre>
   *
   * <code>ANSWER = 6;</code>
   */
  ANSWER(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 连接类型
   * </pre>
   *
   * <code>CONN = 0;</code>
   */
  public static final int CONN_VALUE = 0;
  /**
   * <pre>
   * 关闭连接类型
   * </pre>
   *
   * <code>CLOSE = 1;</code>
   */
  public static final int CLOSE_VALUE = 1;
  /**
   * <pre>
   * 确认收取类型
   * </pre>
   *
   * <code>ACK = 2;</code>
   */
  public static final int ACK_VALUE = 2;
  /**
   * <pre>
   * 确认已读类型，预留
   * </pre>
   *
   * <code>RCV = 3;</code>
   */
  public static final int RCV_VALUE = 3;
  /**
   * <pre>
   * 正在输入中类型
   * </pre>
   *
   * <code>TYPING = 4;</code>
   */
  public static final int TYPING_VALUE = 4;
  /**
   * <pre>
   * 拨号类型
   * </pre>
   *
   * <code>DIAL = 5;</code>
   */
  public static final int DIAL_VALUE = 5;
  /**
   * <pre>
   * 接听类型
   * </pre>
   *
   * <code>ANSWER = 6;</code>
   */
  public static final int ANSWER_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CtrlMessageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CtrlMessageType forNumber(int value) {
    switch (value) {
      case 0: return CONN;
      case 1: return CLOSE;
      case 2: return ACK;
      case 3: return RCV;
      case 4: return TYPING;
      case 5: return DIAL;
      case 6: return ANSWER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CtrlMessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CtrlMessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CtrlMessageType>() {
          public CtrlMessageType findValueByNumber(int number) {
            return CtrlMessageType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.github.mxsm.serialization.protobuf.AntMessage.getDescriptor().getEnumTypes().get(1);
  }

  private static final CtrlMessageType[] VALUES = values();

  public static CtrlMessageType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CtrlMessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.github.mxsm.serialization.protobuf.CtrlMessageType)
}

