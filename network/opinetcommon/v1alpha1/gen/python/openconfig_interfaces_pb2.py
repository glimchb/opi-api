# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: openconfig_interfaces.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bopenconfig_interfaces.proto\x12\x18opi_api.network.v1alpha1\x1a\x12networktypes.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\xb5\x01\n\x06\x43onfig\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12:\n\x04type\x18\x02 \x01(\x0e\x32\'.opi_api.network.v1alpha1.InterfaceTypeB\x03\xe0\x41\x02\x12\x10\n\x03mtu\x18\x03 \x01(\rB\x03\xe0\x41\x02\x12\x1a\n\rloopback_mode\x18\x04 \x01(\x08\x42\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x07\x65nabled\x18\x06 \x01(\x08\x42\x03\xe0\x41\x02\"\x8a\x04\n\x08\x43ounters\x12\x16\n\trx_octets\x18\x01 \x01(\x04\x42\x03\xe0\x41\x03\x12\x17\n\nrx_packets\x18\x02 \x01(\x04\x42\x03\xe0\x41\x03\x12\x1c\n\x0frx_unicast_pkts\x18\x03 \x01(\x04\x42\x03\xe0\x41\x03\x12\x1e\n\x11rx_broadcast_pkts\x18\x04 \x01(\x04\x42\x03\xe0\x41\x03\x12\x1e\n\x11rx_multicast_pkts\x18\x05 \x01(\x04\x42\x03\xe0\x41\x03\x12\x18\n\x0brx_discards\x18\x06 \x01(\x04\x42\x03\xe0\x41\x03\x12\x16\n\trx_errors\x18\x07 \x01(\x04\x42\x03\xe0\x41\x03\x12\x1e\n\x11rx_unknown_protos\x18\x08 \x01(\x04\x42\x03\xe0\x41\x03\x12\x1a\n\rrx_fcs_errors\x18\t \x01(\x04\x42\x03\xe0\x41\x03\x12\x17\n\nout_octets\x18\n \x01(\x04\x42\x03\xe0\x41\x03\x12\x18\n\x0bout_packets\x18\x0b \x01(\x04\x42\x03\xe0\x41\x03\x12\x1d\n\x10out_unicast_pkts\x18\x0c \x01(\x04\x42\x03\xe0\x41\x03\x12\x1f\n\x12out_broadcast_pkts\x18\r \x01(\x04\x42\x03\xe0\x41\x03\x12\x1f\n\x12out_multicast_pkts\x18\x0e \x01(\x04\x42\x03\xe0\x41\x03\x12\x19\n\x0cout_discards\x18\x0f \x01(\x04\x42\x03\xe0\x41\x03\x12\x17\n\nout_errors\x18\x10 \x01(\x04\x42\x03\xe0\x41\x03\x12 \n\x13\x63\x61rrier_transitions\x18\x11 \x01(\x04\x42\x03\xe0\x41\x03\x12\x17\n\nlast_clear\x18\x12 \x01(\x04\x42\x03\xe0\x41\x03\"\xeb\x03\n\x05State\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12:\n\x04type\x18\x02 \x01(\x0e\x32\'.opi_api.network.v1alpha1.InterfaceTypeB\x03\xe0\x41\x03\x12\x10\n\x03mtu\x18\x03 \x01(\rB\x03\xe0\x41\x03\x12\x1a\n\rloopback_mode\x18\x04 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x14\n\x07\x65nabled\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03\x12\x14\n\x07ifindex\x18\x07 \x01(\rB\x03\xe0\x41\x03\x12K\n\x0b\x61\x64min_state\x18\x08 \x01(\x0e\x32\x31.opi_api.network.opinetcommon.v1alpha1.AdminStateB\x03\xe0\x41\x03\x12<\n\noper_state\x18\t \x01(\x0e\x32#.opi_api.network.v1alpha1.OperStateB\x03\xe0\x41\x03\x12\x18\n\x0blast_change\x18\n \x01(\x04\x42\x03\xe0\x41\x03\x12\x14\n\x07logical\x18\x0b \x01(\x08\x42\x03\xe0\x41\x03\x12\x17\n\nmanagement\x18\x0c \x01(\x08\x42\x03\xe0\x41\x03\x12\x10\n\x03\x63pu\x18\r \x01(\x08\x42\x03\xe0\x41\x03\x12\x39\n\x08\x63ounters\x18\x0e \x01(\x0b\x32\".opi_api.network.v1alpha1.CountersB\x03\xe0\x41\x03\"\xb2\x08\n\x0cNetInterface\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08\x12\x35\n\x06\x63onfig\x18\x02 \x01(\x0b\x32 .opi_api.network.v1alpha1.ConfigB\x03\xe0\x41\x02\x12\x33\n\x05state\x18\x03 \x01(\x0b\x32\x1f.opi_api.network.v1alpha1.StateB\x03\xe0\x41\x03\x12\x46\n\x08holdtime\x18\x04 \x01(\x0b\x32/.opi_api.network.v1alpha1.NetInterface.HoldTimeB\x03\xe0\x41\x01\x12P\n\rsubinterfaces\x18\x05 \x01(\x0b\x32\x34.opi_api.network.v1alpha1.NetInterface.SubinterfacesB\x03\xe0\x41\x01\x1a\x97\x02\n\x08HoldTime\x12T\n\x0bhold_config\x18\x01 \x01(\x0b\x32:.opi_api.network.v1alpha1.NetInterface.HoldTime.HoldConfigB\x03\xe0\x41\x01\x12R\n\nhold_state\x18\x02 \x01(\x0b\x32\x39.opi_api.network.v1alpha1.NetInterface.HoldTime.HoldStateB\x03\xe0\x41\x03\x1a\x30\n\nHoldConfig\x12\x0f\n\x02up\x18\x01 \x01(\rB\x03\xe0\x41\x01\x12\x11\n\x04\x64own\x18\x02 \x01(\rB\x03\xe0\x41\x01\x1a/\n\tHoldState\x12\x0f\n\x02up\x18\x01 \x01(\rB\x03\xe0\x41\x03\x12\x11\n\x04\x64own\x18\x02 \x01(\rB\x03\xe0\x41\x03\x1a\x84\x03\n\rSubinterfaces\x12\\\n\x0csubinterface\x18\x02 \x03(\x0b\x32\x41.opi_api.network.v1alpha1.NetInterface.Subinterfaces.SubinterfaceB\x03\xe0\x41\x01\x1a\x94\x02\n\x0cSubinterface\x12\x12\n\x05index\x18\x01 \x01(\x03\x42\x03\xe0\x41\x01\x12h\n\x0csubif_config\x18\x02 \x01(\x0b\x32M.opi_api.network.v1alpha1.NetInterface.Subinterfaces.Subinterface.SubifConfigB\x03\xe0\x41\x01\x12\x33\n\x05state\x18\x03 \x01(\x0b\x32\x1f.opi_api.network.v1alpha1.StateB\x03\xe0\x41\x03\x1aQ\n\x0bSubifConfig\x12\x12\n\x05index\x18\x01 \x01(\x04\x42\x03\xe0\x41\x01\x12\x18\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x14\n\x07\x65nabled\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01:h\xea\x41\x65\n,opi_api.network.common.v1alpha1/NetInterface\x12\x18netInterface/{interface}*\rnetInterfaces2\x0cnetInterface\"M\n\x16GetNetInterfaceRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.network.v1/Interfaces\"\x82\x01\n\x18ListNetInterfacesRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.network.v1/Interfaces\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"t\n\x19ListNetInterfacesResponse\x12>\n\x0enet_interfaces\x18\x01 \x03(\x0b\x32&.opi_api.network.v1alpha1.NetInterface\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xb1\x01\n\x19UpdateNetInterfaceRequest\x12\x42\n\rnet_interface\x18\x01 \x01(\x0b\x32&.opi_api.network.v1alpha1.NetInterfaceB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01*K\n\rInterfaceType\x12\x1e\n\x1aINTERFACE_TYPE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x45THERNET\x10\x01\x12\x0c\n\x08LOOPBACK\x10\x02*\xd4\x01\n\tOperState\x12\x1a\n\x16OPER_STATE_UNSPECIFIED\x10\x00\x12\x11\n\rOPER_STATE_UP\x10\x02\x12\x13\n\x0fOPER_STATE_DOWN\x10\x03\x12\x16\n\x12OPER_STATE_TESTING\x10\x04\x12\x16\n\x12OPER_STATE_UNKNOWN\x10\x05\x12\x16\n\x12OPER_STATE_DORMANT\x10\x06\x12\x1a\n\x16OPER_STATE_NOT_PRESENT\x10\x07\x12\x1f\n\x1bOPER_STATE_LOWER_LAYER_DOWN\x10\x08\x32\xba\x04\n\x13NetInterfaceService\x12\x9f\x01\n\x0fGetNetInterface\x12\x30.opi_api.network.v1alpha1.GetNetInterfaceRequest\x1a&.opi_api.network.v1alpha1.NetInterface\"2\x82\xd3\xe4\x93\x02%\x12#/v1/{name=interfaces/*/interface/*}\xda\x41\x04name\x12\xa6\x01\n\x11ListNetInterfaces\x12\x32.opi_api.network.v1alpha1.ListNetInterfacesRequest\x1a\x33.opi_api.network.v1alpha1.ListNetInterfacesResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=interfaces}\xda\x41\x06parent\x12\xd7\x01\n\x12UpdateNetInterface\x12\x33.opi_api.network.v1alpha1.UpdateNetInterfaceRequest\x1a&.opi_api.network.v1alpha1.NetInterface\"d\x82\xd3\xe4\x93\x02\x42\x32\x31/v1/{net_interface.name=interfaces/*/interface/*}:\rnet_interface\xda\x41\x19net_interface,update_maskB{\n\x18opi_api.network.v1alpha1B\x19OpenconfigInterfacesProtoP\x01ZBgithub.com/opiproject/opi-api/network/opinetcommon/v1alpha1/gen/gob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'openconfig_interfaces_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030opi_api.network.v1alpha1B\031OpenconfigInterfacesProtoP\001ZBgithub.com/opiproject/opi-api/network/opinetcommon/v1alpha1/gen/go'
  _CONFIG.fields_by_name['name']._options = None
  _CONFIG.fields_by_name['name']._serialized_options = b'\340A\002'
  _CONFIG.fields_by_name['type']._options = None
  _CONFIG.fields_by_name['type']._serialized_options = b'\340A\002'
  _CONFIG.fields_by_name['mtu']._options = None
  _CONFIG.fields_by_name['mtu']._serialized_options = b'\340A\002'
  _CONFIG.fields_by_name['loopback_mode']._options = None
  _CONFIG.fields_by_name['loopback_mode']._serialized_options = b'\340A\002'
  _CONFIG.fields_by_name['description']._options = None
  _CONFIG.fields_by_name['description']._serialized_options = b'\340A\002'
  _CONFIG.fields_by_name['enabled']._options = None
  _CONFIG.fields_by_name['enabled']._serialized_options = b'\340A\002'
  _COUNTERS.fields_by_name['rx_octets']._options = None
  _COUNTERS.fields_by_name['rx_octets']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['rx_packets']._options = None
  _COUNTERS.fields_by_name['rx_packets']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['rx_unicast_pkts']._options = None
  _COUNTERS.fields_by_name['rx_unicast_pkts']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['rx_broadcast_pkts']._options = None
  _COUNTERS.fields_by_name['rx_broadcast_pkts']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['rx_multicast_pkts']._options = None
  _COUNTERS.fields_by_name['rx_multicast_pkts']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['rx_discards']._options = None
  _COUNTERS.fields_by_name['rx_discards']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['rx_errors']._options = None
  _COUNTERS.fields_by_name['rx_errors']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['rx_unknown_protos']._options = None
  _COUNTERS.fields_by_name['rx_unknown_protos']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['rx_fcs_errors']._options = None
  _COUNTERS.fields_by_name['rx_fcs_errors']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['out_octets']._options = None
  _COUNTERS.fields_by_name['out_octets']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['out_packets']._options = None
  _COUNTERS.fields_by_name['out_packets']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['out_unicast_pkts']._options = None
  _COUNTERS.fields_by_name['out_unicast_pkts']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['out_broadcast_pkts']._options = None
  _COUNTERS.fields_by_name['out_broadcast_pkts']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['out_multicast_pkts']._options = None
  _COUNTERS.fields_by_name['out_multicast_pkts']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['out_discards']._options = None
  _COUNTERS.fields_by_name['out_discards']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['out_errors']._options = None
  _COUNTERS.fields_by_name['out_errors']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['carrier_transitions']._options = None
  _COUNTERS.fields_by_name['carrier_transitions']._serialized_options = b'\340A\003'
  _COUNTERS.fields_by_name['last_clear']._options = None
  _COUNTERS.fields_by_name['last_clear']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['name']._options = None
  _STATE.fields_by_name['name']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['type']._options = None
  _STATE.fields_by_name['type']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['mtu']._options = None
  _STATE.fields_by_name['mtu']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['loopback_mode']._options = None
  _STATE.fields_by_name['loopback_mode']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['description']._options = None
  _STATE.fields_by_name['description']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['enabled']._options = None
  _STATE.fields_by_name['enabled']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['ifindex']._options = None
  _STATE.fields_by_name['ifindex']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['admin_state']._options = None
  _STATE.fields_by_name['admin_state']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['oper_state']._options = None
  _STATE.fields_by_name['oper_state']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['last_change']._options = None
  _STATE.fields_by_name['last_change']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['logical']._options = None
  _STATE.fields_by_name['logical']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['management']._options = None
  _STATE.fields_by_name['management']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['cpu']._options = None
  _STATE.fields_by_name['cpu']._serialized_options = b'\340A\003'
  _STATE.fields_by_name['counters']._options = None
  _STATE.fields_by_name['counters']._serialized_options = b'\340A\003'
  _NETINTERFACE_HOLDTIME_HOLDCONFIG.fields_by_name['up']._options = None
  _NETINTERFACE_HOLDTIME_HOLDCONFIG.fields_by_name['up']._serialized_options = b'\340A\001'
  _NETINTERFACE_HOLDTIME_HOLDCONFIG.fields_by_name['down']._options = None
  _NETINTERFACE_HOLDTIME_HOLDCONFIG.fields_by_name['down']._serialized_options = b'\340A\001'
  _NETINTERFACE_HOLDTIME_HOLDSTATE.fields_by_name['up']._options = None
  _NETINTERFACE_HOLDTIME_HOLDSTATE.fields_by_name['up']._serialized_options = b'\340A\003'
  _NETINTERFACE_HOLDTIME_HOLDSTATE.fields_by_name['down']._options = None
  _NETINTERFACE_HOLDTIME_HOLDSTATE.fields_by_name['down']._serialized_options = b'\340A\003'
  _NETINTERFACE_HOLDTIME.fields_by_name['hold_config']._options = None
  _NETINTERFACE_HOLDTIME.fields_by_name['hold_config']._serialized_options = b'\340A\001'
  _NETINTERFACE_HOLDTIME.fields_by_name['hold_state']._options = None
  _NETINTERFACE_HOLDTIME.fields_by_name['hold_state']._serialized_options = b'\340A\003'
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG.fields_by_name['index']._options = None
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG.fields_by_name['index']._serialized_options = b'\340A\001'
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG.fields_by_name['description']._options = None
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG.fields_by_name['description']._serialized_options = b'\340A\001'
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG.fields_by_name['enabled']._options = None
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG.fields_by_name['enabled']._serialized_options = b'\340A\001'
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE.fields_by_name['index']._options = None
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE.fields_by_name['index']._serialized_options = b'\340A\001'
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE.fields_by_name['subif_config']._options = None
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE.fields_by_name['subif_config']._serialized_options = b'\340A\001'
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE.fields_by_name['state']._options = None
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE.fields_by_name['state']._serialized_options = b'\340A\003'
  _NETINTERFACE_SUBINTERFACES.fields_by_name['subinterface']._options = None
  _NETINTERFACE_SUBINTERFACES.fields_by_name['subinterface']._serialized_options = b'\340A\001'
  _NETINTERFACE.fields_by_name['name']._options = None
  _NETINTERFACE.fields_by_name['name']._serialized_options = b'\340A\010'
  _NETINTERFACE.fields_by_name['config']._options = None
  _NETINTERFACE.fields_by_name['config']._serialized_options = b'\340A\002'
  _NETINTERFACE.fields_by_name['state']._options = None
  _NETINTERFACE.fields_by_name['state']._serialized_options = b'\340A\003'
  _NETINTERFACE.fields_by_name['holdtime']._options = None
  _NETINTERFACE.fields_by_name['holdtime']._serialized_options = b'\340A\001'
  _NETINTERFACE.fields_by_name['subinterfaces']._options = None
  _NETINTERFACE.fields_by_name['subinterfaces']._serialized_options = b'\340A\001'
  _NETINTERFACE._options = None
  _NETINTERFACE._serialized_options = b'\352Ae\n,opi_api.network.common.v1alpha1/NetInterface\022\030netInterface/{interface}*\rnetInterfaces2\014netInterface'
  _GETNETINTERFACEREQUEST.fields_by_name['name']._options = None
  _GETNETINTERFACEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035opi_api.network.v1/Interfaces'
  _LISTNETINTERFACESREQUEST.fields_by_name['parent']._options = None
  _LISTNETINTERFACESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035opi_api.network.v1/Interfaces'
  _LISTNETINTERFACESREQUEST.fields_by_name['page_size']._options = None
  _LISTNETINTERFACESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTNETINTERFACESREQUEST.fields_by_name['page_token']._options = None
  _LISTNETINTERFACESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _UPDATENETINTERFACEREQUEST.fields_by_name['net_interface']._options = None
  _UPDATENETINTERFACEREQUEST.fields_by_name['net_interface']._serialized_options = b'\340A\002'
  _UPDATENETINTERFACEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATENETINTERFACEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATENETINTERFACEREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATENETINTERFACEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _NETINTERFACESERVICE.methods_by_name['GetNetInterface']._options = None
  _NETINTERFACESERVICE.methods_by_name['GetNetInterface']._serialized_options = b'\202\323\344\223\002%\022#/v1/{name=interfaces/*/interface/*}\332A\004name'
  _NETINTERFACESERVICE.methods_by_name['ListNetInterfaces']._options = None
  _NETINTERFACESERVICE.methods_by_name['ListNetInterfaces']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=interfaces}\332A\006parent'
  _NETINTERFACESERVICE.methods_by_name['UpdateNetInterface']._options = None
  _NETINTERFACESERVICE.methods_by_name['UpdateNetInterface']._serialized_options = b'\202\323\344\223\002B21/v1/{net_interface.name=interfaces/*/interface/*}:\rnet_interface\332A\031net_interface,update_mask'
  _INTERFACETYPE._serialized_start=3016
  _INTERFACETYPE._serialized_end=3091
  _OPERSTATE._serialized_start=3094
  _OPERSTATE._serialized_end=3306
  _CONFIG._serialized_start=227
  _CONFIG._serialized_end=408
  _COUNTERS._serialized_start=411
  _COUNTERS._serialized_end=933
  _STATE._serialized_start=936
  _STATE._serialized_end=1427
  _NETINTERFACE._serialized_start=1430
  _NETINTERFACE._serialized_end=2504
  _NETINTERFACE_HOLDTIME._serialized_start=1728
  _NETINTERFACE_HOLDTIME._serialized_end=2007
  _NETINTERFACE_HOLDTIME_HOLDCONFIG._serialized_start=1910
  _NETINTERFACE_HOLDTIME_HOLDCONFIG._serialized_end=1958
  _NETINTERFACE_HOLDTIME_HOLDSTATE._serialized_start=1960
  _NETINTERFACE_HOLDTIME_HOLDSTATE._serialized_end=2007
  _NETINTERFACE_SUBINTERFACES._serialized_start=2010
  _NETINTERFACE_SUBINTERFACES._serialized_end=2398
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE._serialized_start=2122
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE._serialized_end=2398
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG._serialized_start=2317
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG._serialized_end=2398
  _GETNETINTERFACEREQUEST._serialized_start=2506
  _GETNETINTERFACEREQUEST._serialized_end=2583
  _LISTNETINTERFACESREQUEST._serialized_start=2586
  _LISTNETINTERFACESREQUEST._serialized_end=2716
  _LISTNETINTERFACESRESPONSE._serialized_start=2718
  _LISTNETINTERFACESRESPONSE._serialized_end=2834
  _UPDATENETINTERFACEREQUEST._serialized_start=2837
  _UPDATENETINTERFACEREQUEST._serialized_end=3014
  _NETINTERFACESERVICE._serialized_start=3309
  _NETINTERFACESERVICE._serialized_end=3879
# @@protoc_insertion_point(module_scope)
