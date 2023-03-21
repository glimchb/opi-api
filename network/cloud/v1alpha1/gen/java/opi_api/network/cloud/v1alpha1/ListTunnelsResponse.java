// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * List Tunnel response
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListTunnelsResponse}
 */
public final class ListTunnelsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.ListTunnelsResponse)
    ListTunnelsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTunnelsResponse.newBuilder() to construct.
  private ListTunnelsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTunnelsResponse() {
    tunnel_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTunnelsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTunnelsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tunnel_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.Tunnel>();
              mutable_bitField0_ |= 0x00000001;
            }
            tunnel_.add(
                input.readMessage(opi_api.network.cloud.v1alpha1.Tunnel.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        tunnel_ = java.util.Collections.unmodifiableList(tunnel_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListTunnelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListTunnelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.ListTunnelsResponse.class, opi_api.network.cloud.v1alpha1.ListTunnelsResponse.Builder.class);
  }

  public static final int TUNNEL_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.cloud.v1alpha1.Tunnel> tunnel_;
  /**
   * <pre>
   * list of tunnels
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.cloud.v1alpha1.Tunnel> getTunnelList() {
    return tunnel_;
  }
  /**
   * <pre>
   * list of tunnels
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.cloud.v1alpha1.TunnelOrBuilder> 
      getTunnelOrBuilderList() {
    return tunnel_;
  }
  /**
   * <pre>
   * list of tunnels
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
   */
  @java.lang.Override
  public int getTunnelCount() {
    return tunnel_.size();
  }
  /**
   * <pre>
   * list of tunnels
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.Tunnel getTunnel(int index) {
    return tunnel_.get(index);
  }
  /**
   * <pre>
   * list of tunnels
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.TunnelOrBuilder getTunnelOrBuilder(
      int index) {
    return tunnel_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < tunnel_.size(); i++) {
      output.writeMessage(1, tunnel_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tunnel_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tunnel_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.ListTunnelsResponse)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.ListTunnelsResponse other = (opi_api.network.cloud.v1alpha1.ListTunnelsResponse) obj;

    if (!getTunnelList()
        .equals(other.getTunnelList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getTunnelCount() > 0) {
      hash = (37 * hash) + TUNNEL_FIELD_NUMBER;
      hash = (53 * hash) + getTunnelList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.ListTunnelsResponse prototype) {
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
   * List Tunnel response
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListTunnelsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.ListTunnelsResponse)
      opi_api.network.cloud.v1alpha1.ListTunnelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListTunnelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListTunnelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.ListTunnelsResponse.class, opi_api.network.cloud.v1alpha1.ListTunnelsResponse.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.ListTunnelsResponse.newBuilder()
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
        getTunnelFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tunnelBuilder_ == null) {
        tunnel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tunnelBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListTunnelsResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListTunnelsResponse getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.ListTunnelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListTunnelsResponse build() {
      opi_api.network.cloud.v1alpha1.ListTunnelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListTunnelsResponse buildPartial() {
      opi_api.network.cloud.v1alpha1.ListTunnelsResponse result = new opi_api.network.cloud.v1alpha1.ListTunnelsResponse(this);
      int from_bitField0_ = bitField0_;
      if (tunnelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tunnel_ = java.util.Collections.unmodifiableList(tunnel_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tunnel_ = tunnel_;
      } else {
        result.tunnel_ = tunnelBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.ListTunnelsResponse) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.ListTunnelsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.ListTunnelsResponse other) {
      if (other == opi_api.network.cloud.v1alpha1.ListTunnelsResponse.getDefaultInstance()) return this;
      if (tunnelBuilder_ == null) {
        if (!other.tunnel_.isEmpty()) {
          if (tunnel_.isEmpty()) {
            tunnel_ = other.tunnel_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTunnelIsMutable();
            tunnel_.addAll(other.tunnel_);
          }
          onChanged();
        }
      } else {
        if (!other.tunnel_.isEmpty()) {
          if (tunnelBuilder_.isEmpty()) {
            tunnelBuilder_.dispose();
            tunnelBuilder_ = null;
            tunnel_ = other.tunnel_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tunnelBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTunnelFieldBuilder() : null;
          } else {
            tunnelBuilder_.addAllMessages(other.tunnel_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      opi_api.network.cloud.v1alpha1.ListTunnelsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.ListTunnelsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.cloud.v1alpha1.Tunnel> tunnel_ =
      java.util.Collections.emptyList();
    private void ensureTunnelIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tunnel_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.Tunnel>(tunnel_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Tunnel, opi_api.network.cloud.v1alpha1.Tunnel.Builder, opi_api.network.cloud.v1alpha1.TunnelOrBuilder> tunnelBuilder_;

    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.Tunnel> getTunnelList() {
      if (tunnelBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tunnel_);
      } else {
        return tunnelBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public int getTunnelCount() {
      if (tunnelBuilder_ == null) {
        return tunnel_.size();
      } else {
        return tunnelBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Tunnel getTunnel(int index) {
      if (tunnelBuilder_ == null) {
        return tunnel_.get(index);
      } else {
        return tunnelBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder setTunnel(
        int index, opi_api.network.cloud.v1alpha1.Tunnel value) {
      if (tunnelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTunnelIsMutable();
        tunnel_.set(index, value);
        onChanged();
      } else {
        tunnelBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder setTunnel(
        int index, opi_api.network.cloud.v1alpha1.Tunnel.Builder builderForValue) {
      if (tunnelBuilder_ == null) {
        ensureTunnelIsMutable();
        tunnel_.set(index, builderForValue.build());
        onChanged();
      } else {
        tunnelBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder addTunnel(opi_api.network.cloud.v1alpha1.Tunnel value) {
      if (tunnelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTunnelIsMutable();
        tunnel_.add(value);
        onChanged();
      } else {
        tunnelBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder addTunnel(
        int index, opi_api.network.cloud.v1alpha1.Tunnel value) {
      if (tunnelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTunnelIsMutable();
        tunnel_.add(index, value);
        onChanged();
      } else {
        tunnelBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder addTunnel(
        opi_api.network.cloud.v1alpha1.Tunnel.Builder builderForValue) {
      if (tunnelBuilder_ == null) {
        ensureTunnelIsMutable();
        tunnel_.add(builderForValue.build());
        onChanged();
      } else {
        tunnelBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder addTunnel(
        int index, opi_api.network.cloud.v1alpha1.Tunnel.Builder builderForValue) {
      if (tunnelBuilder_ == null) {
        ensureTunnelIsMutable();
        tunnel_.add(index, builderForValue.build());
        onChanged();
      } else {
        tunnelBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder addAllTunnel(
        java.lang.Iterable<? extends opi_api.network.cloud.v1alpha1.Tunnel> values) {
      if (tunnelBuilder_ == null) {
        ensureTunnelIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tunnel_);
        onChanged();
      } else {
        tunnelBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder clearTunnel() {
      if (tunnelBuilder_ == null) {
        tunnel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tunnelBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder removeTunnel(int index) {
      if (tunnelBuilder_ == null) {
        ensureTunnelIsMutable();
        tunnel_.remove(index);
        onChanged();
      } else {
        tunnelBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Tunnel.Builder getTunnelBuilder(
        int index) {
      return getTunnelFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.TunnelOrBuilder getTunnelOrBuilder(
        int index) {
      if (tunnelBuilder_ == null) {
        return tunnel_.get(index);  } else {
        return tunnelBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public java.util.List<? extends opi_api.network.cloud.v1alpha1.TunnelOrBuilder> 
         getTunnelOrBuilderList() {
      if (tunnelBuilder_ != null) {
        return tunnelBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tunnel_);
      }
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Tunnel.Builder addTunnelBuilder() {
      return getTunnelFieldBuilder().addBuilder(
          opi_api.network.cloud.v1alpha1.Tunnel.getDefaultInstance());
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Tunnel.Builder addTunnelBuilder(
        int index) {
      return getTunnelFieldBuilder().addBuilder(
          index, opi_api.network.cloud.v1alpha1.Tunnel.getDefaultInstance());
    }
    /**
     * <pre>
     * list of tunnels
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.Tunnel.Builder> 
         getTunnelBuilderList() {
      return getTunnelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Tunnel, opi_api.network.cloud.v1alpha1.Tunnel.Builder, opi_api.network.cloud.v1alpha1.TunnelOrBuilder> 
        getTunnelFieldBuilder() {
      if (tunnelBuilder_ == null) {
        tunnelBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.Tunnel, opi_api.network.cloud.v1alpha1.Tunnel.Builder, opi_api.network.cloud.v1alpha1.TunnelOrBuilder>(
                tunnel_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tunnel_ = null;
      }
      return tunnelBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.ListTunnelsResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ListTunnelsResponse)
  private static final opi_api.network.cloud.v1alpha1.ListTunnelsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.ListTunnelsResponse();
  }

  public static opi_api.network.cloud.v1alpha1.ListTunnelsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTunnelsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTunnelsResponse>() {
    @java.lang.Override
    public ListTunnelsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTunnelsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTunnelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTunnelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.ListTunnelsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
