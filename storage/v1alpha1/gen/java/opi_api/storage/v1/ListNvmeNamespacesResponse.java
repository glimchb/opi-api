// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListNvmeNamespacesResponse}
 */
public final class ListNvmeNamespacesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListNvmeNamespacesResponse)
    ListNvmeNamespacesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNvmeNamespacesResponse.newBuilder() to construct.
  private ListNvmeNamespacesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNvmeNamespacesResponse() {
    nvmeNamespaces_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNvmeNamespacesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNvmeNamespacesResponse(
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
              nvmeNamespaces_ = new java.util.ArrayList<opi_api.storage.v1.NvmeNamespace>();
              mutable_bitField0_ |= 0x00000001;
            }
            nvmeNamespaces_.add(
                input.readMessage(opi_api.storage.v1.NvmeNamespace.parser(), extensionRegistry));
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
        nvmeNamespaces_ = java.util.Collections.unmodifiableList(nvmeNamespaces_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNvmeNamespacesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNvmeNamespacesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListNvmeNamespacesResponse.class, opi_api.storage.v1.ListNvmeNamespacesResponse.Builder.class);
  }

  public static final int NVME_NAMESPACES_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.NvmeNamespace> nvmeNamespaces_;
  /**
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.NvmeNamespace> getNvmeNamespacesList() {
    return nvmeNamespaces_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.NvmeNamespaceOrBuilder> 
      getNvmeNamespacesOrBuilderList() {
    return nvmeNamespaces_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  @java.lang.Override
  public int getNvmeNamespacesCount() {
    return nvmeNamespaces_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeNamespace getNvmeNamespaces(int index) {
    return nvmeNamespaces_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeNamespaceOrBuilder getNvmeNamespacesOrBuilder(
      int index) {
    return nvmeNamespaces_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
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
    for (int i = 0; i < nvmeNamespaces_.size(); i++) {
      output.writeMessage(1, nvmeNamespaces_.get(i));
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
    for (int i = 0; i < nvmeNamespaces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nvmeNamespaces_.get(i));
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
    if (!(obj instanceof opi_api.storage.v1.ListNvmeNamespacesResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListNvmeNamespacesResponse other = (opi_api.storage.v1.ListNvmeNamespacesResponse) obj;

    if (!getNvmeNamespacesList()
        .equals(other.getNvmeNamespacesList())) return false;
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
    if (getNvmeNamespacesCount() > 0) {
      hash = (37 * hash) + NVME_NAMESPACES_FIELD_NUMBER;
      hash = (53 * hash) + getNvmeNamespacesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNvmeNamespacesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListNvmeNamespacesResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ListNvmeNamespacesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListNvmeNamespacesResponse)
      opi_api.storage.v1.ListNvmeNamespacesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNvmeNamespacesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNvmeNamespacesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListNvmeNamespacesResponse.class, opi_api.storage.v1.ListNvmeNamespacesResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListNvmeNamespacesResponse.newBuilder()
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
        getNvmeNamespacesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nvmeNamespacesBuilder_ == null) {
        nvmeNamespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nvmeNamespacesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNvmeNamespacesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNvmeNamespacesResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListNvmeNamespacesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNvmeNamespacesResponse build() {
      opi_api.storage.v1.ListNvmeNamespacesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNvmeNamespacesResponse buildPartial() {
      opi_api.storage.v1.ListNvmeNamespacesResponse result = new opi_api.storage.v1.ListNvmeNamespacesResponse(this);
      int from_bitField0_ = bitField0_;
      if (nvmeNamespacesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nvmeNamespaces_ = java.util.Collections.unmodifiableList(nvmeNamespaces_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nvmeNamespaces_ = nvmeNamespaces_;
      } else {
        result.nvmeNamespaces_ = nvmeNamespacesBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.ListNvmeNamespacesResponse) {
        return mergeFrom((opi_api.storage.v1.ListNvmeNamespacesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListNvmeNamespacesResponse other) {
      if (other == opi_api.storage.v1.ListNvmeNamespacesResponse.getDefaultInstance()) return this;
      if (nvmeNamespacesBuilder_ == null) {
        if (!other.nvmeNamespaces_.isEmpty()) {
          if (nvmeNamespaces_.isEmpty()) {
            nvmeNamespaces_ = other.nvmeNamespaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNvmeNamespacesIsMutable();
            nvmeNamespaces_.addAll(other.nvmeNamespaces_);
          }
          onChanged();
        }
      } else {
        if (!other.nvmeNamespaces_.isEmpty()) {
          if (nvmeNamespacesBuilder_.isEmpty()) {
            nvmeNamespacesBuilder_.dispose();
            nvmeNamespacesBuilder_ = null;
            nvmeNamespaces_ = other.nvmeNamespaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nvmeNamespacesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNvmeNamespacesFieldBuilder() : null;
          } else {
            nvmeNamespacesBuilder_.addAllMessages(other.nvmeNamespaces_);
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
      opi_api.storage.v1.ListNvmeNamespacesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListNvmeNamespacesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.NvmeNamespace> nvmeNamespaces_ =
      java.util.Collections.emptyList();
    private void ensureNvmeNamespacesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nvmeNamespaces_ = new java.util.ArrayList<opi_api.storage.v1.NvmeNamespace>(nvmeNamespaces_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NvmeNamespace, opi_api.storage.v1.NvmeNamespace.Builder, opi_api.storage.v1.NvmeNamespaceOrBuilder> nvmeNamespacesBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NvmeNamespace> getNvmeNamespacesList() {
      if (nvmeNamespacesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nvmeNamespaces_);
      } else {
        return nvmeNamespacesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public int getNvmeNamespacesCount() {
      if (nvmeNamespacesBuilder_ == null) {
        return nvmeNamespaces_.size();
      } else {
        return nvmeNamespacesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NvmeNamespace getNvmeNamespaces(int index) {
      if (nvmeNamespacesBuilder_ == null) {
        return nvmeNamespaces_.get(index);
      } else {
        return nvmeNamespacesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder setNvmeNamespaces(
        int index, opi_api.storage.v1.NvmeNamespace value) {
      if (nvmeNamespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvmeNamespacesIsMutable();
        nvmeNamespaces_.set(index, value);
        onChanged();
      } else {
        nvmeNamespacesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder setNvmeNamespaces(
        int index, opi_api.storage.v1.NvmeNamespace.Builder builderForValue) {
      if (nvmeNamespacesBuilder_ == null) {
        ensureNvmeNamespacesIsMutable();
        nvmeNamespaces_.set(index, builderForValue.build());
        onChanged();
      } else {
        nvmeNamespacesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder addNvmeNamespaces(opi_api.storage.v1.NvmeNamespace value) {
      if (nvmeNamespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvmeNamespacesIsMutable();
        nvmeNamespaces_.add(value);
        onChanged();
      } else {
        nvmeNamespacesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder addNvmeNamespaces(
        int index, opi_api.storage.v1.NvmeNamespace value) {
      if (nvmeNamespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvmeNamespacesIsMutable();
        nvmeNamespaces_.add(index, value);
        onChanged();
      } else {
        nvmeNamespacesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder addNvmeNamespaces(
        opi_api.storage.v1.NvmeNamespace.Builder builderForValue) {
      if (nvmeNamespacesBuilder_ == null) {
        ensureNvmeNamespacesIsMutable();
        nvmeNamespaces_.add(builderForValue.build());
        onChanged();
      } else {
        nvmeNamespacesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder addNvmeNamespaces(
        int index, opi_api.storage.v1.NvmeNamespace.Builder builderForValue) {
      if (nvmeNamespacesBuilder_ == null) {
        ensureNvmeNamespacesIsMutable();
        nvmeNamespaces_.add(index, builderForValue.build());
        onChanged();
      } else {
        nvmeNamespacesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder addAllNvmeNamespaces(
        java.lang.Iterable<? extends opi_api.storage.v1.NvmeNamespace> values) {
      if (nvmeNamespacesBuilder_ == null) {
        ensureNvmeNamespacesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nvmeNamespaces_);
        onChanged();
      } else {
        nvmeNamespacesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder clearNvmeNamespaces() {
      if (nvmeNamespacesBuilder_ == null) {
        nvmeNamespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nvmeNamespacesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public Builder removeNvmeNamespaces(int index) {
      if (nvmeNamespacesBuilder_ == null) {
        ensureNvmeNamespacesIsMutable();
        nvmeNamespaces_.remove(index);
        onChanged();
      } else {
        nvmeNamespacesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NvmeNamespace.Builder getNvmeNamespacesBuilder(
        int index) {
      return getNvmeNamespacesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NvmeNamespaceOrBuilder getNvmeNamespacesOrBuilder(
        int index) {
      if (nvmeNamespacesBuilder_ == null) {
        return nvmeNamespaces_.get(index);  } else {
        return nvmeNamespacesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.NvmeNamespaceOrBuilder> 
         getNvmeNamespacesOrBuilderList() {
      if (nvmeNamespacesBuilder_ != null) {
        return nvmeNamespacesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nvmeNamespaces_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NvmeNamespace.Builder addNvmeNamespacesBuilder() {
      return getNvmeNamespacesFieldBuilder().addBuilder(
          opi_api.storage.v1.NvmeNamespace.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NvmeNamespace.Builder addNvmeNamespacesBuilder(
        int index) {
      return getNvmeNamespacesFieldBuilder().addBuilder(
          index, opi_api.storage.v1.NvmeNamespace.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NvmeNamespace.Builder> 
         getNvmeNamespacesBuilderList() {
      return getNvmeNamespacesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NvmeNamespace, opi_api.storage.v1.NvmeNamespace.Builder, opi_api.storage.v1.NvmeNamespaceOrBuilder> 
        getNvmeNamespacesFieldBuilder() {
      if (nvmeNamespacesBuilder_ == null) {
        nvmeNamespacesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.NvmeNamespace, opi_api.storage.v1.NvmeNamespace.Builder, opi_api.storage.v1.NvmeNamespaceOrBuilder>(
                nvmeNamespaces_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nvmeNamespaces_ = null;
      }
      return nvmeNamespacesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
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
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListNvmeNamespacesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNvmeNamespacesResponse)
  private static final opi_api.storage.v1.ListNvmeNamespacesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListNvmeNamespacesResponse();
  }

  public static opi_api.storage.v1.ListNvmeNamespacesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNvmeNamespacesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNvmeNamespacesResponse>() {
    @java.lang.Override
    public ListNvmeNamespacesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListNvmeNamespacesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNvmeNamespacesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNvmeNamespacesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListNvmeNamespacesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
