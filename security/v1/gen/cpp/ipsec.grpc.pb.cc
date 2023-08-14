// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: ipsec.proto

#include "ipsec.pb.h"
#include "ipsec.grpc.pb.h"

#include <functional>
#include <grpcpp/support/async_stream.h>
#include <grpcpp/support/async_unary_call.h>
#include <grpcpp/impl/channel_interface.h>
#include <grpcpp/impl/client_unary_call.h>
#include <grpcpp/support/client_callback.h>
#include <grpcpp/support/message_allocator.h>
#include <grpcpp/support/method_handler.h>
#include <grpcpp/impl/rpc_service_method.h>
#include <grpcpp/support/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/server_context.h>
#include <grpcpp/impl/service_type.h>
#include <grpcpp/support/sync_stream.h>
namespace opi_api {
namespace security {
namespace v1 {

static const char* IPsec_method_names[] = {
  "/opi_api.security.v1.IPsec/IPsecVersion",
  "/opi_api.security.v1.IPsec/IPsecStats",
  "/opi_api.security.v1.IPsec/IPsecInitiate",
  "/opi_api.security.v1.IPsec/IPsecTerminate",
  "/opi_api.security.v1.IPsec/IPsecRekey",
  "/opi_api.security.v1.IPsec/IPsecListSas",
  "/opi_api.security.v1.IPsec/IPsecListConns",
  "/opi_api.security.v1.IPsec/IPsecListCerts",
  "/opi_api.security.v1.IPsec/IPsecLoadConn",
  "/opi_api.security.v1.IPsec/IPsecUnloadConn",
};

std::unique_ptr< IPsec::Stub> IPsec::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< IPsec::Stub> stub(new IPsec::Stub(channel, options));
  return stub;
}

IPsec::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_IPsecVersion_(IPsec_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecStats_(IPsec_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecInitiate_(IPsec_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecTerminate_(IPsec_method_names[3], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecRekey_(IPsec_method_names[4], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecListSas_(IPsec_method_names[5], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecListConns_(IPsec_method_names[6], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecListCerts_(IPsec_method_names[7], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecLoadConn_(IPsec_method_names[8], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_IPsecUnloadConn_(IPsec_method_names[9], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status IPsec::Stub::IPsecVersion(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecVersionReq& request, ::opi_api::security::v1::IPsecVersionResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecVersionReq, ::opi_api::security::v1::IPsecVersionResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecVersion_, context, request, response);
}

void IPsec::Stub::async::IPsecVersion(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecVersionReq* request, ::opi_api::security::v1::IPsecVersionResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecVersionReq, ::opi_api::security::v1::IPsecVersionResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecVersion_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecVersion(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecVersionReq* request, ::opi_api::security::v1::IPsecVersionResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecVersion_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecVersionResp>* IPsec::Stub::PrepareAsyncIPsecVersionRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecVersionReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecVersionResp, ::opi_api::security::v1::IPsecVersionReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecVersion_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecVersionResp>* IPsec::Stub::AsyncIPsecVersionRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecVersionReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecVersionRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecStats(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecStatsReq& request, ::opi_api::security::v1::IPsecStatsResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecStatsReq, ::opi_api::security::v1::IPsecStatsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecStats_, context, request, response);
}

void IPsec::Stub::async::IPsecStats(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecStatsReq* request, ::opi_api::security::v1::IPsecStatsResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecStatsReq, ::opi_api::security::v1::IPsecStatsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecStats_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecStats(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecStatsReq* request, ::opi_api::security::v1::IPsecStatsResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecStats_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecStatsResp>* IPsec::Stub::PrepareAsyncIPsecStatsRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecStatsReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecStatsResp, ::opi_api::security::v1::IPsecStatsReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecStats_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecStatsResp>* IPsec::Stub::AsyncIPsecStatsRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecStatsReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecStatsRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecInitiate(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecInitiateReq& request, ::opi_api::security::v1::IPsecInitiateResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecInitiateReq, ::opi_api::security::v1::IPsecInitiateResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecInitiate_, context, request, response);
}

void IPsec::Stub::async::IPsecInitiate(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecInitiateReq* request, ::opi_api::security::v1::IPsecInitiateResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecInitiateReq, ::opi_api::security::v1::IPsecInitiateResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecInitiate_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecInitiate(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecInitiateReq* request, ::opi_api::security::v1::IPsecInitiateResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecInitiate_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecInitiateResp>* IPsec::Stub::PrepareAsyncIPsecInitiateRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecInitiateReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecInitiateResp, ::opi_api::security::v1::IPsecInitiateReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecInitiate_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecInitiateResp>* IPsec::Stub::AsyncIPsecInitiateRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecInitiateReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecInitiateRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecTerminate(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecTerminateReq& request, ::opi_api::security::v1::IPsecTerminateResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecTerminateReq, ::opi_api::security::v1::IPsecTerminateResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecTerminate_, context, request, response);
}

void IPsec::Stub::async::IPsecTerminate(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecTerminateReq* request, ::opi_api::security::v1::IPsecTerminateResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecTerminateReq, ::opi_api::security::v1::IPsecTerminateResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecTerminate_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecTerminate(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecTerminateReq* request, ::opi_api::security::v1::IPsecTerminateResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecTerminate_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecTerminateResp>* IPsec::Stub::PrepareAsyncIPsecTerminateRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecTerminateReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecTerminateResp, ::opi_api::security::v1::IPsecTerminateReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecTerminate_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecTerminateResp>* IPsec::Stub::AsyncIPsecTerminateRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecTerminateReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecTerminateRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecRekey(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecRekeyReq& request, ::opi_api::security::v1::IPsecRekeyResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecRekeyReq, ::opi_api::security::v1::IPsecRekeyResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecRekey_, context, request, response);
}

void IPsec::Stub::async::IPsecRekey(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecRekeyReq* request, ::opi_api::security::v1::IPsecRekeyResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecRekeyReq, ::opi_api::security::v1::IPsecRekeyResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecRekey_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecRekey(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecRekeyReq* request, ::opi_api::security::v1::IPsecRekeyResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecRekey_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecRekeyResp>* IPsec::Stub::PrepareAsyncIPsecRekeyRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecRekeyReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecRekeyResp, ::opi_api::security::v1::IPsecRekeyReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecRekey_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecRekeyResp>* IPsec::Stub::AsyncIPsecRekeyRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecRekeyReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecRekeyRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecListSas(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListSasReq& request, ::opi_api::security::v1::IPsecListSasResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecListSasReq, ::opi_api::security::v1::IPsecListSasResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecListSas_, context, request, response);
}

void IPsec::Stub::async::IPsecListSas(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListSasReq* request, ::opi_api::security::v1::IPsecListSasResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecListSasReq, ::opi_api::security::v1::IPsecListSasResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecListSas_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecListSas(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListSasReq* request, ::opi_api::security::v1::IPsecListSasResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecListSas_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecListSasResp>* IPsec::Stub::PrepareAsyncIPsecListSasRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListSasReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecListSasResp, ::opi_api::security::v1::IPsecListSasReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecListSas_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecListSasResp>* IPsec::Stub::AsyncIPsecListSasRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListSasReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecListSasRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecListConns(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListConnsReq& request, ::opi_api::security::v1::IPsecListConnsResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecListConnsReq, ::opi_api::security::v1::IPsecListConnsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecListConns_, context, request, response);
}

void IPsec::Stub::async::IPsecListConns(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListConnsReq* request, ::opi_api::security::v1::IPsecListConnsResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecListConnsReq, ::opi_api::security::v1::IPsecListConnsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecListConns_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecListConns(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListConnsReq* request, ::opi_api::security::v1::IPsecListConnsResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecListConns_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecListConnsResp>* IPsec::Stub::PrepareAsyncIPsecListConnsRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListConnsReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecListConnsResp, ::opi_api::security::v1::IPsecListConnsReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecListConns_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecListConnsResp>* IPsec::Stub::AsyncIPsecListConnsRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListConnsReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecListConnsRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecListCerts(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListCertsReq& request, ::opi_api::security::v1::IPsecListCertsResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecListCertsReq, ::opi_api::security::v1::IPsecListCertsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecListCerts_, context, request, response);
}

void IPsec::Stub::async::IPsecListCerts(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListCertsReq* request, ::opi_api::security::v1::IPsecListCertsResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecListCertsReq, ::opi_api::security::v1::IPsecListCertsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecListCerts_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecListCerts(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListCertsReq* request, ::opi_api::security::v1::IPsecListCertsResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecListCerts_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecListCertsResp>* IPsec::Stub::PrepareAsyncIPsecListCertsRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListCertsReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecListCertsResp, ::opi_api::security::v1::IPsecListCertsReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecListCerts_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecListCertsResp>* IPsec::Stub::AsyncIPsecListCertsRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecListCertsReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecListCertsRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecLoadConn(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecLoadConnReq& request, ::opi_api::security::v1::IPsecLoadConnResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecLoadConnReq, ::opi_api::security::v1::IPsecLoadConnResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecLoadConn_, context, request, response);
}

void IPsec::Stub::async::IPsecLoadConn(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecLoadConnReq* request, ::opi_api::security::v1::IPsecLoadConnResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecLoadConnReq, ::opi_api::security::v1::IPsecLoadConnResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecLoadConn_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecLoadConn(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecLoadConnReq* request, ::opi_api::security::v1::IPsecLoadConnResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecLoadConn_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecLoadConnResp>* IPsec::Stub::PrepareAsyncIPsecLoadConnRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecLoadConnReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecLoadConnResp, ::opi_api::security::v1::IPsecLoadConnReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecLoadConn_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecLoadConnResp>* IPsec::Stub::AsyncIPsecLoadConnRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecLoadConnReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecLoadConnRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status IPsec::Stub::IPsecUnloadConn(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecUnloadConnReq& request, ::opi_api::security::v1::IPsecUnloadConnResp* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::v1::IPsecUnloadConnReq, ::opi_api::security::v1::IPsecUnloadConnResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_IPsecUnloadConn_, context, request, response);
}

void IPsec::Stub::async::IPsecUnloadConn(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecUnloadConnReq* request, ::opi_api::security::v1::IPsecUnloadConnResp* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::v1::IPsecUnloadConnReq, ::opi_api::security::v1::IPsecUnloadConnResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecUnloadConn_, context, request, response, std::move(f));
}

void IPsec::Stub::async::IPsecUnloadConn(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecUnloadConnReq* request, ::opi_api::security::v1::IPsecUnloadConnResp* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_IPsecUnloadConn_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecUnloadConnResp>* IPsec::Stub::PrepareAsyncIPsecUnloadConnRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecUnloadConnReq& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::v1::IPsecUnloadConnResp, ::opi_api::security::v1::IPsecUnloadConnReq, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_IPsecUnloadConn_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::v1::IPsecUnloadConnResp>* IPsec::Stub::AsyncIPsecUnloadConnRaw(::grpc::ClientContext* context, const ::opi_api::security::v1::IPsecUnloadConnReq& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncIPsecUnloadConnRaw(context, request, cq);
  result->StartCall();
  return result;
}

IPsec::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecVersionReq, ::opi_api::security::v1::IPsecVersionResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecVersionReq* req,
             ::opi_api::security::v1::IPsecVersionResp* resp) {
               return service->IPsecVersion(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecStatsReq, ::opi_api::security::v1::IPsecStatsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecStatsReq* req,
             ::opi_api::security::v1::IPsecStatsResp* resp) {
               return service->IPsecStats(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecInitiateReq, ::opi_api::security::v1::IPsecInitiateResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecInitiateReq* req,
             ::opi_api::security::v1::IPsecInitiateResp* resp) {
               return service->IPsecInitiate(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecTerminateReq, ::opi_api::security::v1::IPsecTerminateResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecTerminateReq* req,
             ::opi_api::security::v1::IPsecTerminateResp* resp) {
               return service->IPsecTerminate(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecRekeyReq, ::opi_api::security::v1::IPsecRekeyResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecRekeyReq* req,
             ::opi_api::security::v1::IPsecRekeyResp* resp) {
               return service->IPsecRekey(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecListSasReq, ::opi_api::security::v1::IPsecListSasResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecListSasReq* req,
             ::opi_api::security::v1::IPsecListSasResp* resp) {
               return service->IPsecListSas(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[6],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecListConnsReq, ::opi_api::security::v1::IPsecListConnsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecListConnsReq* req,
             ::opi_api::security::v1::IPsecListConnsResp* resp) {
               return service->IPsecListConns(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[7],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecListCertsReq, ::opi_api::security::v1::IPsecListCertsResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecListCertsReq* req,
             ::opi_api::security::v1::IPsecListCertsResp* resp) {
               return service->IPsecListCerts(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[8],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecLoadConnReq, ::opi_api::security::v1::IPsecLoadConnResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecLoadConnReq* req,
             ::opi_api::security::v1::IPsecLoadConnResp* resp) {
               return service->IPsecLoadConn(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IPsec_method_names[9],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< IPsec::Service, ::opi_api::security::v1::IPsecUnloadConnReq, ::opi_api::security::v1::IPsecUnloadConnResp, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](IPsec::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::v1::IPsecUnloadConnReq* req,
             ::opi_api::security::v1::IPsecUnloadConnResp* resp) {
               return service->IPsecUnloadConn(ctx, req, resp);
             }, this)));
}

IPsec::Service::~Service() {
}

::grpc::Status IPsec::Service::IPsecVersion(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecVersionReq* request, ::opi_api::security::v1::IPsecVersionResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecStats(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecStatsReq* request, ::opi_api::security::v1::IPsecStatsResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecInitiate(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecInitiateReq* request, ::opi_api::security::v1::IPsecInitiateResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecTerminate(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecTerminateReq* request, ::opi_api::security::v1::IPsecTerminateResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecRekey(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecRekeyReq* request, ::opi_api::security::v1::IPsecRekeyResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecListSas(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecListSasReq* request, ::opi_api::security::v1::IPsecListSasResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecListConns(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecListConnsReq* request, ::opi_api::security::v1::IPsecListConnsResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecListCerts(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecListCertsReq* request, ::opi_api::security::v1::IPsecListCertsResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecLoadConn(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecLoadConnReq* request, ::opi_api::security::v1::IPsecLoadConnResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status IPsec::Service::IPsecUnloadConn(::grpc::ServerContext* context, const ::opi_api::security::v1::IPsecUnloadConnReq* request, ::opi_api::security::v1::IPsecUnloadConnResp* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace opi_api
}  // namespace security
}  // namespace v1

