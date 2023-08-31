// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a request to create an Nvme Path.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.CreateNvmePathRequest}
 */
public final class CreateNvmePathRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateNvmePathRequest)
    CreateNvmePathRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNvmePathRequest.newBuilder() to construct.
  private CreateNvmePathRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNvmePathRequest() {
    nvmePathId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNvmePathRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNvmePathRequest(
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
            opi_api.storage.v1.NvmePath.Builder subBuilder = null;
            if (nvmePath_ != null) {
              subBuilder = nvmePath_.toBuilder();
            }
            nvmePath_ = input.readMessage(opi_api.storage.v1.NvmePath.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nvmePath_);
              nvmePath_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nvmePathId_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmePathRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmePathRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateNvmePathRequest.class, opi_api.storage.v1.CreateNvmePathRequest.Builder.class);
  }

  public static final int NVME_PATH_FIELD_NUMBER = 1;
  private opi_api.storage.v1.NvmePath nvmePath_;
  /**
   * <pre>
   * The Nvme Path to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmePath field is set.
   */
  @java.lang.Override
  public boolean hasNvmePath() {
    return nvmePath_ != null;
  }
  /**
   * <pre>
   * The Nvme Path to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmePath.
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmePath getNvmePath() {
    return nvmePath_ == null ? opi_api.storage.v1.NvmePath.getDefaultInstance() : nvmePath_;
  }
  /**
   * <pre>
   * The Nvme Path to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmePathOrBuilder getNvmePathOrBuilder() {
    return getNvmePath();
  }

  public static final int NVME_PATH_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object nvmePathId_;
  /**
   * <pre>
   * An optional ID to assign to the Nvme Path.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_path_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nvmePathId.
   */
  @java.lang.Override
  public java.lang.String getNvmePathId() {
    java.lang.Object ref = nvmePathId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nvmePathId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional ID to assign to the Nvme Path.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_path_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nvmePathId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNvmePathIdBytes() {
    java.lang.Object ref = nvmePathId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nvmePathId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (nvmePath_ != null) {
      output.writeMessage(1, getNvmePath());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvmePathId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nvmePathId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nvmePath_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNvmePath());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvmePathId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nvmePathId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateNvmePathRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateNvmePathRequest other = (opi_api.storage.v1.CreateNvmePathRequest) obj;

    if (hasNvmePath() != other.hasNvmePath()) return false;
    if (hasNvmePath()) {
      if (!getNvmePath()
          .equals(other.getNvmePath())) return false;
    }
    if (!getNvmePathId()
        .equals(other.getNvmePathId())) return false;
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
    if (hasNvmePath()) {
      hash = (37 * hash) + NVME_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getNvmePath().hashCode();
    }
    hash = (37 * hash) + NVME_PATH_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNvmePathId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmePathRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateNvmePathRequest prototype) {
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
   * <pre>
   * Represents a request to create an Nvme Path.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.CreateNvmePathRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateNvmePathRequest)
      opi_api.storage.v1.CreateNvmePathRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmePathRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmePathRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateNvmePathRequest.class, opi_api.storage.v1.CreateNvmePathRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateNvmePathRequest.newBuilder()
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
      if (nvmePathBuilder_ == null) {
        nvmePath_ = null;
      } else {
        nvmePath_ = null;
        nvmePathBuilder_ = null;
      }
      nvmePathId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNvmePathRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmePathRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateNvmePathRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmePathRequest build() {
      opi_api.storage.v1.CreateNvmePathRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmePathRequest buildPartial() {
      opi_api.storage.v1.CreateNvmePathRequest result = new opi_api.storage.v1.CreateNvmePathRequest(this);
      if (nvmePathBuilder_ == null) {
        result.nvmePath_ = nvmePath_;
      } else {
        result.nvmePath_ = nvmePathBuilder_.build();
      }
      result.nvmePathId_ = nvmePathId_;
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
      if (other instanceof opi_api.storage.v1.CreateNvmePathRequest) {
        return mergeFrom((opi_api.storage.v1.CreateNvmePathRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateNvmePathRequest other) {
      if (other == opi_api.storage.v1.CreateNvmePathRequest.getDefaultInstance()) return this;
      if (other.hasNvmePath()) {
        mergeNvmePath(other.getNvmePath());
      }
      if (!other.getNvmePathId().isEmpty()) {
        nvmePathId_ = other.nvmePathId_;
        onChanged();
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
      opi_api.storage.v1.CreateNvmePathRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateNvmePathRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.NvmePath nvmePath_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmePath, opi_api.storage.v1.NvmePath.Builder, opi_api.storage.v1.NvmePathOrBuilder> nvmePathBuilder_;
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nvmePath field is set.
     */
    public boolean hasNvmePath() {
      return nvmePathBuilder_ != null || nvmePath_ != null;
    }
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nvmePath.
     */
    public opi_api.storage.v1.NvmePath getNvmePath() {
      if (nvmePathBuilder_ == null) {
        return nvmePath_ == null ? opi_api.storage.v1.NvmePath.getDefaultInstance() : nvmePath_;
      } else {
        return nvmePathBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvmePath(opi_api.storage.v1.NvmePath value) {
      if (nvmePathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nvmePath_ = value;
        onChanged();
      } else {
        nvmePathBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvmePath(
        opi_api.storage.v1.NvmePath.Builder builderForValue) {
      if (nvmePathBuilder_ == null) {
        nvmePath_ = builderForValue.build();
        onChanged();
      } else {
        nvmePathBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNvmePath(opi_api.storage.v1.NvmePath value) {
      if (nvmePathBuilder_ == null) {
        if (nvmePath_ != null) {
          nvmePath_ =
            opi_api.storage.v1.NvmePath.newBuilder(nvmePath_).mergeFrom(value).buildPartial();
        } else {
          nvmePath_ = value;
        }
        onChanged();
      } else {
        nvmePathBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNvmePath() {
      if (nvmePathBuilder_ == null) {
        nvmePath_ = null;
        onChanged();
      } else {
        nvmePath_ = null;
        nvmePathBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NvmePath.Builder getNvmePathBuilder() {
      
      onChanged();
      return getNvmePathFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NvmePathOrBuilder getNvmePathOrBuilder() {
      if (nvmePathBuilder_ != null) {
        return nvmePathBuilder_.getMessageOrBuilder();
      } else {
        return nvmePath_ == null ?
            opi_api.storage.v1.NvmePath.getDefaultInstance() : nvmePath_;
      }
    }
    /**
     * <pre>
     * The Nvme Path to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmePath, opi_api.storage.v1.NvmePath.Builder, opi_api.storage.v1.NvmePathOrBuilder> 
        getNvmePathFieldBuilder() {
      if (nvmePathBuilder_ == null) {
        nvmePathBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NvmePath, opi_api.storage.v1.NvmePath.Builder, opi_api.storage.v1.NvmePathOrBuilder>(
                getNvmePath(),
                getParentForChildren(),
                isClean());
        nvmePath_ = null;
      }
      return nvmePathBuilder_;
    }

    private java.lang.Object nvmePathId_ = "";
    /**
     * <pre>
     * An optional ID to assign to the Nvme Path.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_path_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The nvmePathId.
     */
    public java.lang.String getNvmePathId() {
      java.lang.Object ref = nvmePathId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nvmePathId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Path.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_path_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for nvmePathId.
     */
    public com.google.protobuf.ByteString
        getNvmePathIdBytes() {
      java.lang.Object ref = nvmePathId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nvmePathId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Path.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_path_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The nvmePathId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmePathId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nvmePathId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Path.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_path_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearNvmePathId() {
      
      nvmePathId_ = getDefaultInstance().getNvmePathId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Path.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_path_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for nvmePathId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmePathIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nvmePathId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateNvmePathRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNvmePathRequest)
  private static final opi_api.storage.v1.CreateNvmePathRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateNvmePathRequest();
  }

  public static opi_api.storage.v1.CreateNvmePathRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNvmePathRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNvmePathRequest>() {
    @java.lang.Override
    public CreateNvmePathRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNvmePathRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNvmePathRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNvmePathRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateNvmePathRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

