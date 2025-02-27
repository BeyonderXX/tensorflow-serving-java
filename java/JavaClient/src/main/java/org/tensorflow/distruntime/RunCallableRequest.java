// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.RunCallableRequest}
 */
public  final class RunCallableRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.RunCallableRequest)
    RunCallableRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunCallableRequest.newBuilder() to construct.
  private RunCallableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunCallableRequest() {
    sessionHandle_ = "";
    feed_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RunCallableRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RunCallableRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            sessionHandle_ = s;
            break;
          }
          case 16: {

            handle_ = input.readInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              feed_ = new java.util.ArrayList<org.tensorflow.framework.TensorProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            feed_.add(
                input.readMessage(org.tensorflow.framework.TensorProto.parser(), extensionRegistry));
            break;
          }
          case 32: {

            requestId_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        feed_ = java.util.Collections.unmodifiableList(feed_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.RunCallableRequest.class, org.tensorflow.distruntime.RunCallableRequest.Builder.class);
  }

  public static final int SESSION_HANDLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionHandle_;
  /**
   * <pre>
   * REQUIRED: session_handle must be returned by a CreateSession call
   * to the same master service.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   * @return The sessionHandle.
   */
  public java.lang.String getSessionHandle() {
    java.lang.Object ref = sessionHandle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionHandle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * REQUIRED: session_handle must be returned by a CreateSession call
   * to the same master service.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   * @return The bytes for sessionHandle.
   */
  public com.google.protobuf.ByteString
      getSessionHandleBytes() {
    java.lang.Object ref = sessionHandle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionHandle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HANDLE_FIELD_NUMBER = 2;
  private long handle_;
  /**
   * <pre>
   * REQUIRED: handle must be returned by a MakeCallable call to the same
   * master service.
   * </pre>
   *
   * <code>int64 handle = 2;</code>
   * @return The handle.
   */
  public long getHandle() {
    return handle_;
  }

  public static final int FEED_FIELD_NUMBER = 3;
  private java.util.List<org.tensorflow.framework.TensorProto> feed_;
  /**
   * <pre>
   * Values of the tensors passed as arguments to the callable, in the order
   * defined in the CallableOptions.feed field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto feed = 3;</code>
   */
  public java.util.List<org.tensorflow.framework.TensorProto> getFeedList() {
    return feed_;
  }
  /**
   * <pre>
   * Values of the tensors passed as arguments to the callable, in the order
   * defined in the CallableOptions.feed field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto feed = 3;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
      getFeedOrBuilderList() {
    return feed_;
  }
  /**
   * <pre>
   * Values of the tensors passed as arguments to the callable, in the order
   * defined in the CallableOptions.feed field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto feed = 3;</code>
   */
  public int getFeedCount() {
    return feed_.size();
  }
  /**
   * <pre>
   * Values of the tensors passed as arguments to the callable, in the order
   * defined in the CallableOptions.feed field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto feed = 3;</code>
   */
  public org.tensorflow.framework.TensorProto getFeed(int index) {
    return feed_.get(index);
  }
  /**
   * <pre>
   * Values of the tensors passed as arguments to the callable, in the order
   * defined in the CallableOptions.feed field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto feed = 3;</code>
   */
  public org.tensorflow.framework.TensorProtoOrBuilder getFeedOrBuilder(
      int index) {
    return feed_.get(index);
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 4;
  private long requestId_;
  /**
   * <pre>
   * Unique identifier for this request. Every RunCallableRequest must
   * have a unique request_id, and retried RunCallableRequest must have
   * the same request_id. If request_id is zero, retry detection is disabled.
   * </pre>
   *
   * <code>int64 request_id = 4;</code>
   * @return The requestId.
   */
  public long getRequestId() {
    return requestId_;
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
    if (!getSessionHandleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionHandle_);
    }
    if (handle_ != 0L) {
      output.writeInt64(2, handle_);
    }
    for (int i = 0; i < feed_.size(); i++) {
      output.writeMessage(3, feed_.get(i));
    }
    if (requestId_ != 0L) {
      output.writeInt64(4, requestId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSessionHandleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionHandle_);
    }
    if (handle_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, handle_);
    }
    for (int i = 0; i < feed_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, feed_.get(i));
    }
    if (requestId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, requestId_);
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
    if (!(obj instanceof org.tensorflow.distruntime.RunCallableRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.RunCallableRequest other = (org.tensorflow.distruntime.RunCallableRequest) obj;

    if (!getSessionHandle()
        .equals(other.getSessionHandle())) return false;
    if (getHandle()
        != other.getHandle()) return false;
    if (!getFeedList()
        .equals(other.getFeedList())) return false;
    if (getRequestId()
        != other.getRequestId()) return false;
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
    hash = (37 * hash) + SESSION_HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getSessionHandle().hashCode();
    hash = (37 * hash) + HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHandle());
    if (getFeedCount() > 0) {
      hash = (37 * hash) + FEED_FIELD_NUMBER;
      hash = (53 * hash) + getFeedList().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RunCallableRequest parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.RunCallableRequest prototype) {
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
   * Protobuf type {@code tensorflow.RunCallableRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.RunCallableRequest)
      org.tensorflow.distruntime.RunCallableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.RunCallableRequest.class, org.tensorflow.distruntime.RunCallableRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.RunCallableRequest.newBuilder()
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
        getFeedFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionHandle_ = "";

      handle_ = 0L;

      if (feedBuilder_ == null) {
        feed_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        feedBuilder_.clear();
      }
      requestId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RunCallableRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.RunCallableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RunCallableRequest build() {
      org.tensorflow.distruntime.RunCallableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RunCallableRequest buildPartial() {
      org.tensorflow.distruntime.RunCallableRequest result = new org.tensorflow.distruntime.RunCallableRequest(this);
      int from_bitField0_ = bitField0_;
      result.sessionHandle_ = sessionHandle_;
      result.handle_ = handle_;
      if (feedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          feed_ = java.util.Collections.unmodifiableList(feed_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.feed_ = feed_;
      } else {
        result.feed_ = feedBuilder_.build();
      }
      result.requestId_ = requestId_;
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
      if (other instanceof org.tensorflow.distruntime.RunCallableRequest) {
        return mergeFrom((org.tensorflow.distruntime.RunCallableRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.RunCallableRequest other) {
      if (other == org.tensorflow.distruntime.RunCallableRequest.getDefaultInstance()) return this;
      if (!other.getSessionHandle().isEmpty()) {
        sessionHandle_ = other.sessionHandle_;
        onChanged();
      }
      if (other.getHandle() != 0L) {
        setHandle(other.getHandle());
      }
      if (feedBuilder_ == null) {
        if (!other.feed_.isEmpty()) {
          if (feed_.isEmpty()) {
            feed_ = other.feed_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeedIsMutable();
            feed_.addAll(other.feed_);
          }
          onChanged();
        }
      } else {
        if (!other.feed_.isEmpty()) {
          if (feedBuilder_.isEmpty()) {
            feedBuilder_.dispose();
            feedBuilder_ = null;
            feed_ = other.feed_;
            bitField0_ = (bitField0_ & ~0x00000001);
            feedBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFeedFieldBuilder() : null;
          } else {
            feedBuilder_.addAllMessages(other.feed_);
          }
        }
      }
      if (other.getRequestId() != 0L) {
        setRequestId(other.getRequestId());
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
      org.tensorflow.distruntime.RunCallableRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.RunCallableRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object sessionHandle_ = "";
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @return The sessionHandle.
     */
    public java.lang.String getSessionHandle() {
      java.lang.Object ref = sessionHandle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionHandle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @return The bytes for sessionHandle.
     */
    public com.google.protobuf.ByteString
        getSessionHandleBytes() {
      java.lang.Object ref = sessionHandle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionHandle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @param value The sessionHandle to set.
     * @return This builder for chaining.
     */
    public Builder setSessionHandle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionHandle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionHandle() {
      
      sessionHandle_ = getDefaultInstance().getSessionHandle();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @param value The bytes for sessionHandle to set.
     * @return This builder for chaining.
     */
    public Builder setSessionHandleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionHandle_ = value;
      onChanged();
      return this;
    }

    private long handle_ ;
    /**
     * <pre>
     * REQUIRED: handle must be returned by a MakeCallable call to the same
     * master service.
     * </pre>
     *
     * <code>int64 handle = 2;</code>
     * @return The handle.
     */
    public long getHandle() {
      return handle_;
    }
    /**
     * <pre>
     * REQUIRED: handle must be returned by a MakeCallable call to the same
     * master service.
     * </pre>
     *
     * <code>int64 handle = 2;</code>
     * @param value The handle to set.
     * @return This builder for chaining.
     */
    public Builder setHandle(long value) {
      
      handle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: handle must be returned by a MakeCallable call to the same
     * master service.
     * </pre>
     *
     * <code>int64 handle = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHandle() {
      
      handle_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<org.tensorflow.framework.TensorProto> feed_ =
      java.util.Collections.emptyList();
    private void ensureFeedIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        feed_ = new java.util.ArrayList<org.tensorflow.framework.TensorProto>(feed_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> feedBuilder_;

    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public java.util.List<org.tensorflow.framework.TensorProto> getFeedList() {
      if (feedBuilder_ == null) {
        return java.util.Collections.unmodifiableList(feed_);
      } else {
        return feedBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public int getFeedCount() {
      if (feedBuilder_ == null) {
        return feed_.size();
      } else {
        return feedBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public org.tensorflow.framework.TensorProto getFeed(int index) {
      if (feedBuilder_ == null) {
        return feed_.get(index);
      } else {
        return feedBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder setFeed(
        int index, org.tensorflow.framework.TensorProto value) {
      if (feedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedIsMutable();
        feed_.set(index, value);
        onChanged();
      } else {
        feedBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder setFeed(
        int index, org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (feedBuilder_ == null) {
        ensureFeedIsMutable();
        feed_.set(index, builderForValue.build());
        onChanged();
      } else {
        feedBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder addFeed(org.tensorflow.framework.TensorProto value) {
      if (feedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedIsMutable();
        feed_.add(value);
        onChanged();
      } else {
        feedBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder addFeed(
        int index, org.tensorflow.framework.TensorProto value) {
      if (feedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedIsMutable();
        feed_.add(index, value);
        onChanged();
      } else {
        feedBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder addFeed(
        org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (feedBuilder_ == null) {
        ensureFeedIsMutable();
        feed_.add(builderForValue.build());
        onChanged();
      } else {
        feedBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder addFeed(
        int index, org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (feedBuilder_ == null) {
        ensureFeedIsMutable();
        feed_.add(index, builderForValue.build());
        onChanged();
      } else {
        feedBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder addAllFeed(
        java.lang.Iterable<? extends org.tensorflow.framework.TensorProto> values) {
      if (feedBuilder_ == null) {
        ensureFeedIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, feed_);
        onChanged();
      } else {
        feedBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder clearFeed() {
      if (feedBuilder_ == null) {
        feed_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        feedBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public Builder removeFeed(int index) {
      if (feedBuilder_ == null) {
        ensureFeedIsMutable();
        feed_.remove(index);
        onChanged();
      } else {
        feedBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder getFeedBuilder(
        int index) {
      return getFeedFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public org.tensorflow.framework.TensorProtoOrBuilder getFeedOrBuilder(
        int index) {
      if (feedBuilder_ == null) {
        return feed_.get(index);  } else {
        return feedBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
         getFeedOrBuilderList() {
      if (feedBuilder_ != null) {
        return feedBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(feed_);
      }
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder addFeedBuilder() {
      return getFeedFieldBuilder().addBuilder(
          org.tensorflow.framework.TensorProto.getDefaultInstance());
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder addFeedBuilder(
        int index) {
      return getFeedFieldBuilder().addBuilder(
          index, org.tensorflow.framework.TensorProto.getDefaultInstance());
    }
    /**
     * <pre>
     * Values of the tensors passed as arguments to the callable, in the order
     * defined in the CallableOptions.feed field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto feed = 3;</code>
     */
    public java.util.List<org.tensorflow.framework.TensorProto.Builder> 
         getFeedBuilderList() {
      return getFeedFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> 
        getFeedFieldBuilder() {
      if (feedBuilder_ == null) {
        feedBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder>(
                feed_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        feed_ = null;
      }
      return feedBuilder_;
    }

    private long requestId_ ;
    /**
     * <pre>
     * Unique identifier for this request. Every RunCallableRequest must
     * have a unique request_id, and retried RunCallableRequest must have
     * the same request_id. If request_id is zero, retry detection is disabled.
     * </pre>
     *
     * <code>int64 request_id = 4;</code>
     * @return The requestId.
     */
    public long getRequestId() {
      return requestId_;
    }
    /**
     * <pre>
     * Unique identifier for this request. Every RunCallableRequest must
     * have a unique request_id, and retried RunCallableRequest must have
     * the same request_id. If request_id is zero, retry detection is disabled.
     * </pre>
     *
     * <code>int64 request_id = 4;</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(long value) {
      
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier for this request. Every RunCallableRequest must
     * have a unique request_id, and retried RunCallableRequest must have
     * the same request_id. If request_id is zero, retry detection is disabled.
     * </pre>
     *
     * <code>int64 request_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      
      requestId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.RunCallableRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.RunCallableRequest)
  private static final org.tensorflow.distruntime.RunCallableRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.RunCallableRequest();
  }

  public static org.tensorflow.distruntime.RunCallableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunCallableRequest>
      PARSER = new com.google.protobuf.AbstractParser<RunCallableRequest>() {
    @java.lang.Override
    public RunCallableRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RunCallableRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RunCallableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunCallableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.RunCallableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

