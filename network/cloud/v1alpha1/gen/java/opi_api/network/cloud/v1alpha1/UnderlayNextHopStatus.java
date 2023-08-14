// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nexthop.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * underlay next hop status
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus}
 */
public final class UnderlayNextHopStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus)
    UnderlayNextHopStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnderlayNextHopStatus.newBuilder() to construct.
  private UnderlayNextHopStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnderlayNextHopStatus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnderlayNextHopStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UnderlayNextHopStatus(
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
          case 8: {

            port_ = input.readInt32();
            break;
          }
          case 16: {

            vlan_ = input.readInt32();
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
    return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus.class, opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus.Builder.class);
  }

  public static final int PORT_FIELD_NUMBER = 1;
  private int port_;
  /**
   * <pre>
   * port
   * </pre>
   *
   * <code>int32 port = 1;</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  public static final int VLAN_FIELD_NUMBER = 2;
  private int vlan_;
  /**
   * <pre>
   * vlan
   * </pre>
   *
   * <code>int32 vlan = 2;</code>
   * @return The vlan.
   */
  @java.lang.Override
  public int getVlan() {
    return vlan_;
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
    if (port_ != 0) {
      output.writeInt32(1, port_);
    }
    if (vlan_ != 0) {
      output.writeInt32(2, vlan_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, port_);
    }
    if (vlan_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, vlan_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus other = (opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus) obj;

    if (getPort()
        != other.getPort()) return false;
    if (getVlan()
        != other.getVlan()) return false;
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
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + VLAN_FIELD_NUMBER;
    hash = (53 * hash) + getVlan();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus prototype) {
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
   * underlay next hop status
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus)
      opi_api.network.cloud.v1alpha1.UnderlayNextHopStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus.class, opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus.newBuilder()
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
      port_ = 0;

      vlan_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus build() {
      opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus buildPartial() {
      opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus result = new opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus(this);
      result.port_ = port_;
      result.vlan_ = vlan_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus other) {
      if (other == opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus.getDefaultInstance()) return this;
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (other.getVlan() != 0) {
        setVlan(other.getVlan());
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
      opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int port_ ;
    /**
     * <pre>
     * port
     * </pre>
     *
     * <code>int32 port = 1;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <pre>
     * port
     * </pre>
     *
     * <code>int32 port = 1;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * port
     * </pre>
     *
     * <code>int32 port = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private int vlan_ ;
    /**
     * <pre>
     * vlan
     * </pre>
     *
     * <code>int32 vlan = 2;</code>
     * @return The vlan.
     */
    @java.lang.Override
    public int getVlan() {
      return vlan_;
    }
    /**
     * <pre>
     * vlan
     * </pre>
     *
     * <code>int32 vlan = 2;</code>
     * @param value The vlan to set.
     * @return This builder for chaining.
     */
    public Builder setVlan(int value) {
      
      vlan_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * vlan
     * </pre>
     *
     * <code>int32 vlan = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVlan() {
      
      vlan_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus)
  private static final opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus();
  }

  public static opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnderlayNextHopStatus>
      PARSER = new com.google.protobuf.AbstractParser<UnderlayNextHopStatus>() {
    @java.lang.Override
    public UnderlayNextHopStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UnderlayNextHopStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnderlayNextHopStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnderlayNextHopStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.UnderlayNextHopStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

