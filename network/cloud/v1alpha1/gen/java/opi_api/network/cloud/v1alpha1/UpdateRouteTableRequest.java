// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Update routetable request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest}
 */
public final class UpdateRouteTableRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest)
    UpdateRouteTableRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateRouteTableRequest.newBuilder() to construct.
  private UpdateRouteTableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateRouteTableRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateRouteTableRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateRouteTableRequest(
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
            opi_api.network.cloud.v1alpha1.RouteTable.Builder subBuilder = null;
            if (routetable_ != null) {
              subBuilder = routetable_.toBuilder();
            }
            routetable_ = input.readMessage(opi_api.network.cloud.v1alpha1.RouteTable.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(routetable_);
              routetable_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateRouteTableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateRouteTableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.class, opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.Builder.class);
  }

  public static final int ROUTETABLE_FIELD_NUMBER = 1;
  private opi_api.network.cloud.v1alpha1.RouteTable routetable_;
  /**
   * <pre>
   * updated routetable info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
   * @return Whether the routetable field is set.
   */
  @java.lang.Override
  public boolean hasRoutetable() {
    return routetable_ != null;
  }
  /**
   * <pre>
   * updated routetable info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
   * @return The routetable.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.RouteTable getRoutetable() {
    return routetable_ == null ? opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance() : routetable_;
  }
  /**
   * <pre>
   * updated routetable info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.RouteTableOrBuilder getRoutetableOrBuilder() {
    return getRoutetable();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (routetable_ != null) {
      output.writeMessage(1, getRoutetable());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (routetable_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRoutetable());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest other = (opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest) obj;

    if (hasRoutetable() != other.hasRoutetable()) return false;
    if (hasRoutetable()) {
      if (!getRoutetable()
          .equals(other.getRoutetable())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasRoutetable()) {
      hash = (37 * hash) + ROUTETABLE_FIELD_NUMBER;
      hash = (53 * hash) + getRoutetable().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest prototype) {
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
   * Update routetable request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest)
      opi_api.network.cloud.v1alpha1.UpdateRouteTableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateRouteTableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateRouteTableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.class, opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.newBuilder()
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
      if (routetableBuilder_ == null) {
        routetable_ = null;
      } else {
        routetable_ = null;
        routetableBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateRouteTableRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest build() {
      opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest result = new opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest(this);
      if (routetableBuilder_ == null) {
        result.routetable_ = routetable_;
      } else {
        result.routetable_ = routetableBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.getDefaultInstance()) return this;
      if (other.hasRoutetable()) {
        mergeRoutetable(other.getRoutetable());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.network.cloud.v1alpha1.RouteTable routetable_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.RouteTable, opi_api.network.cloud.v1alpha1.RouteTable.Builder, opi_api.network.cloud.v1alpha1.RouteTableOrBuilder> routetableBuilder_;
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     * @return Whether the routetable field is set.
     */
    public boolean hasRoutetable() {
      return routetableBuilder_ != null || routetable_ != null;
    }
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     * @return The routetable.
     */
    public opi_api.network.cloud.v1alpha1.RouteTable getRoutetable() {
      if (routetableBuilder_ == null) {
        return routetable_ == null ? opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance() : routetable_;
      } else {
        return routetableBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     */
    public Builder setRoutetable(opi_api.network.cloud.v1alpha1.RouteTable value) {
      if (routetableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        routetable_ = value;
        onChanged();
      } else {
        routetableBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     */
    public Builder setRoutetable(
        opi_api.network.cloud.v1alpha1.RouteTable.Builder builderForValue) {
      if (routetableBuilder_ == null) {
        routetable_ = builderForValue.build();
        onChanged();
      } else {
        routetableBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     */
    public Builder mergeRoutetable(opi_api.network.cloud.v1alpha1.RouteTable value) {
      if (routetableBuilder_ == null) {
        if (routetable_ != null) {
          routetable_ =
            opi_api.network.cloud.v1alpha1.RouteTable.newBuilder(routetable_).mergeFrom(value).buildPartial();
        } else {
          routetable_ = value;
        }
        onChanged();
      } else {
        routetableBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     */
    public Builder clearRoutetable() {
      if (routetableBuilder_ == null) {
        routetable_ = null;
        onChanged();
      } else {
        routetable_ = null;
        routetableBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.RouteTable.Builder getRoutetableBuilder() {
      
      onChanged();
      return getRoutetableFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.RouteTableOrBuilder getRoutetableOrBuilder() {
      if (routetableBuilder_ != null) {
        return routetableBuilder_.getMessageOrBuilder();
      } else {
        return routetable_ == null ?
            opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance() : routetable_;
      }
    }
    /**
     * <pre>
     * updated routetable info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.RouteTable, opi_api.network.cloud.v1alpha1.RouteTable.Builder, opi_api.network.cloud.v1alpha1.RouteTableOrBuilder> 
        getRoutetableFieldBuilder() {
      if (routetableBuilder_ == null) {
        routetableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.RouteTable, opi_api.network.cloud.v1alpha1.RouteTable.Builder, opi_api.network.cloud.v1alpha1.RouteTableOrBuilder>(
                getRoutetable(),
                getParentForChildren(),
                isClean());
        routetable_ = null;
      }
      return routetableBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest)
  private static final opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest();
  }

  public static opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRouteTableRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRouteTableRequest>() {
    @java.lang.Override
    public UpdateRouteTableRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateRouteTableRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateRouteTableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRouteTableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

