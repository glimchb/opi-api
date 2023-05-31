// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nexthop.proto

package opi_api.network.cloud.v1alpha1;

public final class NextHopProto {
  private NextHopProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_NextHop_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_NextHop_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_NextHopSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_NextHopSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_IPNextHopSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_IPNextHopSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_NextHopStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_NextHopStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_NextHopLookup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_NextHopLookup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_NextHopGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rnexthop.proto\022\036opi_api.network.cloud.v" +
      "1alpha1\032\022networktypes.proto\032\031google/api/" +
      "resource.proto\"\322\001\n\007NextHop\022\014\n\004name\030\001 \001(\t" +
      "\0229\n\004spec\030\002 \001(\0132+.opi_api.network.cloud.v" +
      "1alpha1.NextHopSpec\022=\n\006status\030\003 \001(\0132-.op" +
      "i_api.network.cloud.v1alpha1.NextHopStat" +
      "us:?\352A<\n&opi_api.network.cloud.v1alpha1/" +
      "nexthop\022\022nexthops/{nexthop}\"\374\001\n\013NextHopS" +
      "pec\022M\n\017overlay_nh_info\030\001 \001(\01322.opi_api.n" +
      "etwork.cloud.v1alpha1.OverlayNextHopSpec" +
      "H\000\022O\n\020underlay_nh_info\030\002 \001(\01323.opi_api.n" +
      "etwork.cloud.v1alpha1.UnderlayNextHopSpe" +
      "cH\000\022C\n\nip_nh_info\030\003 \001(\0132-.opi_api.networ" +
      "k.cloud.v1alpha1.IPNextHopSpecH\000B\010\n\006nhin" +
      "fo\"J\n\023UnderlayNextHopSpec\022\032\n\022interface_n" +
      "ame_ref\030\001 \001(\t\022\027\n\017underlay_nh_mac\030\002 \001(\014\"-" +
      "\n\022OverlayNextHopSpec\022\027\n\017tunnel_name_ref\030" +
      "\001 \001(\t\"\206\001\n\rIPNextHopSpec\022\024\n\014vpc_name_ref\030" +
      "\001 \001(\t\022D\n\nip_address\030\002 \001(\01320.opi_api.netw" +
      "ork.opinetcommon.v1alpha1.IPAddress\022\014\n\004v" +
      "lan\030\003 \001(\005\022\013\n\003mac\030\004 \001(\014\"\201\002\n\rNextHopStatus" +
      "\022B\n\thw_handle\030\001 \001(\0132/.opi_api.network.op" +
      "inetcommon.v1alpha1.HwHandle\022Q\n\020underlay" +
      "_nh_info\030\002 \001(\01325.opi_api.network.cloud.v" +
      "1alpha1.UnderlayNextHopStatusH\000\022O\n\017overl" +
      "ay_nh_info\030\003 \001(\01324.opi_api.network.cloud" +
      ".v1alpha1.OverlayNextHopStatusH\000B\010\n\006nhin" +
      "fo\"3\n\025UnderlayNextHopStatus\022\014\n\004port\030\001 \001(" +
      "\005\022\014\n\004vlan\030\002 \001(\005\"[\n\024OverlayNextHopStatus\022" +
      "C\n\ttunnel_ip\030\001 \001(\01320.opi_api.network.opi" +
      "netcommon.v1alpha1.IPAddress\"n\n\rNextHopL" +
      "ookup\022;\n\004type\030\001 \001(\0162+.opi_api.network.cl" +
      "oud.v1alpha1.NextHopTypeH\000\022\025\n\013nh_name_re" +
      "f\030\002 \001(\tH\000B\t\n\007gettype\"\360\001\n\014NextHopGroup\022\014\n" +
      "\004name\030\001 \001(\t\022>\n\004spec\030\002 \001(\01320.opi_api.netw" +
      "ork.cloud.v1alpha1.NextHopGroupSpec\022B\n\006s" +
      "tatus\030\003 \001(\01322.opi_api.network.cloud.v1al" +
      "pha1.NextHopGroupStatus:N\352AK\n+opi_api.ne" +
      "twork.cloud.v1alpha1/nexthopgroup\022\034nexth" +
      "opgroups/{nexthopgroup}\"\220\001\n\020NextHopGroup" +
      "Spec\022>\n\004type\030\001 \001(\01620.opi_api.network.clo" +
      "ud.v1alpha1.NextHopGroupType\022<\n\007members\030" +
      "\002 \003(\0132+.opi_api.network.cloud.v1alpha1.N" +
      "extHopSpec\"\230\001\n\022NextHopGroupStatus\022>\n\007mem" +
      "bers\030\001 \003(\0132-.opi_api.network.cloud.v1alp" +
      "ha1.NextHopStatus\022B\n\thw_handle\030\002 \001(\0132/.o" +
      "pi_api.network.opinetcommon.v1alpha1.HwH" +
      "andle\"~\n\022NextHopGroupLookup\022@\n\004type\030\001 \001(" +
      "\01620.opi_api.network.cloud.v1alpha1.NextH" +
      "opGroupTypeH\000\022\033\n\021nh_group_name_ref\030\002 \001(\t" +
      "H\000B\t\n\007gettype*y\n\013NextHopType\022\035\n\031NEXT_HOP" +
      "_TYPE_UNSPECIFIED\020\000\022\024\n\020NEXT_HOP_TYPE_IP\020" +
      "\001\022\032\n\026NEXT_HOP_TYPE_UNDERLAY\020\002\022\031\n\025NEXT_HO" +
      "P_TYPE_OVERLAY\020\003*\204\001\n\020NextHopGroupType\022#\n" +
      "\037NEXT_HOP_GROUP_TYPE_UNSPECIFIED\020\000\022$\n NE" +
      "XT_HOP_GROUP_TYPE_OVERLAY_ECMP\020\001\022%\n!NEXT" +
      "_HOP_GROUP_TYPE_UNDERLAY_ECMP\020\002Bm\n\036opi_a" +
      "pi.network.cloud.v1alpha1B\014NextHopProtoP" +
      "\001Z;github.com/opiproject/opi-api/network" +
      "/cloud/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_opi_api_network_cloud_v1alpha1_NextHop_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_cloud_v1alpha1_NextHop_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_NextHop_descriptor,
        new java.lang.String[] { "Name", "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_NextHopSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_cloud_v1alpha1_NextHopSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_NextHopSpec_descriptor,
        new java.lang.String[] { "OverlayNhInfo", "UnderlayNhInfo", "IpNhInfo", "Nhinfo", });
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopSpec_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopSpec_descriptor,
        new java.lang.String[] { "InterfaceNameRef", "UnderlayNhMac", });
    internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_descriptor,
        new java.lang.String[] { "TunnelNameRef", });
    internal_static_opi_api_network_cloud_v1alpha1_IPNextHopSpec_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_network_cloud_v1alpha1_IPNextHopSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_IPNextHopSpec_descriptor,
        new java.lang.String[] { "VpcNameRef", "IpAddress", "Vlan", "Mac", });
    internal_static_opi_api_network_cloud_v1alpha1_NextHopStatus_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_network_cloud_v1alpha1_NextHopStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_NextHopStatus_descriptor,
        new java.lang.String[] { "HwHandle", "UnderlayNhInfo", "OverlayNhInfo", "Nhinfo", });
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_UnderlayNextHopStatus_descriptor,
        new java.lang.String[] { "Port", "Vlan", });
    internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopStatus_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopStatus_descriptor,
        new java.lang.String[] { "TunnelIp", });
    internal_static_opi_api_network_cloud_v1alpha1_NextHopLookup_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_network_cloud_v1alpha1_NextHopLookup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_NextHopLookup_descriptor,
        new java.lang.String[] { "Type", "NhNameRef", "Gettype", });
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroup_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_NextHopGroup_descriptor,
        new java.lang.String[] { "Name", "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupSpec_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupSpec_descriptor,
        new java.lang.String[] { "Type", "Members", });
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupStatus_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupStatus_descriptor,
        new java.lang.String[] { "Members", "HwHandle", });
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_descriptor,
        new java.lang.String[] { "Type", "NhGroupNameRef", "Gettype", });
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
