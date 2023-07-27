// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public interface ListAioVolumesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListAioVolumesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  java.util.List<opi_api.storage.v1.AioVolume> 
      getAioVolumesList();
  /**
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  opi_api.storage.v1.AioVolume getAioVolumes(int index);
  /**
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  int getAioVolumesCount();
  /**
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.AioVolumeOrBuilder> 
      getAioVolumesOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  opi_api.storage.v1.AioVolumeOrBuilder getAioVolumesOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}