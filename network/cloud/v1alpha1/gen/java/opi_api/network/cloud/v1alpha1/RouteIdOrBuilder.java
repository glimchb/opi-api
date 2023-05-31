// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route.proto

package opi_api.network.cloud.v1alpha1;

public interface RouteIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.RouteId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique route id (this id is not scoped under VPC or subnet)
   * </pre>
   *
   * <code>string route_id = 1;</code>
   * @return The routeId.
   */
  java.lang.String getRouteId();
  /**
   * <pre>
   * unique route id (this id is not scoped under VPC or subnet)
   * </pre>
   *
   * <code>string route_id = 1;</code>
   * @return The bytes for routeId.
   */
  com.google.protobuf.ByteString
      getRouteIdBytes();

  /**
   * <pre>
   * route table this route belongs to
   * </pre>
   *
   * <code>string route_table_name_ref = 2;</code>
   * @return The routeTableNameRef.
   */
  java.lang.String getRouteTableNameRef();
  /**
   * <pre>
   * route table this route belongs to
   * </pre>
   *
   * <code>string route_table_name_ref = 2;</code>
   * @return The bytes for routeTableNameRef.
   */
  com.google.protobuf.ByteString
      getRouteTableNameRefBytes();
}
