// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/topic_stats.proto

package com.google.cloud.pubsublite.proto;

public final class TopicStatsProto {
  private TopicStatsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/pubsublite/v1/topic_stats"
          + ".proto\022\032google.cloud.pubsublite.v1\032\034goog"
          + "le/api/annotations.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032\'google/cloud/pubsublite/v1/common."
          + "proto\032\037google/protobuf/timestamp.proto\032\027"
          + "google/api/client.proto\"\336\001\n\032ComputeMessa"
          + "geStatsRequest\0226\n\005topic\030\001 \001(\tB\'\340A\002\372A!\n\037p"
          + "ubsublite.googleapis.com/Topic\022\026\n\tpartit"
          + "ion\030\002 \001(\003B\003\340A\002\0228\n\014start_cursor\030\003 \001(\0132\".g"
          + "oogle.cloud.pubsublite.v1.Cursor\0226\n\nend_"
          + "cursor\030\004 \001(\0132\".google.cloud.pubsublite.v"
          + "1.Cursor\"\275\001\n\033ComputeMessageStatsResponse"
          + "\022\025\n\rmessage_count\030\001 \001(\003\022\025\n\rmessage_bytes"
          + "\030\002 \001(\003\0228\n\024minimum_publish_time\030\003 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\0226\n\022minimum_even"
          + "t_time\030\004 \001(\0132\032.google.protobuf.Timestamp"
          + "2\363\001\n\021TopicStatsService\022\335\001\n\023ComputeMessag"
          + "eStats\0226.google.cloud.pubsublite.v1.Comp"
          + "uteMessageStatsRequest\0327.google.cloud.pu"
          + "bsublite.v1.ComputeMessageStatsResponse\""
          + "U\202\323\344\223\002O\"J/v1/topicStats/{topic=projects/"
          + "*/locations/*/topics/*}:computeMessageSt"
          + "ats:\001*B6\n!com.google.cloud.pubsublite.pr"
          + "otoB\017TopicStatsProtoP\001b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.pubsublite.proto.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsRequest_descriptor,
            new java.lang.String[] {
              "Topic", "Partition", "StartCursor", "EndCursor",
            });
    internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ComputeMessageStatsResponse_descriptor,
            new java.lang.String[] {
              "MessageCount", "MessageBytes", "MinimumPublishTime", "MinimumEventTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.pubsublite.proto.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}