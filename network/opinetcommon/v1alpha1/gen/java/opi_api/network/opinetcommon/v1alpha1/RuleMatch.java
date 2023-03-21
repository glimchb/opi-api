// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networktypes.proto

package opi_api.network.opinetcommon.v1alpha1;

/**
 * <pre>
 * rule match criteria
 * </pre>
 *
 * Protobuf type {@code opi_api.network.opinetcommon.v1alpha1.RuleMatch}
 */
public final class RuleMatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.opinetcommon.v1alpha1.RuleMatch)
    RuleMatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuleMatch.newBuilder() to construct.
  private RuleMatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuleMatch() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RuleMatch();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RuleMatch(
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
            opi_api.network.opinetcommon.v1alpha1.RuleL3Match.Builder subBuilder = null;
            if (l3Match_ != null) {
              subBuilder = l3Match_.toBuilder();
            }
            l3Match_ = input.readMessage(opi_api.network.opinetcommon.v1alpha1.RuleL3Match.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(l3Match_);
              l3Match_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.network.opinetcommon.v1alpha1.RuleL4Match.Builder subBuilder = null;
            if (l4Match_ != null) {
              subBuilder = l4Match_.toBuilder();
            }
            l4Match_ = input.readMessage(opi_api.network.opinetcommon.v1alpha1.RuleL4Match.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(l4Match_);
              l4Match_ = subBuilder.buildPartial();
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
    return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_RuleMatch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_RuleMatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.opinetcommon.v1alpha1.RuleMatch.class, opi_api.network.opinetcommon.v1alpha1.RuleMatch.Builder.class);
  }

  public static final int L3_MATCH_FIELD_NUMBER = 1;
  private opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3Match_;
  /**
   * <pre>
   * Layer 3 match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
   * @return Whether the l3Match field is set.
   */
  @java.lang.Override
  public boolean hasL3Match() {
    return l3Match_ != null;
  }
  /**
   * <pre>
   * Layer 3 match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
   * @return The l3Match.
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.RuleL3Match getL3Match() {
    return l3Match_ == null ? opi_api.network.opinetcommon.v1alpha1.RuleL3Match.getDefaultInstance() : l3Match_;
  }
  /**
   * <pre>
   * Layer 3 match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.RuleL3MatchOrBuilder getL3MatchOrBuilder() {
    return getL3Match();
  }

  public static final int L4_MATCH_FIELD_NUMBER = 2;
  private opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4Match_;
  /**
   * <pre>
   * Layer 4 match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
   * @return Whether the l4Match field is set.
   */
  @java.lang.Override
  public boolean hasL4Match() {
    return l4Match_ != null;
  }
  /**
   * <pre>
   * Layer 4 match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
   * @return The l4Match.
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.RuleL4Match getL4Match() {
    return l4Match_ == null ? opi_api.network.opinetcommon.v1alpha1.RuleL4Match.getDefaultInstance() : l4Match_;
  }
  /**
   * <pre>
   * Layer 4 match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.RuleL4MatchOrBuilder getL4MatchOrBuilder() {
    return getL4Match();
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
    if (l3Match_ != null) {
      output.writeMessage(1, getL3Match());
    }
    if (l4Match_ != null) {
      output.writeMessage(2, getL4Match());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (l3Match_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getL3Match());
    }
    if (l4Match_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getL4Match());
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
    if (!(obj instanceof opi_api.network.opinetcommon.v1alpha1.RuleMatch)) {
      return super.equals(obj);
    }
    opi_api.network.opinetcommon.v1alpha1.RuleMatch other = (opi_api.network.opinetcommon.v1alpha1.RuleMatch) obj;

    if (hasL3Match() != other.hasL3Match()) return false;
    if (hasL3Match()) {
      if (!getL3Match()
          .equals(other.getL3Match())) return false;
    }
    if (hasL4Match() != other.hasL4Match()) return false;
    if (hasL4Match()) {
      if (!getL4Match()
          .equals(other.getL4Match())) return false;
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
    if (hasL3Match()) {
      hash = (37 * hash) + L3_MATCH_FIELD_NUMBER;
      hash = (53 * hash) + getL3Match().hashCode();
    }
    if (hasL4Match()) {
      hash = (37 * hash) + L4_MATCH_FIELD_NUMBER;
      hash = (53 * hash) + getL4Match().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch parseFrom(
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
  public static Builder newBuilder(opi_api.network.opinetcommon.v1alpha1.RuleMatch prototype) {
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
   * rule match criteria
   * </pre>
   *
   * Protobuf type {@code opi_api.network.opinetcommon.v1alpha1.RuleMatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.opinetcommon.v1alpha1.RuleMatch)
      opi_api.network.opinetcommon.v1alpha1.RuleMatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_RuleMatch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_RuleMatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.opinetcommon.v1alpha1.RuleMatch.class, opi_api.network.opinetcommon.v1alpha1.RuleMatch.Builder.class);
    }

    // Construct using opi_api.network.opinetcommon.v1alpha1.RuleMatch.newBuilder()
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
      if (l3MatchBuilder_ == null) {
        l3Match_ = null;
      } else {
        l3Match_ = null;
        l3MatchBuilder_ = null;
      }
      if (l4MatchBuilder_ == null) {
        l4Match_ = null;
      } else {
        l4Match_ = null;
        l4MatchBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_RuleMatch_descriptor;
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.RuleMatch getDefaultInstanceForType() {
      return opi_api.network.opinetcommon.v1alpha1.RuleMatch.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.RuleMatch build() {
      opi_api.network.opinetcommon.v1alpha1.RuleMatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.RuleMatch buildPartial() {
      opi_api.network.opinetcommon.v1alpha1.RuleMatch result = new opi_api.network.opinetcommon.v1alpha1.RuleMatch(this);
      if (l3MatchBuilder_ == null) {
        result.l3Match_ = l3Match_;
      } else {
        result.l3Match_ = l3MatchBuilder_.build();
      }
      if (l4MatchBuilder_ == null) {
        result.l4Match_ = l4Match_;
      } else {
        result.l4Match_ = l4MatchBuilder_.build();
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
      if (other instanceof opi_api.network.opinetcommon.v1alpha1.RuleMatch) {
        return mergeFrom((opi_api.network.opinetcommon.v1alpha1.RuleMatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.opinetcommon.v1alpha1.RuleMatch other) {
      if (other == opi_api.network.opinetcommon.v1alpha1.RuleMatch.getDefaultInstance()) return this;
      if (other.hasL3Match()) {
        mergeL3Match(other.getL3Match());
      }
      if (other.hasL4Match()) {
        mergeL4Match(other.getL4Match());
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
      opi_api.network.opinetcommon.v1alpha1.RuleMatch parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.opinetcommon.v1alpha1.RuleMatch) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3Match_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.RuleL3Match, opi_api.network.opinetcommon.v1alpha1.RuleL3Match.Builder, opi_api.network.opinetcommon.v1alpha1.RuleL3MatchOrBuilder> l3MatchBuilder_;
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     * @return Whether the l3Match field is set.
     */
    public boolean hasL3Match() {
      return l3MatchBuilder_ != null || l3Match_ != null;
    }
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     * @return The l3Match.
     */
    public opi_api.network.opinetcommon.v1alpha1.RuleL3Match getL3Match() {
      if (l3MatchBuilder_ == null) {
        return l3Match_ == null ? opi_api.network.opinetcommon.v1alpha1.RuleL3Match.getDefaultInstance() : l3Match_;
      } else {
        return l3MatchBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     */
    public Builder setL3Match(opi_api.network.opinetcommon.v1alpha1.RuleL3Match value) {
      if (l3MatchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        l3Match_ = value;
        onChanged();
      } else {
        l3MatchBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     */
    public Builder setL3Match(
        opi_api.network.opinetcommon.v1alpha1.RuleL3Match.Builder builderForValue) {
      if (l3MatchBuilder_ == null) {
        l3Match_ = builderForValue.build();
        onChanged();
      } else {
        l3MatchBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     */
    public Builder mergeL3Match(opi_api.network.opinetcommon.v1alpha1.RuleL3Match value) {
      if (l3MatchBuilder_ == null) {
        if (l3Match_ != null) {
          l3Match_ =
            opi_api.network.opinetcommon.v1alpha1.RuleL3Match.newBuilder(l3Match_).mergeFrom(value).buildPartial();
        } else {
          l3Match_ = value;
        }
        onChanged();
      } else {
        l3MatchBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     */
    public Builder clearL3Match() {
      if (l3MatchBuilder_ == null) {
        l3Match_ = null;
        onChanged();
      } else {
        l3Match_ = null;
        l3MatchBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.RuleL3Match.Builder getL3MatchBuilder() {
      
      onChanged();
      return getL3MatchFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.RuleL3MatchOrBuilder getL3MatchOrBuilder() {
      if (l3MatchBuilder_ != null) {
        return l3MatchBuilder_.getMessageOrBuilder();
      } else {
        return l3Match_ == null ?
            opi_api.network.opinetcommon.v1alpha1.RuleL3Match.getDefaultInstance() : l3Match_;
      }
    }
    /**
     * <pre>
     * Layer 3 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL3Match l3_match = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.RuleL3Match, opi_api.network.opinetcommon.v1alpha1.RuleL3Match.Builder, opi_api.network.opinetcommon.v1alpha1.RuleL3MatchOrBuilder> 
        getL3MatchFieldBuilder() {
      if (l3MatchBuilder_ == null) {
        l3MatchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.opinetcommon.v1alpha1.RuleL3Match, opi_api.network.opinetcommon.v1alpha1.RuleL3Match.Builder, opi_api.network.opinetcommon.v1alpha1.RuleL3MatchOrBuilder>(
                getL3Match(),
                getParentForChildren(),
                isClean());
        l3Match_ = null;
      }
      return l3MatchBuilder_;
    }

    private opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4Match_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.RuleL4Match, opi_api.network.opinetcommon.v1alpha1.RuleL4Match.Builder, opi_api.network.opinetcommon.v1alpha1.RuleL4MatchOrBuilder> l4MatchBuilder_;
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     * @return Whether the l4Match field is set.
     */
    public boolean hasL4Match() {
      return l4MatchBuilder_ != null || l4Match_ != null;
    }
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     * @return The l4Match.
     */
    public opi_api.network.opinetcommon.v1alpha1.RuleL4Match getL4Match() {
      if (l4MatchBuilder_ == null) {
        return l4Match_ == null ? opi_api.network.opinetcommon.v1alpha1.RuleL4Match.getDefaultInstance() : l4Match_;
      } else {
        return l4MatchBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     */
    public Builder setL4Match(opi_api.network.opinetcommon.v1alpha1.RuleL4Match value) {
      if (l4MatchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        l4Match_ = value;
        onChanged();
      } else {
        l4MatchBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     */
    public Builder setL4Match(
        opi_api.network.opinetcommon.v1alpha1.RuleL4Match.Builder builderForValue) {
      if (l4MatchBuilder_ == null) {
        l4Match_ = builderForValue.build();
        onChanged();
      } else {
        l4MatchBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     */
    public Builder mergeL4Match(opi_api.network.opinetcommon.v1alpha1.RuleL4Match value) {
      if (l4MatchBuilder_ == null) {
        if (l4Match_ != null) {
          l4Match_ =
            opi_api.network.opinetcommon.v1alpha1.RuleL4Match.newBuilder(l4Match_).mergeFrom(value).buildPartial();
        } else {
          l4Match_ = value;
        }
        onChanged();
      } else {
        l4MatchBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     */
    public Builder clearL4Match() {
      if (l4MatchBuilder_ == null) {
        l4Match_ = null;
        onChanged();
      } else {
        l4Match_ = null;
        l4MatchBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.RuleL4Match.Builder getL4MatchBuilder() {
      
      onChanged();
      return getL4MatchFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.RuleL4MatchOrBuilder getL4MatchOrBuilder() {
      if (l4MatchBuilder_ != null) {
        return l4MatchBuilder_.getMessageOrBuilder();
      } else {
        return l4Match_ == null ?
            opi_api.network.opinetcommon.v1alpha1.RuleL4Match.getDefaultInstance() : l4Match_;
      }
    }
    /**
     * <pre>
     * Layer 4 match criteria
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.RuleL4Match l4_match = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.RuleL4Match, opi_api.network.opinetcommon.v1alpha1.RuleL4Match.Builder, opi_api.network.opinetcommon.v1alpha1.RuleL4MatchOrBuilder> 
        getL4MatchFieldBuilder() {
      if (l4MatchBuilder_ == null) {
        l4MatchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.opinetcommon.v1alpha1.RuleL4Match, opi_api.network.opinetcommon.v1alpha1.RuleL4Match.Builder, opi_api.network.opinetcommon.v1alpha1.RuleL4MatchOrBuilder>(
                getL4Match(),
                getParentForChildren(),
                isClean());
        l4Match_ = null;
      }
      return l4MatchBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.opinetcommon.v1alpha1.RuleMatch)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.RuleMatch)
  private static final opi_api.network.opinetcommon.v1alpha1.RuleMatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.opinetcommon.v1alpha1.RuleMatch();
  }

  public static opi_api.network.opinetcommon.v1alpha1.RuleMatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuleMatch>
      PARSER = new com.google.protobuf.AbstractParser<RuleMatch>() {
    @java.lang.Override
    public RuleMatch parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RuleMatch(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RuleMatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuleMatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.RuleMatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
