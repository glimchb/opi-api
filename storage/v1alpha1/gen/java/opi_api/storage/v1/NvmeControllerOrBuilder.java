// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeControllerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeController)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.NvmeControllerSpec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <code>.opi_api.storage.v1.NvmeControllerSpec spec = 1;</code>
   * @return The spec.
   */
  opi_api.storage.v1.NvmeControllerSpec getSpec();
  /**
   * <code>.opi_api.storage.v1.NvmeControllerSpec spec = 1;</code>
   */
  opi_api.storage.v1.NvmeControllerSpecOrBuilder getSpecOrBuilder();

  /**
   * <code>.opi_api.storage.v1.NvmeControllerStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.opi_api.storage.v1.NvmeControllerStatus status = 2;</code>
   * @return The status.
   */
  opi_api.storage.v1.NvmeControllerStatus getStatus();
  /**
   * <code>.opi_api.storage.v1.NvmeControllerStatus status = 2;</code>
   */
  opi_api.storage.v1.NvmeControllerStatusOrBuilder getStatusOrBuilder();
}