// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

/**
 * <pre>
 * Request for CreateSubscription.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.CreateSubscriptionRequest}
 */
public  final class CreateSubscriptionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.CreateSubscriptionRequest)
    CreateSubscriptionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSubscriptionRequest.newBuilder() to construct.
  private CreateSubscriptionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSubscriptionRequest() {
    parent_ = "";
    subscriptionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSubscriptionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSubscriptionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.pubsublite.proto.Subscription.Builder subBuilder = null;
            if (subscription_ != null) {
              subBuilder = subscription_.toBuilder();
            }
            subscription_ = input.readMessage(com.google.cloud.pubsublite.proto.Subscription.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(subscription_);
              subscription_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            subscriptionId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_CreateSubscriptionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_CreateSubscriptionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.CreateSubscriptionRequest.class, com.google.cloud.pubsublite.proto.CreateSubscriptionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The parent location in which to create the subscription.
   * Structured like `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The parent location in which to create the subscription.
   * Structured like `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 2;
  private com.google.cloud.pubsublite.proto.Subscription subscription_;
  /**
   * <pre>
   * Configuration of the subscription to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the subscription field is set.
   */
  public boolean hasSubscription() {
    return subscription_ != null;
  }
  /**
   * <pre>
   * Configuration of the subscription to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subscription.
   */
  public com.google.cloud.pubsublite.proto.Subscription getSubscription() {
    return subscription_ == null ? com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance() : subscription_;
  }
  /**
   * <pre>
   * Configuration of the subscription to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.cloud.pubsublite.proto.SubscriptionOrBuilder getSubscriptionOrBuilder() {
    return getSubscription();
  }

  public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object subscriptionId_;
  /**
   * <pre>
   * The ID to use for the subscription, which will become the final component
   * of the subscription's name.
   * This value is structured like: `my-sub-name`.
   * </pre>
   *
   * <code>string subscription_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subscriptionId.
   */
  public java.lang.String getSubscriptionId() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscriptionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID to use for the subscription, which will become the final component
   * of the subscription's name.
   * This value is structured like: `my-sub-name`.
   * </pre>
   *
   * <code>string subscription_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for subscriptionId.
   */
  public com.google.protobuf.ByteString
      getSubscriptionIdBytes() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscriptionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (subscription_ != null) {
      output.writeMessage(2, getSubscription());
    }
    if (!getSubscriptionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subscriptionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (subscription_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSubscription());
    }
    if (!getSubscriptionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subscriptionId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.pubsublite.proto.CreateSubscriptionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.CreateSubscriptionRequest other = (com.google.cloud.pubsublite.proto.CreateSubscriptionRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSubscription() != other.hasSubscription()) return false;
    if (hasSubscription()) {
      if (!getSubscription()
          .equals(other.getSubscription())) return false;
    }
    if (!getSubscriptionId()
        .equals(other.getSubscriptionId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSubscription()) {
      hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getSubscription().hashCode();
    }
    hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubscriptionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.pubsublite.proto.CreateSubscriptionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request for CreateSubscription.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.CreateSubscriptionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.CreateSubscriptionRequest)
      com.google.cloud.pubsublite.proto.CreateSubscriptionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_CreateSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_CreateSubscriptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.CreateSubscriptionRequest.class, com.google.cloud.pubsublite.proto.CreateSubscriptionRequest.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.CreateSubscriptionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (subscriptionBuilder_ == null) {
        subscription_ = null;
      } else {
        subscription_ = null;
        subscriptionBuilder_ = null;
      }
      subscriptionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_CreateSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.CreateSubscriptionRequest getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.CreateSubscriptionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.CreateSubscriptionRequest build() {
      com.google.cloud.pubsublite.proto.CreateSubscriptionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.CreateSubscriptionRequest buildPartial() {
      com.google.cloud.pubsublite.proto.CreateSubscriptionRequest result = new com.google.cloud.pubsublite.proto.CreateSubscriptionRequest(this);
      result.parent_ = parent_;
      if (subscriptionBuilder_ == null) {
        result.subscription_ = subscription_;
      } else {
        result.subscription_ = subscriptionBuilder_.build();
      }
      result.subscriptionId_ = subscriptionId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.pubsublite.proto.CreateSubscriptionRequest) {
        return mergeFrom((com.google.cloud.pubsublite.proto.CreateSubscriptionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.CreateSubscriptionRequest other) {
      if (other == com.google.cloud.pubsublite.proto.CreateSubscriptionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSubscription()) {
        mergeSubscription(other.getSubscription());
      }
      if (!other.getSubscriptionId().isEmpty()) {
        subscriptionId_ = other.subscriptionId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.pubsublite.proto.CreateSubscriptionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.pubsublite.proto.CreateSubscriptionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The parent location in which to create the subscription.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The parent location in which to create the subscription.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The parent location in which to create the subscription.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent location in which to create the subscription.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent location in which to create the subscription.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.pubsublite.proto.Subscription subscription_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.pubsublite.proto.Subscription, com.google.cloud.pubsublite.proto.Subscription.Builder, com.google.cloud.pubsublite.proto.SubscriptionOrBuilder> subscriptionBuilder_;
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the subscription field is set.
     */
    public boolean hasSubscription() {
      return subscriptionBuilder_ != null || subscription_ != null;
    }
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The subscription.
     */
    public com.google.cloud.pubsublite.proto.Subscription getSubscription() {
      if (subscriptionBuilder_ == null) {
        return subscription_ == null ? com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance() : subscription_;
      } else {
        return subscriptionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSubscription(com.google.cloud.pubsublite.proto.Subscription value) {
      if (subscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subscription_ = value;
        onChanged();
      } else {
        subscriptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSubscription(
        com.google.cloud.pubsublite.proto.Subscription.Builder builderForValue) {
      if (subscriptionBuilder_ == null) {
        subscription_ = builderForValue.build();
        onChanged();
      } else {
        subscriptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSubscription(com.google.cloud.pubsublite.proto.Subscription value) {
      if (subscriptionBuilder_ == null) {
        if (subscription_ != null) {
          subscription_ =
            com.google.cloud.pubsublite.proto.Subscription.newBuilder(subscription_).mergeFrom(value).buildPartial();
        } else {
          subscription_ = value;
        }
        onChanged();
      } else {
        subscriptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSubscription() {
      if (subscriptionBuilder_ == null) {
        subscription_ = null;
        onChanged();
      } else {
        subscription_ = null;
        subscriptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.pubsublite.proto.Subscription.Builder getSubscriptionBuilder() {
      
      onChanged();
      return getSubscriptionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.pubsublite.proto.SubscriptionOrBuilder getSubscriptionOrBuilder() {
      if (subscriptionBuilder_ != null) {
        return subscriptionBuilder_.getMessageOrBuilder();
      } else {
        return subscription_ == null ?
            com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance() : subscription_;
      }
    }
    /**
     * <pre>
     * Configuration of the subscription to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Subscription subscription = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.pubsublite.proto.Subscription, com.google.cloud.pubsublite.proto.Subscription.Builder, com.google.cloud.pubsublite.proto.SubscriptionOrBuilder> 
        getSubscriptionFieldBuilder() {
      if (subscriptionBuilder_ == null) {
        subscriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Subscription, com.google.cloud.pubsublite.proto.Subscription.Builder, com.google.cloud.pubsublite.proto.SubscriptionOrBuilder>(
                getSubscription(),
                getParentForChildren(),
                isClean());
        subscription_ = null;
      }
      return subscriptionBuilder_;
    }

    private java.lang.Object subscriptionId_ = "";
    /**
     * <pre>
     * The ID to use for the subscription, which will become the final component
     * of the subscription's name.
     * This value is structured like: `my-sub-name`.
     * </pre>
     *
     * <code>string subscription_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The subscriptionId.
     */
    public java.lang.String getSubscriptionId() {
      java.lang.Object ref = subscriptionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscriptionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID to use for the subscription, which will become the final component
     * of the subscription's name.
     * This value is structured like: `my-sub-name`.
     * </pre>
     *
     * <code>string subscription_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for subscriptionId.
     */
    public com.google.protobuf.ByteString
        getSubscriptionIdBytes() {
      java.lang.Object ref = subscriptionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscriptionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID to use for the subscription, which will become the final component
     * of the subscription's name.
     * This value is structured like: `my-sub-name`.
     * </pre>
     *
     * <code>string subscription_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscriptionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to use for the subscription, which will become the final component
     * of the subscription's name.
     * This value is structured like: `my-sub-name`.
     * </pre>
     *
     * <code>string subscription_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscriptionId() {
      
      subscriptionId_ = getDefaultInstance().getSubscriptionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to use for the subscription, which will become the final component
     * of the subscription's name.
     * This value is structured like: `my-sub-name`.
     * </pre>
     *
     * <code>string subscription_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscriptionId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.CreateSubscriptionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.CreateSubscriptionRequest)
  private static final com.google.cloud.pubsublite.proto.CreateSubscriptionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.CreateSubscriptionRequest();
  }

  public static com.google.cloud.pubsublite.proto.CreateSubscriptionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSubscriptionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSubscriptionRequest>() {
    @java.lang.Override
    public CreateSubscriptionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSubscriptionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSubscriptionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSubscriptionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.CreateSubscriptionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
