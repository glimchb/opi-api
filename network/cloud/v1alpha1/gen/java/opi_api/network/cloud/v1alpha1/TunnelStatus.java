// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tunnel.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * operational status of the tunnel, if any
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.TunnelStatus}
 */
public final class TunnelStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.TunnelStatus)
    TunnelStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TunnelStatus.newBuilder() to construct.
  private TunnelStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TunnelStatus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TunnelStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TunnelStatus(
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
            opi_api.network.opinetcommon.v1alpha1.HwHandle.Builder subBuilder = null;
            if (hwHandle_ != null) {
              subBuilder = hwHandle_.toBuilder();
            }
            hwHandle_ = input.readMessage(opi_api.network.opinetcommon.v1alpha1.HwHandle.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hwHandle_);
              hwHandle_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            vnicCount_ = input.readInt32();
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
    return opi_api.network.cloud.v1alpha1.TunnelProto.internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.TunnelProto.internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.TunnelStatus.class, opi_api.network.cloud.v1alpha1.TunnelStatus.Builder.class);
  }

  public static final int HW_HANDLE_FIELD_NUMBER = 1;
  private opi_api.network.opinetcommon.v1alpha1.HwHandle hwHandle_;
  /**
   * <pre>
   * tunnel_hw_handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
   * @return Whether the hwHandle field is set.
   */
  @java.lang.Override
  public boolean hasHwHandle() {
    return hwHandle_ != null;
  }
  /**
   * <pre>
   * tunnel_hw_handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
   * @return The hwHandle.
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.HwHandle getHwHandle() {
    return hwHandle_ == null ? opi_api.network.opinetcommon.v1alpha1.HwHandle.getDefaultInstance() : hwHandle_;
  }
  /**
   * <pre>
   * tunnel_hw_handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder getHwHandleOrBuilder() {
    return getHwHandle();
  }

  public static final int VNIC_COUNT_FIELD_NUMBER = 2;
  private int vnicCount_;
  /**
   * <pre>
   * no. of vnics behind the tunnel
   * </pre>
   *
   * <code>int32 vnic_count = 2;</code>
   * @return The vnicCount.
   */
  @java.lang.Override
  public int getVnicCount() {
    return vnicCount_;
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
    if (hwHandle_ != null) {
      output.writeMessage(1, getHwHandle());
    }
    if (vnicCount_ != 0) {
      output.writeInt32(2, vnicCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hwHandle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHwHandle());
    }
    if (vnicCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, vnicCount_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.TunnelStatus)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.TunnelStatus other = (opi_api.network.cloud.v1alpha1.TunnelStatus) obj;

    if (hasHwHandle() != other.hasHwHandle()) return false;
    if (hasHwHandle()) {
      if (!getHwHandle()
          .equals(other.getHwHandle())) return false;
    }
    if (getVnicCount()
        != other.getVnicCount()) return false;
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
    if (hasHwHandle()) {
      hash = (37 * hash) + HW_HANDLE_FIELD_NUMBER;
      hash = (53 * hash) + getHwHandle().hashCode();
    }
    hash = (37 * hash) + VNIC_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getVnicCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.TunnelStatus parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.TunnelStatus prototype) {
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
   * operational status of the tunnel, if any
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.TunnelStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.TunnelStatus)
      opi_api.network.cloud.v1alpha1.TunnelStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.TunnelProto.internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.TunnelProto.internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.TunnelStatus.class, opi_api.network.cloud.v1alpha1.TunnelStatus.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.TunnelStatus.newBuilder()
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
      if (hwHandleBuilder_ == null) {
        hwHandle_ = null;
      } else {
        hwHandle_ = null;
        hwHandleBuilder_ = null;
      }
      vnicCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.TunnelProto.internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.TunnelStatus getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.TunnelStatus.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.TunnelStatus build() {
      opi_api.network.cloud.v1alpha1.TunnelStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.TunnelStatus buildPartial() {
      opi_api.network.cloud.v1alpha1.TunnelStatus result = new opi_api.network.cloud.v1alpha1.TunnelStatus(this);
      if (hwHandleBuilder_ == null) {
        result.hwHandle_ = hwHandle_;
      } else {
        result.hwHandle_ = hwHandleBuilder_.build();
      }
      result.vnicCount_ = vnicCount_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.TunnelStatus) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.TunnelStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.TunnelStatus other) {
      if (other == opi_api.network.cloud.v1alpha1.TunnelStatus.getDefaultInstance()) return this;
      if (other.hasHwHandle()) {
        mergeHwHandle(other.getHwHandle());
      }
      if (other.getVnicCount() != 0) {
        setVnicCount(other.getVnicCount());
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
      opi_api.network.cloud.v1alpha1.TunnelStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.TunnelStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.network.opinetcommon.v1alpha1.HwHandle hwHandle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.HwHandle, opi_api.network.opinetcommon.v1alpha1.HwHandle.Builder, opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder> hwHandleBuilder_;
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     * @return Whether the hwHandle field is set.
     */
    public boolean hasHwHandle() {
      return hwHandleBuilder_ != null || hwHandle_ != null;
    }
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     * @return The hwHandle.
     */
    public opi_api.network.opinetcommon.v1alpha1.HwHandle getHwHandle() {
      if (hwHandleBuilder_ == null) {
        return hwHandle_ == null ? opi_api.network.opinetcommon.v1alpha1.HwHandle.getDefaultInstance() : hwHandle_;
      } else {
        return hwHandleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     */
    public Builder setHwHandle(opi_api.network.opinetcommon.v1alpha1.HwHandle value) {
      if (hwHandleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hwHandle_ = value;
        onChanged();
      } else {
        hwHandleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     */
    public Builder setHwHandle(
        opi_api.network.opinetcommon.v1alpha1.HwHandle.Builder builderForValue) {
      if (hwHandleBuilder_ == null) {
        hwHandle_ = builderForValue.build();
        onChanged();
      } else {
        hwHandleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     */
    public Builder mergeHwHandle(opi_api.network.opinetcommon.v1alpha1.HwHandle value) {
      if (hwHandleBuilder_ == null) {
        if (hwHandle_ != null) {
          hwHandle_ =
            opi_api.network.opinetcommon.v1alpha1.HwHandle.newBuilder(hwHandle_).mergeFrom(value).buildPartial();
        } else {
          hwHandle_ = value;
        }
        onChanged();
      } else {
        hwHandleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     */
    public Builder clearHwHandle() {
      if (hwHandleBuilder_ == null) {
        hwHandle_ = null;
        onChanged();
      } else {
        hwHandle_ = null;
        hwHandleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.HwHandle.Builder getHwHandleBuilder() {
      
      onChanged();
      return getHwHandleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder getHwHandleOrBuilder() {
      if (hwHandleBuilder_ != null) {
        return hwHandleBuilder_.getMessageOrBuilder();
      } else {
        return hwHandle_ == null ?
            opi_api.network.opinetcommon.v1alpha1.HwHandle.getDefaultInstance() : hwHandle_;
      }
    }
    /**
     * <pre>
     * tunnel_hw_handle
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.HwHandle, opi_api.network.opinetcommon.v1alpha1.HwHandle.Builder, opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder> 
        getHwHandleFieldBuilder() {
      if (hwHandleBuilder_ == null) {
        hwHandleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.opinetcommon.v1alpha1.HwHandle, opi_api.network.opinetcommon.v1alpha1.HwHandle.Builder, opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder>(
                getHwHandle(),
                getParentForChildren(),
                isClean());
        hwHandle_ = null;
      }
      return hwHandleBuilder_;
    }

    private int vnicCount_ ;
    /**
     * <pre>
     * no. of vnics behind the tunnel
     * </pre>
     *
     * <code>int32 vnic_count = 2;</code>
     * @return The vnicCount.
     */
    @java.lang.Override
    public int getVnicCount() {
      return vnicCount_;
    }
    /**
     * <pre>
     * no. of vnics behind the tunnel
     * </pre>
     *
     * <code>int32 vnic_count = 2;</code>
     * @param value The vnicCount to set.
     * @return This builder for chaining.
     */
    public Builder setVnicCount(int value) {
      
      vnicCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * no. of vnics behind the tunnel
     * </pre>
     *
     * <code>int32 vnic_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVnicCount() {
      
      vnicCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.TunnelStatus)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.TunnelStatus)
  private static final opi_api.network.cloud.v1alpha1.TunnelStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.TunnelStatus();
  }

  public static opi_api.network.cloud.v1alpha1.TunnelStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TunnelStatus>
      PARSER = new com.google.protobuf.AbstractParser<TunnelStatus>() {
    @java.lang.Override
    public TunnelStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TunnelStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TunnelStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TunnelStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.TunnelStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

