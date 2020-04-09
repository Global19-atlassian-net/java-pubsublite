// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

public interface CreateTopicRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.CreateTopicRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent location in which to create the topic.
   * Structured like `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent location in which to create the topic.
   * Structured like `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Configuration of the topic to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Topic topic = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <pre>
   * Configuration of the topic to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Topic topic = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The topic.
   */
  com.google.cloud.pubsublite.proto.Topic getTopic();
  /**
   * <pre>
   * Configuration of the topic to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Topic topic = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.pubsublite.proto.TopicOrBuilder getTopicOrBuilder();

  /**
   * <pre>
   * The ID to use for the topic, which will become the final component of
   * the topic's name.
   * This value is structured like: `my-topic-name`.
   * </pre>
   *
   * <code>string topic_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The topicId.
   */
  java.lang.String getTopicId();
  /**
   * <pre>
   * The ID to use for the topic, which will become the final component of
   * the topic's name.
   * This value is structured like: `my-topic-name`.
   * </pre>
   *
   * <code>string topic_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for topicId.
   */
  com.google.protobuf.ByteString
      getTopicIdBytes();
}