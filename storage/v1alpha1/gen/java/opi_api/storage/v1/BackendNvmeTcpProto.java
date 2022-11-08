// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public final class BackendNvmeTcpProto {
  private BackendNvmeTcpProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteController_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026backend_nvme_tcp.proto\022\022opi_api.storag" +
      "e.v1\"\300\002\n\024NVMfRemoteController\022\n\n\002id\030\001 \001(" +
      "\003\0225\n\006trtype\030\002 \001(\0162%.opi_api.storage.v1.N" +
      "vmeTransportType\0225\n\006adrfam\030\003 \001(\0162%.opi_a" +
      "pi.storage.v1.NvmeAddressFamily\022\016\n\006tradd" +
      "r\030\004 \001(\t\022\017\n\007trsvcid\030\005 \001(\003\022\016\n\006subnqn\030\006 \001(\t" +
      "\022\r\n\005hdgst\030\007 \001(\010\022\r\n\005ddgst\030\010 \001(\010\0224\n\tmultip" +
      "ath\030\t \001(\0162!.opi_api.storage.v1.NvmeMulti" +
      "path\022\025\n\rnum_io_queues\030\n \001(\003\022\022\n\nqueue_siz" +
      "e\030\013 \001(\003\"\\\n\"NVMfRemoteControllerConnectRe" +
      "quest\0226\n\004ctrl\030\001 \001(\0132(.opi_api.storage.v1" +
      ".NVMfRemoteController\"%\n#NVMfRemoteContr" +
      "ollerConnectResponse\"3\n%NVMfRemoteContro" +
      "llerDisconnectRequest\022\n\n\002id\030\001 \001(\003\"(\n&NVM" +
      "fRemoteControllerDisconnectResponse\".\n N" +
      "VMfRemoteControllerResetRequest\022\n\n\002id\030\001 " +
      "\001(\003\"#\n!NVMfRemoteControllerResetResponse" +
      "\"-\n\037NVMfRemoteControllerListRequest\022\n\n\002i" +
      "d\030\001 \001(\003\"Z\n NVMfRemoteControllerListRespo" +
      "nse\0226\n\004ctrl\030\001 \003(\0132(.opi_api.storage.v1.N" +
      "VMfRemoteController\",\n\036NVMfRemoteControl" +
      "lerGetRequest\022\n\n\002id\030\001 \001(\003\"Y\n\037NVMfRemoteC" +
      "ontrollerGetResponse\0226\n\004ctrl\030\001 \001(\0132(.opi" +
      "_api.storage.v1.NVMfRemoteController\".\n " +
      "NVMfRemoteControllerStatsRequest\022\n\n\002id\030\001" +
      " \001(\003\">\n!NVMfRemoteControllerStatsRespons" +
      "e\022\n\n\002id\030\001 \001(\003\022\r\n\005stats\030\002 \001(\t*\217\001\n\021NvmeTra" +
      "nsportType\022\025\n\021NVME_TRANSPORT_FC\020\000\022\027\n\023NVM" +
      "E_TRANSPORT_PCIE\020\001\022\027\n\023NVME_TRANSPORT_RDM" +
      "A\020\002\022\026\n\022NVME_TRANSPORT_TCP\020\003\022\031\n\025NVME_TRAN" +
      "SPORT_CUSTOM\020\004*\203\001\n\021NvmeAddressFamily\022\024\n\020" +
      "NVMF_ADRFAM_IPV4\020\000\022\024\n\020NVMF_ADRFAM_IPV6\020\001" +
      "\022\022\n\016NVMF_ADRFAM_IB\020\002\022\022\n\016NVMF_ADRFAM_FC\020\003" +
      "\022\032\n\026NVMF_ADRFAM_INTRA_HOST\020\004*W\n\rNvmeMult" +
      "ipath\022\025\n\021NVME_MPIO_DISABLE\020\000\022\026\n\022NVME_MPI" +
      "O_FAILOVER\020\001\022\027\n\023NVME_MPIO_MULTIPATH\020\0022\367\006" +
      "\n\033NVMfRemoteControllerService\022\220\001\n\033NVMfRe" +
      "moteControllerConnect\0226.opi_api.storage." +
      "v1.NVMfRemoteControllerConnectRequest\0327." +
      "opi_api.storage.v1.NVMfRemoteControllerC" +
      "onnectResponse\"\000\022\231\001\n\036NVMfRemoteControlle" +
      "rDisconnect\0229.opi_api.storage.v1.NVMfRem" +
      "oteControllerDisconnectRequest\032:.opi_api" +
      ".storage.v1.NVMfRemoteControllerDisconne" +
      "ctResponse\"\000\022\212\001\n\031NVMfRemoteControllerRes" +
      "et\0224.opi_api.storage.v1.NVMfRemoteContro" +
      "llerResetRequest\0325.opi_api.storage.v1.NV" +
      "MfRemoteControllerResetResponse\"\000\022\207\001\n\030NV" +
      "MfRemoteControllerList\0223.opi_api.storage" +
      ".v1.NVMfRemoteControllerListRequest\0324.op" +
      "i_api.storage.v1.NVMfRemoteControllerLis" +
      "tResponse\"\000\022\204\001\n\027NVMfRemoteControllerGet\022" +
      "2.opi_api.storage.v1.NVMfRemoteControlle" +
      "rGetRequest\0323.opi_api.storage.v1.NVMfRem" +
      "oteControllerGetResponse\"\000\022\212\001\n\031NVMfRemot" +
      "eControllerStats\0224.opi_api.storage.v1.NV" +
      "MfRemoteControllerStatsRequest\0325.opi_api" +
      ".storage.v1.NVMfRemoteControllerStatsRes" +
      "ponse\"\000Bb\n\022opi_api.storage.v1B\023BackendNv" +
      "meTcpProtoP\001Z5github.com/opiproject/opi-" +
      "api/storage/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_NVMfRemoteController_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor,
        new java.lang.String[] { "Id", "Trtype", "Adrfam", "Traddr", "Trsvcid", "Subnqn", "Hdgst", "Ddgst", "Multipath", "NumIoQueues", "QueueSize", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_descriptor,
        new java.lang.String[] { "Ctrl", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_descriptor,
        new java.lang.String[] { "Ctrl", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_descriptor,
        new java.lang.String[] { "Ctrl", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor,
        new java.lang.String[] { "Id", "Stats", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}