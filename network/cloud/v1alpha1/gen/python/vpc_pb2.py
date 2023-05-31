# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: vpc.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\tvpc.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x12networktypes.proto\x1a\x19google/api/resource.proto\"\xba\x01\n\x03Vpc\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x35\n\x04spec\x18\x02 \x01(\x0b\x32\'.opi_api.network.cloud.v1alpha1.VpcSpec\x12\x39\n\x06status\x18\x03 \x01(\x0b\x32).opi_api.network.cloud.v1alpha1.VpcStatus:3\xea\x41\x30\n\"opi_api.network.cloud.v1alpha1/vpc\x12\nvpcs/{vpc}\"\xa1\x03\n\x07VpcSpec\x12\x35\n\x04type\x18\x01 \x01(\x0e\x32\'.opi_api.network.cloud.v1alpha1.VPCType\x12\x1f\n\x17v4_route_table_name_ref\x18\x02 \x01(\t\x12\x1f\n\x17v6_route_table_name_ref\x18\x03 \x01(\t\x12+\n#ingress_v4_security_policy_name_ref\x18\x04 \x03(\t\x12+\n#ingress_v6_security_policy_name_ref\x18\x05 \x03(\t\x12*\n\"egress_v4_security_policy_name_ref\x18\x06 \x03(\t\x12*\n\"egress_v6_security_policy_name_ref\x18\x07 \x03(\t\x12\x1a\n\x12virtual_router_mac\x18\x08 \x01(\x0c\x12\x42\n\x0c\x66\x61\x62ric_encap\x18\t \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.Encap\x12\x0b\n\x03tos\x18\n \x01(\x05\"\xac\x01\n\tVpcStatus\x12\x42\n\thw_handle\x18\x01 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.HwHandle\x12\x45\n\x0c\x62\x64_hw_handle\x18\x02 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.HwHandle\x12\x14\n\x0csubnet_count\x18\x03 \x01(\x05\"\xd2\x01\n\x07VPCPeer\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x39\n\x04spec\x18\x02 \x01(\x0b\x32+.opi_api.network.cloud.v1alpha1.VPCPeerSpec\x12=\n\x06status\x18\x03 \x01(\x0b\x32-.opi_api.network.cloud.v1alpha1.VPCPeerStatus:?\xea\x41<\n&opi_api.network.cloud.v1alpha1/vpcpeer\x12\x12vpcpeers/{vpcpeer}\";\n\x0bVPCPeerSpec\x12\x15\n\rvpc1_name_ref\x18\x01 \x01(\t\x12\x15\n\rvpc2_name_ref\x18\x02 \x01(\t\"\x0f\n\rVPCPeerStatus*e\n\x07VPCType\x12\x18\n\x14VPC_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11VPC_TYPE_UNDERLAY\x10\x01\x12\x13\n\x0fVPC_TYPE_TENANT\x10\x02\x12\x14\n\x10VPC_TYPE_CONTROL\x10\x03\x42i\n\x1eopi_api.network.cloud.v1alpha1B\x08VpcProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_VPCTYPE = DESCRIPTOR.enum_types_by_name['VPCType']
VPCType = enum_type_wrapper.EnumTypeWrapper(_VPCTYPE)
VPC_TYPE_UNSPECIFIED = 0
VPC_TYPE_UNDERLAY = 1
VPC_TYPE_TENANT = 2
VPC_TYPE_CONTROL = 3


_VPC = DESCRIPTOR.message_types_by_name['Vpc']
_VPCSPEC = DESCRIPTOR.message_types_by_name['VpcSpec']
_VPCSTATUS = DESCRIPTOR.message_types_by_name['VpcStatus']
_VPCPEER = DESCRIPTOR.message_types_by_name['VPCPeer']
_VPCPEERSPEC = DESCRIPTOR.message_types_by_name['VPCPeerSpec']
_VPCPEERSTATUS = DESCRIPTOR.message_types_by_name['VPCPeerStatus']
Vpc = _reflection.GeneratedProtocolMessageType('Vpc', (_message.Message,), {
  'DESCRIPTOR' : _VPC,
  '__module__' : 'vpc_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.Vpc)
  })
_sym_db.RegisterMessage(Vpc)

VpcSpec = _reflection.GeneratedProtocolMessageType('VpcSpec', (_message.Message,), {
  'DESCRIPTOR' : _VPCSPEC,
  '__module__' : 'vpc_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.VpcSpec)
  })
_sym_db.RegisterMessage(VpcSpec)

VpcStatus = _reflection.GeneratedProtocolMessageType('VpcStatus', (_message.Message,), {
  'DESCRIPTOR' : _VPCSTATUS,
  '__module__' : 'vpc_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.VpcStatus)
  })
_sym_db.RegisterMessage(VpcStatus)

VPCPeer = _reflection.GeneratedProtocolMessageType('VPCPeer', (_message.Message,), {
  'DESCRIPTOR' : _VPCPEER,
  '__module__' : 'vpc_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.VPCPeer)
  })
_sym_db.RegisterMessage(VPCPeer)

VPCPeerSpec = _reflection.GeneratedProtocolMessageType('VPCPeerSpec', (_message.Message,), {
  'DESCRIPTOR' : _VPCPEERSPEC,
  '__module__' : 'vpc_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.VPCPeerSpec)
  })
_sym_db.RegisterMessage(VPCPeerSpec)

VPCPeerStatus = _reflection.GeneratedProtocolMessageType('VPCPeerStatus', (_message.Message,), {
  'DESCRIPTOR' : _VPCPEERSTATUS,
  '__module__' : 'vpc_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.VPCPeerStatus)
  })
_sym_db.RegisterMessage(VPCPeerStatus)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\010VpcProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _VPC._options = None
  _VPC._serialized_options = b'\352A0\n\"opi_api.network.cloud.v1alpha1/vpc\022\nvpcs/{vpc}'
  _VPCPEER._options = None
  _VPCPEER._serialized_options = b'\352A<\n&opi_api.network.cloud.v1alpha1/vpcpeer\022\022vpcpeers/{vpcpeer}'
  _VPCTYPE._serialized_start=1167
  _VPCTYPE._serialized_end=1268
  _VPC._serialized_start=93
  _VPC._serialized_end=279
  _VPCSPEC._serialized_start=282
  _VPCSPEC._serialized_end=699
  _VPCSTATUS._serialized_start=702
  _VPCSTATUS._serialized_end=874
  _VPCPEER._serialized_start=877
  _VPCPEER._serialized_end=1087
  _VPCPEERSPEC._serialized_start=1089
  _VPCPEERSPEC._serialized_end=1148
  _VPCPEERSTATUS._serialized_start=1150
  _VPCPEERSTATUS._serialized_end=1165
# @@protoc_insertion_point(module_scope)
