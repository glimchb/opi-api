// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opicommon.proto

package opi_api.storage.v1;

/**
 * <pre>
 * AES encryption type to be used
 * </pre>
 *
 * Protobuf enum {@code opi_api.storage.v1.CryptoType}
 */
public enum CryptoType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CRYPTO_TYPE_UNSPECIFIED = 0;</code>
   */
  CRYPTO_TYPE_UNSPECIFIED(0),
  /**
   * <code>CRYPTO_TYPE_AES_CBC_128 = 1;</code>
   */
  CRYPTO_TYPE_AES_CBC_128(1),
  /**
   * <code>CRYPTO_TYPE_AES_CBC_192 = 2;</code>
   */
  CRYPTO_TYPE_AES_CBC_192(2),
  /**
   * <code>CRYPTO_TYPE_AES_CBC_256 = 3;</code>
   */
  CRYPTO_TYPE_AES_CBC_256(3),
  /**
   * <code>CRYPTO_TYPE_AES_XTS_128 = 4;</code>
   */
  CRYPTO_TYPE_AES_XTS_128(4),
  /**
   * <code>CRYPTO_TYPE_AES_XTS_192 = 5;</code>
   */
  CRYPTO_TYPE_AES_XTS_192(5),
  /**
   * <code>CRYPTO_TYPE_AES_XTS_256 = 6;</code>
   */
  CRYPTO_TYPE_AES_XTS_256(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CRYPTO_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int CRYPTO_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>CRYPTO_TYPE_AES_CBC_128 = 1;</code>
   */
  public static final int CRYPTO_TYPE_AES_CBC_128_VALUE = 1;
  /**
   * <code>CRYPTO_TYPE_AES_CBC_192 = 2;</code>
   */
  public static final int CRYPTO_TYPE_AES_CBC_192_VALUE = 2;
  /**
   * <code>CRYPTO_TYPE_AES_CBC_256 = 3;</code>
   */
  public static final int CRYPTO_TYPE_AES_CBC_256_VALUE = 3;
  /**
   * <code>CRYPTO_TYPE_AES_XTS_128 = 4;</code>
   */
  public static final int CRYPTO_TYPE_AES_XTS_128_VALUE = 4;
  /**
   * <code>CRYPTO_TYPE_AES_XTS_192 = 5;</code>
   */
  public static final int CRYPTO_TYPE_AES_XTS_192_VALUE = 5;
  /**
   * <code>CRYPTO_TYPE_AES_XTS_256 = 6;</code>
   */
  public static final int CRYPTO_TYPE_AES_XTS_256_VALUE = 6;


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
  public static CryptoType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CryptoType forNumber(int value) {
    switch (value) {
      case 0: return CRYPTO_TYPE_UNSPECIFIED;
      case 1: return CRYPTO_TYPE_AES_CBC_128;
      case 2: return CRYPTO_TYPE_AES_CBC_192;
      case 3: return CRYPTO_TYPE_AES_CBC_256;
      case 4: return CRYPTO_TYPE_AES_XTS_128;
      case 5: return CRYPTO_TYPE_AES_XTS_192;
      case 6: return CRYPTO_TYPE_AES_XTS_256;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CryptoType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CryptoType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CryptoType>() {
          public CryptoType findValueByNumber(int number) {
            return CryptoType.forNumber(number);
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
    return opi_api.storage.v1.OpiCommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CryptoType[] VALUES = values();

  public static CryptoType valueOf(
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

  private CryptoType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.storage.v1.CryptoType)
}
