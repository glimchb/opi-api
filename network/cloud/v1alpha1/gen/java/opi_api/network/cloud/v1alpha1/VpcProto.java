// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vpc.proto

package opi_api.network.cloud.v1alpha1;

public final class VpcProto {
  private VpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_Vpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_Vpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_VpcSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_VpcSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_VpcStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_VpcStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_VPCPeer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeerStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_VPCPeerStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tvpc.proto\022\036opi_api.network.cloud.v1alp" +
      "ha1\032\020object_key.proto\032\022networktypes.prot" +
      "o\"w\n\003Vpc\0225\n\004spec\030\001 \001(\0132\'.opi_api.network" +
      ".cloud.v1alpha1.VpcSpec\0229\n\006status\030\002 \001(\0132" +
      ").opi_api.network.cloud.v1alpha1.VpcStat" +
      "us\"\333\004\n\007VpcSpec\022(\n\002id\030\001 \001(\0132\034.opi_api.com" +
      "mon.v1.ObjectKey\0225\n\004type\030\002 \001(\0162\'.opi_api" +
      ".network.cloud.v1alpha1.VPCType\0227\n\021v4_ro" +
      "ute_table_id\030\003 \001(\0132\034.opi_api.common.v1.O" +
      "bjectKey\0227\n\021v6_route_table_id\030\004 \001(\0132\034.op" +
      "i_api.common.v1.ObjectKey\022C\n\035ingress_v4_" +
      "security_policy_id\030\005 \003(\0132\034.opi_api.commo" +
      "n.v1.ObjectKey\022C\n\035ingress_v6_security_po" +
      "licy_id\030\006 \003(\0132\034.opi_api.common.v1.Object" +
      "Key\022B\n\034egress_v4_security_policy_id\030\007 \003(" +
      "\0132\034.opi_api.common.v1.ObjectKey\022B\n\034egres" +
      "s_v6_security_policy_id\030\010 \003(\0132\034.opi_api." +
      "common.v1.ObjectKey\022\032\n\022virtual_router_ma" +
      "c\030\t \001(\014\022B\n\014fabric_encap\030\n \001(\0132,.opi_api." +
      "network.opinetcommon.v1alpha1.Encap\022\013\n\003t" +
      "os\030\r \001(\005\"\254\001\n\tVpcStatus\022B\n\thw_handle\030\001 \001(" +
      "\0132/.opi_api.network.opinetcommon.v1alpha" +
      "1.HwHandle\022E\n\014bd_hw_handle\030\002 \001(\0132/.opi_a" +
      "pi.network.opinetcommon.v1alpha1.HwHandl" +
      "e\022\024\n\014subnet_count\030\003 \001(\005\"\203\001\n\007VPCPeer\0229\n\004s" +
      "pec\030\001 \001(\0132+.opi_api.network.cloud.v1alph" +
      "a1.VPCPeerSpec\022=\n\006status\030\002 \001(\0132-.opi_api" +
      ".network.cloud.v1alpha1.VPCPeerStatus\"\225\001" +
      "\n\013VPCPeerSpec\022(\n\002id\030\001 \001(\0132\034.opi_api.comm" +
      "on.v1.ObjectKey\022-\n\007vpc1_id\030\002 \001(\0132\034.opi_a" +
      "pi.common.v1.ObjectKey\022-\n\007vpc2_id\030\003 \001(\0132" +
      "\034.opi_api.common.v1.ObjectKey\"\017\n\rVPCPeer" +
      "Status*e\n\007VPCType\022\030\n\024VPC_TYPE_UNSPECIFIE" +
      "D\020\000\022\025\n\021VPC_TYPE_UNDERLAY\020\001\022\023\n\017VPC_TYPE_T" +
      "ENANT\020\002\022\024\n\020VPC_TYPE_CONTROL\020\003Bi\n\036opi_api" +
      ".network.cloud.v1alpha1B\010VpcProtoP\001Z;git" +
      "hub.com/opiproject/opi-api/network/cloud" +
      "/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor(),
        });
    internal_static_opi_api_network_cloud_v1alpha1_Vpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_cloud_v1alpha1_Vpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_Vpc_descriptor,
        new java.lang.String[] { "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_VpcSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_cloud_v1alpha1_VpcSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_VpcSpec_descriptor,
        new java.lang.String[] { "Id", "Type", "V4RouteTableId", "V6RouteTableId", "IngressV4SecurityPolicyId", "IngressV6SecurityPolicyId", "EgressV4SecurityPolicyId", "EgressV6SecurityPolicyId", "VirtualRouterMac", "FabricEncap", "Tos", });
    internal_static_opi_api_network_cloud_v1alpha1_VpcStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_cloud_v1alpha1_VpcStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_VpcStatus_descriptor,
        new java.lang.String[] { "HwHandle", "BdHwHandle", "SubnetCount", });
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeer_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_VPCPeer_descriptor,
        new java.lang.String[] { "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_descriptor,
        new java.lang.String[] { "Id", "Vpc1Id", "Vpc2Id", });
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeerStatus_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_network_cloud_v1alpha1_VPCPeerStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_VPCPeerStatus_descriptor,
        new java.lang.String[] { });
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}