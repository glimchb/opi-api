// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nexthop.proto

package opi_api.network.cloud.v1alpha1;

public interface NextHopSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.NextHopSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tunnel/TEP member is used for overlay routing
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.OverlayNextHopSpec overlay_nh_info = 1;</code>
   * @return Whether the overlayNhInfo field is set.
   */
  boolean hasOverlayNhInfo();
  /**
   * <pre>
   * Tunnel/TEP member is used for overlay routing
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.OverlayNextHopSpec overlay_nh_info = 1;</code>
   * @return The overlayNhInfo.
   */
  opi_api.network.cloud.v1alpha1.OverlayNextHopSpec getOverlayNhInfo();
  /**
   * <pre>
   * Tunnel/TEP member is used for overlay routing
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.OverlayNextHopSpec overlay_nh_info = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.OverlayNextHopSpecOrBuilder getOverlayNhInfoOrBuilder();

  /**
   * <pre>
   * Underlay nexthop info is used for a resolved underlay IP
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.UnderlayNextHopSpec underlay_nh_info = 2;</code>
   * @return Whether the underlayNhInfo field is set.
   */
  boolean hasUnderlayNhInfo();
  /**
   * <pre>
   * Underlay nexthop info is used for a resolved underlay IP
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.UnderlayNextHopSpec underlay_nh_info = 2;</code>
   * @return The underlayNhInfo.
   */
  opi_api.network.cloud.v1alpha1.UnderlayNextHopSpec getUnderlayNhInfo();
  /**
   * <pre>
   * Underlay nexthop info is used for a resolved underlay IP
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.UnderlayNextHopSpec underlay_nh_info = 2;</code>
   */
  opi_api.network.cloud.v1alpha1.UnderlayNextHopSpecOrBuilder getUnderlayNhInfoOrBuilder();

  /**
   * <pre>
   * Indirectly resolve to the next hop of another IP
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.IPNextHopSpec ip_nh_info = 3;</code>
   * @return Whether the ipNhInfo field is set.
   */
  boolean hasIpNhInfo();
  /**
   * <pre>
   * Indirectly resolve to the next hop of another IP
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.IPNextHopSpec ip_nh_info = 3;</code>
   * @return The ipNhInfo.
   */
  opi_api.network.cloud.v1alpha1.IPNextHopSpec getIpNhInfo();
  /**
   * <pre>
   * Indirectly resolve to the next hop of another IP
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.IPNextHopSpec ip_nh_info = 3;</code>
   */
  opi_api.network.cloud.v1alpha1.IPNextHopSpecOrBuilder getIpNhInfoOrBuilder();

  public opi_api.network.cloud.v1alpha1.NextHopSpec.NhinfoCase getNhinfoCase();
}
