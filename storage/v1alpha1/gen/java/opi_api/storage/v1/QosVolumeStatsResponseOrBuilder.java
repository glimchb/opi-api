// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

public interface QosVolumeStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.QosVolumeStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  opi_api.common.v1.ObjectKey getId();
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder();

  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   * @return The stats.
   */
  opi_api.storage.v1.VolumeStats getStats();
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   */
  opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder();
}