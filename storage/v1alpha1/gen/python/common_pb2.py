# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: common.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0c\x63ommon.proto\x12\x12opi_api.storage.v1\"^\n\x13NvmeControllerPciId\x12\x0b\n\x03\x62us\x18\x01 \x01(\x05\x12\x0e\n\x06\x64\x65vice\x18\x02 \x01(\x05\x12\x10\n\x08\x66unction\x18\x03 \x01(\x05\x12\x18\n\x10virtual_function\x18\x04 \x01(\x05\x42Z\n\x12opi_api.storage.v1B\x0b\x43ommonProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_NVMECONTROLLERPCIID = DESCRIPTOR.message_types_by_name['NvmeControllerPciId']
NvmeControllerPciId = _reflection.GeneratedProtocolMessageType('NvmeControllerPciId', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERPCIID,
  '__module__' : 'common_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NvmeControllerPciId)
  })
_sym_db.RegisterMessage(NvmeControllerPciId)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\013CommonProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _NVMECONTROLLERPCIID._serialized_start=36
  _NVMECONTROLLERPCIID._serialized_end=130
# @@protoc_insertion_point(module_scope)