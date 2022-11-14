// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.GetCryptoRequest}
 */
public final class GetCryptoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.GetCryptoRequest)
    GetCryptoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCryptoRequest.newBuilder() to construct.
  private GetCryptoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCryptoRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCryptoRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCryptoRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (cryptoId_ != null) {
              subBuilder = cryptoId_.toBuilder();
            }
            cryptoId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cryptoId_);
              cryptoId_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_GetCryptoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_GetCryptoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.GetCryptoRequest.class, opi_api.storage.v1.GetCryptoRequest.Builder.class);
  }

  public static final int CRYPTO_ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey cryptoId_;
  /**
   * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
   * @return Whether the cryptoId field is set.
   */
  @java.lang.Override
  public boolean hasCryptoId() {
    return cryptoId_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
   * @return The cryptoId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getCryptoId() {
    return cryptoId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : cryptoId_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getCryptoIdOrBuilder() {
    return getCryptoId();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (cryptoId_ != null) {
      output.writeMessage(1, getCryptoId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cryptoId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCryptoId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.GetCryptoRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.GetCryptoRequest other = (opi_api.storage.v1.GetCryptoRequest) obj;

    if (hasCryptoId() != other.hasCryptoId()) return false;
    if (hasCryptoId()) {
      if (!getCryptoId()
          .equals(other.getCryptoId())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCryptoId()) {
      hash = (37 * hash) + CRYPTO_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCryptoId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.GetCryptoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.GetCryptoRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.GetCryptoRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opi_api.storage.v1.GetCryptoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.GetCryptoRequest)
      opi_api.storage.v1.GetCryptoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_GetCryptoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_GetCryptoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.GetCryptoRequest.class, opi_api.storage.v1.GetCryptoRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.GetCryptoRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cryptoIdBuilder_ == null) {
        cryptoId_ = null;
      } else {
        cryptoId_ = null;
        cryptoIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_GetCryptoRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.GetCryptoRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.GetCryptoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.GetCryptoRequest build() {
      opi_api.storage.v1.GetCryptoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.GetCryptoRequest buildPartial() {
      opi_api.storage.v1.GetCryptoRequest result = new opi_api.storage.v1.GetCryptoRequest(this);
      if (cryptoIdBuilder_ == null) {
        result.cryptoId_ = cryptoId_;
      } else {
        result.cryptoId_ = cryptoIdBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.GetCryptoRequest) {
        return mergeFrom((opi_api.storage.v1.GetCryptoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.GetCryptoRequest other) {
      if (other == opi_api.storage.v1.GetCryptoRequest.getDefaultInstance()) return this;
      if (other.hasCryptoId()) {
        mergeCryptoId(other.getCryptoId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.GetCryptoRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.GetCryptoRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey cryptoId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> cryptoIdBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     * @return Whether the cryptoId field is set.
     */
    public boolean hasCryptoId() {
      return cryptoIdBuilder_ != null || cryptoId_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     * @return The cryptoId.
     */
    public opi_api.common.v1.ObjectKey getCryptoId() {
      if (cryptoIdBuilder_ == null) {
        return cryptoId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : cryptoId_;
      } else {
        return cryptoIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     */
    public Builder setCryptoId(opi_api.common.v1.ObjectKey value) {
      if (cryptoIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cryptoId_ = value;
        onChanged();
      } else {
        cryptoIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     */
    public Builder setCryptoId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (cryptoIdBuilder_ == null) {
        cryptoId_ = builderForValue.build();
        onChanged();
      } else {
        cryptoIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     */
    public Builder mergeCryptoId(opi_api.common.v1.ObjectKey value) {
      if (cryptoIdBuilder_ == null) {
        if (cryptoId_ != null) {
          cryptoId_ =
            opi_api.common.v1.ObjectKey.newBuilder(cryptoId_).mergeFrom(value).buildPartial();
        } else {
          cryptoId_ = value;
        }
        onChanged();
      } else {
        cryptoIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     */
    public Builder clearCryptoId() {
      if (cryptoIdBuilder_ == null) {
        cryptoId_ = null;
        onChanged();
      } else {
        cryptoId_ = null;
        cryptoIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getCryptoIdBuilder() {
      
      onChanged();
      return getCryptoIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getCryptoIdOrBuilder() {
      if (cryptoIdBuilder_ != null) {
        return cryptoIdBuilder_.getMessageOrBuilder();
      } else {
        return cryptoId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : cryptoId_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey crypto_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getCryptoIdFieldBuilder() {
      if (cryptoIdBuilder_ == null) {
        cryptoIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getCryptoId(),
                getParentForChildren(),
                isClean());
        cryptoId_ = null;
      }
      return cryptoIdBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.GetCryptoRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetCryptoRequest)
  private static final opi_api.storage.v1.GetCryptoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.GetCryptoRequest();
  }

  public static opi_api.storage.v1.GetCryptoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCryptoRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCryptoRequest>() {
    @java.lang.Override
    public GetCryptoRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCryptoRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCryptoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCryptoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.GetCryptoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
