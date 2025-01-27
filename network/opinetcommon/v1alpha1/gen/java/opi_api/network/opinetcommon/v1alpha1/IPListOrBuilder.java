// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networktypes.proto

package opi_api.network.opinetcommon.v1alpha1;

public interface IPListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.opinetcommon.v1alpha1.IPList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of ip entries (prefix, range)
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPEntry ip_entries = 1;</code>
   */
  java.util.List<opi_api.network.opinetcommon.v1alpha1.IPEntry> 
      getIpEntriesList();
  /**
   * <pre>
   * list of ip entries (prefix, range)
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPEntry ip_entries = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPEntry getIpEntries(int index);
  /**
   * <pre>
   * list of ip entries (prefix, range)
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPEntry ip_entries = 1;</code>
   */
  int getIpEntriesCount();
  /**
   * <pre>
   * list of ip entries (prefix, range)
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPEntry ip_entries = 1;</code>
   */
  java.util.List<? extends opi_api.network.opinetcommon.v1alpha1.IPEntryOrBuilder> 
      getIpEntriesOrBuilderList();
  /**
   * <pre>
   * list of ip entries (prefix, range)
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPEntry ip_entries = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPEntryOrBuilder getIpEntriesOrBuilder(
      int index);
}
