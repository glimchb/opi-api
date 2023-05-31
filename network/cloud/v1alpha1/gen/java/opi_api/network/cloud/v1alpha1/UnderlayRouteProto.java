// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: underlayroute.proto

package opi_api.network.cloud.v1alpha1;

public final class UnderlayRouteProto {
  private UnderlayRouteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRoute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_UnderlayRoute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteLookupKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteLookupKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023underlayroute.proto\022\036opi_api.network.c" +
      "loud.v1alpha1\032\022networktypes.proto\032\031googl" +
      "e/api/resource.proto\"\366\001\n\rUnderlayRoute\022\014" +
      "\n\004name\030\001 \001(\t\022?\n\004spec\030\002 \001(\01321.opi_api.net" +
      "work.cloud.v1alpha1.UnderlayRouteSpec\022C\n" +
      "\006status\030\003 \001(\01323.opi_api.network.cloud.v1" +
      "alpha1.UnderlayRouteStatus:Q\352AN\n,opi_api" +
      ".network.cloud.v1alpha1/underlayroute\022\036u" +
      "nderlayroutes/{underlayroute}\"\324\002\n\021Underl" +
      "ayRouteSpec\022\034\n\024route_table_name_ref\030\001 \001(" +
      "\t\022D\n\013dest_prefix\030\002 \001(\0132/.opi_api.network" +
      ".opinetcommon.v1alpha1.IPPrefix\022J\n\020next_" +
      "hop_address\030\003 \001(\01320.opi_api.network.opin" +
      "etcommon.v1alpha1.IPAddress\022@\n\005state\030\004 \001" +
      "(\01621.opi_api.network.opinetcommon.v1alph" +
      "a1.AdminState\022\035\n\025enable_admin_distance\030\005" +
      " \001(\010\022\022\n\nadmin_dist\030\006 \001(\005\022\032\n\022interface_na" +
      "me_ref\030\007 \001(\t\"\267\003\n\023UnderlayRouteStatus\022\034\n\024" +
      "route_table_name_ref\030\001 \001(\005\022D\n\013dest_prefi" +
      "x\030\002 \001(\0132/.opi_api.network.opinetcommon.v" +
      "1alpha1.IPPrefix\022J\n\020next_hop_address\030\003 \001" +
      "(\01320.opi_api.network.opinetcommon.v1alph" +
      "a1.IPAddress\022\020\n\010if_index\030\005 \001(\005\022>\n\004type\030\006" +
      " \001(\01620.opi_api.network.opinetcommon.v1al" +
      "pha1.RouteType\022C\n\005proto\030\007 \001(\01624.opi_api." +
      "network.opinetcommon.v1alpha1.RouteProto" +
      "col\022\013\n\003age\030\010 \001(\005\022\016\n\006metric\030\t \001(\005\022\021\n\tfib_" +
      "route\030\n \001(\010\022\021\n\tconnected\030\013 \001(\010\022\026\n\016admin_" +
      "distance\030\014 \001(\005\"\233\002\n\026UnderlayRouteLookupKe" +
      "y\022\034\n\024route_table_name_ref\030\001 \001(\t\022D\n\013dest_" +
      "prefix\030\002 \001(\0132/.opi_api.network.opinetcom" +
      "mon.v1alpha1.IPPrefix\022J\n\020next_hop_addres" +
      "s\030\003 \001(\01320.opi_api.network.opinetcommon.v" +
      "1alpha1.IPAddress\022\014\n\004ifid\030\004 \001(\005\022C\n\005proto" +
      "\030\006 \001(\01624.opi_api.network.opinetcommon.v1" +
      "alpha1.RouteProtocolBs\n\036opi_api.network." +
      "cloud.v1alpha1B\022UnderlayRouteProtoP\001Z;gi" +
      "thub.com/opiproject/opi-api/network/clou" +
      "d/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRoute_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRoute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_UnderlayRoute_descriptor,
        new java.lang.String[] { "Name", "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteSpec_descriptor,
        new java.lang.String[] { "RouteTableNameRef", "DestPrefix", "NextHopAddress", "State", "EnableAdminDistance", "AdminDist", "InterfaceNameRef", });
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteStatus_descriptor,
        new java.lang.String[] { "RouteTableNameRef", "DestPrefix", "NextHopAddress", "IfIndex", "Type", "Proto", "Age", "Metric", "FibRoute", "Connected", "AdminDistance", });
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteLookupKey_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteLookupKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_UnderlayRouteLookupKey_descriptor,
        new java.lang.String[] { "RouteTableNameRef", "DestPrefix", "NextHopAddress", "Ifid", "Proto", });
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
