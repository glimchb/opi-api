// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public interface ListAioControllerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListAioControllerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  java.util.List<opi_api.storage.v1.AioController> 
      getDevicesList();
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  opi_api.storage.v1.AioController getDevices(int index);
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  int getDevicesCount();
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.AioControllerOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  opi_api.storage.v1.AioControllerOrBuilder getDevicesOrBuilder(
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