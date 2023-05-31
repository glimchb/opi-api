// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * BGP configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.BgpSpec}
 */
public final class BgpSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.BgpSpec)
    BgpSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BgpSpec.newBuilder() to construct.
  private BgpSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BgpSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BgpSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BgpSpec(
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

            localAsn_ = input.readUInt32();
            break;
          }
          case 21: {

            routerId_ = input.readFixed32();
            break;
          }
          case 29: {

            clusterId_ = input.readFixed32();
            break;
          }
          case 32: {

            disable_ = input.readBool();
            break;
          }
          case 40: {

            suppressDefaultResolution_ = input.readBool();
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
    return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BgpSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BgpSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.BgpSpec.class, opi_api.network.cloud.v1alpha1.BgpSpec.Builder.class);
  }

  public static final int LOCAL_ASN_FIELD_NUMBER = 1;
  private int localAsn_;
  /**
   * <pre>
   * the local autonomous system number
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: must use uint32 per BGP spec. --)
   * </pre>
   *
   * <code>uint32 local_asn = 1;</code>
   * @return The localAsn.
   */
  @java.lang.Override
  public int getLocalAsn() {
    return localAsn_;
  }

  public static final int ROUTER_ID_FIELD_NUMBER = 2;
  private int routerId_;
  /**
   * <pre>
   * router ID for this bgp instance
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: must use fixed32 per BGP spec. --)
   * </pre>
   *
   * <code>fixed32 router_id = 2;</code>
   * @return The routerId.
   */
  @java.lang.Override
  public int getRouterId() {
    return routerId_;
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 3;
  private int clusterId_;
  /**
   * <pre>
   * cluster ID of the local router. router ID will be used as cluster ID
   * if cluster ID is not configured or configured to zero
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: must use fixed32 per BGP spec. --)
   * </pre>
   *
   * <code>fixed32 cluster_id = 3;</code>
   * @return The clusterId.
   */
  @java.lang.Override
  public int getClusterId() {
    return clusterId_;
  }

  public static final int DISABLE_FIELD_NUMBER = 4;
  private boolean disable_;
  /**
   * <pre>
   * disable/enable BGP
   * </pre>
   *
   * <code>bool disable = 4;</code>
   * @return The disable.
   */
  @java.lang.Override
  public boolean getDisable() {
    return disable_;
  }

  public static final int SUPPRESS_DEFAULT_RESOLUTION_FIELD_NUMBER = 5;
  private boolean suppressDefaultResolution_;
  /**
   * <pre>
   * exclude default route from being used to resolve nexthop reachability in the underlay
   * changing this will deactivate and activate the routing stack RIB
   * </pre>
   *
   * <code>bool suppress_default_resolution = 5;</code>
   * @return The suppressDefaultResolution.
   */
  @java.lang.Override
  public boolean getSuppressDefaultResolution() {
    return suppressDefaultResolution_;
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
    if (localAsn_ != 0) {
      output.writeUInt32(1, localAsn_);
    }
    if (routerId_ != 0) {
      output.writeFixed32(2, routerId_);
    }
    if (clusterId_ != 0) {
      output.writeFixed32(3, clusterId_);
    }
    if (disable_ != false) {
      output.writeBool(4, disable_);
    }
    if (suppressDefaultResolution_ != false) {
      output.writeBool(5, suppressDefaultResolution_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (localAsn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, localAsn_);
    }
    if (routerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed32Size(2, routerId_);
    }
    if (clusterId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed32Size(3, clusterId_);
    }
    if (disable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, disable_);
    }
    if (suppressDefaultResolution_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, suppressDefaultResolution_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.BgpSpec)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.BgpSpec other = (opi_api.network.cloud.v1alpha1.BgpSpec) obj;

    if (getLocalAsn()
        != other.getLocalAsn()) return false;
    if (getRouterId()
        != other.getRouterId()) return false;
    if (getClusterId()
        != other.getClusterId()) return false;
    if (getDisable()
        != other.getDisable()) return false;
    if (getSuppressDefaultResolution()
        != other.getSuppressDefaultResolution()) return false;
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
    hash = (37 * hash) + LOCAL_ASN_FIELD_NUMBER;
    hash = (53 * hash) + getLocalAsn();
    hash = (37 * hash) + ROUTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRouterId();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId();
    hash = (37 * hash) + DISABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisable());
    hash = (37 * hash) + SUPPRESS_DEFAULT_RESOLUTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuppressDefaultResolution());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BgpSpec parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.BgpSpec prototype) {
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
   * BGP configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.BgpSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.BgpSpec)
      opi_api.network.cloud.v1alpha1.BgpSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BgpSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BgpSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.BgpSpec.class, opi_api.network.cloud.v1alpha1.BgpSpec.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.BgpSpec.newBuilder()
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
      localAsn_ = 0;

      routerId_ = 0;

      clusterId_ = 0;

      disable_ = false;

      suppressDefaultResolution_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BgpSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BgpSpec getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.BgpSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BgpSpec build() {
      opi_api.network.cloud.v1alpha1.BgpSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BgpSpec buildPartial() {
      opi_api.network.cloud.v1alpha1.BgpSpec result = new opi_api.network.cloud.v1alpha1.BgpSpec(this);
      result.localAsn_ = localAsn_;
      result.routerId_ = routerId_;
      result.clusterId_ = clusterId_;
      result.disable_ = disable_;
      result.suppressDefaultResolution_ = suppressDefaultResolution_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.BgpSpec) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.BgpSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.BgpSpec other) {
      if (other == opi_api.network.cloud.v1alpha1.BgpSpec.getDefaultInstance()) return this;
      if (other.getLocalAsn() != 0) {
        setLocalAsn(other.getLocalAsn());
      }
      if (other.getRouterId() != 0) {
        setRouterId(other.getRouterId());
      }
      if (other.getClusterId() != 0) {
        setClusterId(other.getClusterId());
      }
      if (other.getDisable() != false) {
        setDisable(other.getDisable());
      }
      if (other.getSuppressDefaultResolution() != false) {
        setSuppressDefaultResolution(other.getSuppressDefaultResolution());
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
      opi_api.network.cloud.v1alpha1.BgpSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.BgpSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int localAsn_ ;
    /**
     * <pre>
     * the local autonomous system number
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use uint32 per BGP spec. --)
     * </pre>
     *
     * <code>uint32 local_asn = 1;</code>
     * @return The localAsn.
     */
    @java.lang.Override
    public int getLocalAsn() {
      return localAsn_;
    }
    /**
     * <pre>
     * the local autonomous system number
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use uint32 per BGP spec. --)
     * </pre>
     *
     * <code>uint32 local_asn = 1;</code>
     * @param value The localAsn to set.
     * @return This builder for chaining.
     */
    public Builder setLocalAsn(int value) {
      
      localAsn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the local autonomous system number
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use uint32 per BGP spec. --)
     * </pre>
     *
     * <code>uint32 local_asn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalAsn() {
      
      localAsn_ = 0;
      onChanged();
      return this;
    }

    private int routerId_ ;
    /**
     * <pre>
     * router ID for this bgp instance
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use fixed32 per BGP spec. --)
     * </pre>
     *
     * <code>fixed32 router_id = 2;</code>
     * @return The routerId.
     */
    @java.lang.Override
    public int getRouterId() {
      return routerId_;
    }
    /**
     * <pre>
     * router ID for this bgp instance
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use fixed32 per BGP spec. --)
     * </pre>
     *
     * <code>fixed32 router_id = 2;</code>
     * @param value The routerId to set.
     * @return This builder for chaining.
     */
    public Builder setRouterId(int value) {
      
      routerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * router ID for this bgp instance
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use fixed32 per BGP spec. --)
     * </pre>
     *
     * <code>fixed32 router_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRouterId() {
      
      routerId_ = 0;
      onChanged();
      return this;
    }

    private int clusterId_ ;
    /**
     * <pre>
     * cluster ID of the local router. router ID will be used as cluster ID
     * if cluster ID is not configured or configured to zero
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use fixed32 per BGP spec. --)
     * </pre>
     *
     * <code>fixed32 cluster_id = 3;</code>
     * @return The clusterId.
     */
    @java.lang.Override
    public int getClusterId() {
      return clusterId_;
    }
    /**
     * <pre>
     * cluster ID of the local router. router ID will be used as cluster ID
     * if cluster ID is not configured or configured to zero
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use fixed32 per BGP spec. --)
     * </pre>
     *
     * <code>fixed32 cluster_id = 3;</code>
     * @param value The clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterId(int value) {
      
      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * cluster ID of the local router. router ID will be used as cluster ID
     * if cluster ID is not configured or configured to zero
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: must use fixed32 per BGP spec. --)
     * </pre>
     *
     * <code>fixed32 cluster_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearClusterId() {
      
      clusterId_ = 0;
      onChanged();
      return this;
    }

    private boolean disable_ ;
    /**
     * <pre>
     * disable/enable BGP
     * </pre>
     *
     * <code>bool disable = 4;</code>
     * @return The disable.
     */
    @java.lang.Override
    public boolean getDisable() {
      return disable_;
    }
    /**
     * <pre>
     * disable/enable BGP
     * </pre>
     *
     * <code>bool disable = 4;</code>
     * @param value The disable to set.
     * @return This builder for chaining.
     */
    public Builder setDisable(boolean value) {
      
      disable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * disable/enable BGP
     * </pre>
     *
     * <code>bool disable = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisable() {
      
      disable_ = false;
      onChanged();
      return this;
    }

    private boolean suppressDefaultResolution_ ;
    /**
     * <pre>
     * exclude default route from being used to resolve nexthop reachability in the underlay
     * changing this will deactivate and activate the routing stack RIB
     * </pre>
     *
     * <code>bool suppress_default_resolution = 5;</code>
     * @return The suppressDefaultResolution.
     */
    @java.lang.Override
    public boolean getSuppressDefaultResolution() {
      return suppressDefaultResolution_;
    }
    /**
     * <pre>
     * exclude default route from being used to resolve nexthop reachability in the underlay
     * changing this will deactivate and activate the routing stack RIB
     * </pre>
     *
     * <code>bool suppress_default_resolution = 5;</code>
     * @param value The suppressDefaultResolution to set.
     * @return This builder for chaining.
     */
    public Builder setSuppressDefaultResolution(boolean value) {
      
      suppressDefaultResolution_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * exclude default route from being used to resolve nexthop reachability in the underlay
     * changing this will deactivate and activate the routing stack RIB
     * </pre>
     *
     * <code>bool suppress_default_resolution = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuppressDefaultResolution() {
      
      suppressDefaultResolution_ = false;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.BgpSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.BgpSpec)
  private static final opi_api.network.cloud.v1alpha1.BgpSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.BgpSpec();
  }

  public static opi_api.network.cloud.v1alpha1.BgpSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BgpSpec>
      PARSER = new com.google.protobuf.AbstractParser<BgpSpec>() {
    @java.lang.Override
    public BgpSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BgpSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BgpSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BgpSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BgpSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

