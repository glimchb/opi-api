// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: port.proto

package opi_api.network.cloud.v1alpha1;

public interface PortLinkFSMRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.PortLinkFSMRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * internal port link state machine
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PortLinkFSM fsm_state = 1;</code>
   * @return The enum numeric value on the wire for fsmState.
   */
  int getFsmStateValue();
  /**
   * <pre>
   * internal port link state machine
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PortLinkFSM fsm_state = 1;</code>
   * @return The fsmState.
   */
  opi_api.network.cloud.v1alpha1.PortLinkFSM getFsmState();

  /**
   * <pre>
   * port state time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 2;</code>
   * @return Whether the stateTime field is set.
   */
  boolean hasStateTime();
  /**
   * <pre>
   * port state time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 2;</code>
   * @return The stateTime.
   */
  com.google.protobuf.Timestamp getStateTime();
  /**
   * <pre>
   * port state time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStateTimeOrBuilder();

  /**
   * <pre>
   * port state duration
   * </pre>
   *
   * <code>string duration = 3;</code>
   * @return The duration.
   */
  java.lang.String getDuration();
  /**
   * <pre>
   * port state duration
   * </pre>
   *
   * <code>string duration = 3;</code>
   * @return The bytes for duration.
   */
  com.google.protobuf.ByteString
      getDurationBytes();
}
