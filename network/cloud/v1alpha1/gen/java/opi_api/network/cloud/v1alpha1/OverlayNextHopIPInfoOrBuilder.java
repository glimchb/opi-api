// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route.proto

package opi_api.network.cloud.v1alpha1;

public interface OverlayNextHopIPInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.OverlayNextHopIPInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * overlay nexthop IP list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress nexthop_ip = 1;</code>
   */
  java.util.List<opi_api.network.opinetcommon.v1alpha1.IPAddress> 
      getNexthopIpList();
  /**
   * <pre>
   * overlay nexthop IP list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress nexthop_ip = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getNexthopIp(int index);
  /**
   * <pre>
   * overlay nexthop IP list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress nexthop_ip = 1;</code>
   */
  int getNexthopIpCount();
  /**
   * <pre>
   * overlay nexthop IP list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress nexthop_ip = 1;</code>
   */
  java.util.List<? extends opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder> 
      getNexthopIpOrBuilderList();
  /**
   * <pre>
   * overlay nexthop IP list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress nexthop_ip = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getNexthopIpOrBuilder(
      int index);

  /**
   * <pre>
   * overlay MAC (DMAC inner) to be used when corresponding
   * to the overlay nexthop IP picked
   * </pre>
   *
   * <code>repeated bytes nexthop_mac = 2;</code>
   * @return A list containing the nexthopMac.
   */
  java.util.List<com.google.protobuf.ByteString> getNexthopMacList();
  /**
   * <pre>
   * overlay MAC (DMAC inner) to be used when corresponding
   * to the overlay nexthop IP picked
   * </pre>
   *
   * <code>repeated bytes nexthop_mac = 2;</code>
   * @return The count of nexthopMac.
   */
  int getNexthopMacCount();
  /**
   * <pre>
   * overlay MAC (DMAC inner) to be used when corresponding
   * to the overlay nexthop IP picked
   * </pre>
   *
   * <code>repeated bytes nexthop_mac = 2;</code>
   * @param index The index of the element to return.
   * @return The nexthopMac at the given index.
   */
  com.google.protobuf.ByteString getNexthopMac(int index);

  /**
   * <pre>
   * if next hop IP (e.g. a mapping entry) is in another/peer VPC, vpc_id is set
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc_id = 3;</code>
   * @return Whether the vpcId field is set.
   */
  boolean hasVpcId();
  /**
   * <pre>
   * if next hop IP (e.g. a mapping entry) is in another/peer VPC, vpc_id is set
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc_id = 3;</code>
   * @return The vpcId.
   */
  opi_api.common.v1.ObjectKey getVpcId();
  /**
   * <pre>
   * if next hop IP (e.g. a mapping entry) is in another/peer VPC, vpc_id is set
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc_id = 3;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getVpcIdOrBuilder();
}