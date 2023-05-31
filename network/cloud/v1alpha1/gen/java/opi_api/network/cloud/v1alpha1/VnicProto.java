// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vnic.proto

package opi_api.network.cloud.v1alpha1;

public final class VnicProto {
  private VnicProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_Vnic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_Vnic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_VnicSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_VnicSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_VnicStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_VnicStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nvnic.proto\022\036opi_api.network.cloud.v1al" +
      "pha1\032\022networktypes.proto\032\031google/api/res" +
      "ource.proto\"\277\001\n\004Vnic\022\014\n\004name\030\001 \001(\t\0226\n\004sp" +
      "ec\030\002 \001(\0132(.opi_api.network.cloud.v1alpha" +
      "1.VnicSpec\022:\n\006status\030\003 \001(\0132*.opi_api.net" +
      "work.cloud.v1alpha1.VnicStatus:5\352A2\n#opi" +
      "_api.network.cloud.v1alpha1/vnic\022\013vnic/{" +
      "vnic}\"\342\006\n\010VnicSpec\022\027\n\017subnet_name_ref\030\001 " +
      "\001(\t\022@\n\nvnic_encap\030\002 \001(\0132,.opi_api.networ" +
      "k.opinetcommon.v1alpha1.Encap\022\023\n\013mac_add" +
      "ress\030\003 \001(\014\022\033\n\023source_guard_enable\030\004 \001(\010\022" +
      "B\n\014fabric_encap\030\005 \001(\0132,.opi_api.network." +
      "opinetcommon.v1alpha1.Encap\022\013\n\003vnf\030\006 \001(\010" +
      "\022+\n#ingress_v4_security_policy_name_ref\030" +
      "\007 \003(\t\022+\n#ingress_v6_security_policy_name" +
      "_ref\030\010 \003(\t\022*\n\"egress_v4_security_policy_" +
      "name_ref\030\t \003(\t\022*\n\"egress_v6_security_pol" +
      "icy_name_ref\030\n \003(\t\022\032\n\020host_if_name_ref\030\013" +
      " \001(\tH\000\022\031\n\017tunnel_name_ref\030\014 \001(\tH\000\022\024\n\014max" +
      "_sessions\030\r \001(\005\022\032\n\022public_mac_address\030\016 " +
      "\001(\014\022\035\n\025allow_internet_access\030\017 \001(\010\022\017\n\007ma" +
      "x_cps\030\020 \001(\005\022\021\n\tcps_burst\030\021 \001(\005\022\035\n\025primar" +
      "y_vnic_name_ref\030\022 \001(\t\022\037\n\027v4_route_table_" +
      "name_ref\030\023 \001(\t\022\037\n\027v6_route_table_name_re" +
      "f\030\024 \001(\t\022D\n\nservice_ip\030\025 \001(\01320.opi_api.ne" +
      "twork.opinetcommon.v1alpha1.IPAddress\022\030\n" +
      "\020max_tcp_sessions\030\026 \001(\005\022\030\n\020max_udp_sessi" +
      "ons\030\027 \001(\005\022\031\n\021max_icmp_sessions\030\030 \001(\005\022\032\n\022" +
      "max_other_sessions\030\031 \001(\005B\010\n\006ifinfo\"\234\002\n\nV" +
      "nicStatus\022\035\n\025max_session_limit_hit\030\r \001(\010" +
      "\022!\n\031max_tcp_session_limit_hit\030\016 \001(\010\022!\n\031m" +
      "ax_udp_session_limit_hit\030\017 \001(\010\022\"\n\032max_ic" +
      "mp_session_limit_hit\030\020 \001(\010\022#\n\033max_other_" +
      "session_limit_hit\030\021 \001(\010\022\016\n\006hw_idx\030\001 \001(\005\022" +
      "\026\n\016nexthop_hw_idx\030\002 \001(\005\022\027\n\017cps_copp_hw_i" +
      "dx\030\n \001(\005\022\037\n\027secondary_vnic_name_ref\030\013 \001(" +
      "\tBj\n\036opi_api.network.cloud.v1alpha1B\tVni" +
      "cProtoP\001Z;github.com/opiproject/opi-api/" +
      "network/cloud/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_opi_api_network_cloud_v1alpha1_Vnic_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_cloud_v1alpha1_Vnic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_Vnic_descriptor,
        new java.lang.String[] { "Name", "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_VnicSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_cloud_v1alpha1_VnicSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_VnicSpec_descriptor,
        new java.lang.String[] { "SubnetNameRef", "VnicEncap", "MacAddress", "SourceGuardEnable", "FabricEncap", "Vnf", "IngressV4SecurityPolicyNameRef", "IngressV6SecurityPolicyNameRef", "EgressV4SecurityPolicyNameRef", "EgressV6SecurityPolicyNameRef", "HostIfNameRef", "TunnelNameRef", "MaxSessions", "PublicMacAddress", "AllowInternetAccess", "MaxCps", "CpsBurst", "PrimaryVnicNameRef", "V4RouteTableNameRef", "V6RouteTableNameRef", "ServiceIp", "MaxTcpSessions", "MaxUdpSessions", "MaxIcmpSessions", "MaxOtherSessions", "Ifinfo", });
    internal_static_opi_api_network_cloud_v1alpha1_VnicStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_cloud_v1alpha1_VnicStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_VnicStatus_descriptor,
        new java.lang.String[] { "MaxSessionLimitHit", "MaxTcpSessionLimitHit", "MaxUdpSessionLimitHit", "MaxIcmpSessionLimitHit", "MaxOtherSessionLimitHit", "HwIdx", "NexthopHwIdx", "CpsCoppHwIdx", "SecondaryVnicNameRef", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
