// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AntMessage.proto

package com.github.mxsm.serialization.protobuf;

/**
 * Protobuf type {@code com.github.mxsm.serialization.protobuf.Header}
 */
public final class Header extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.mxsm.serialization.protobuf.Header)
    HeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Header.newBuilder() to construct.
  private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Header() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Header();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Header(
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
          case 8: {

            sender_ = input.readInt64();
            break;
          }
          case 16: {

            receiver_ = input.readInt64();
            break;
          }
          case 26: {
            com.github.mxsm.serialization.protobuf.Terminal.Builder subBuilder = null;
            if (terminal_ != null) {
              subBuilder = terminal_.toBuilder();
            }
            terminal_ = input.readMessage(com.github.mxsm.serialization.protobuf.Terminal.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(terminal_);
              terminal_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.github.mxsm.serialization.protobuf.UserMetadata.Builder subBuilder = null;
            if (userMetadata_ != null) {
              subBuilder = userMetadata_.toBuilder();
            }
            userMetadata_ = input.readMessage(com.github.mxsm.serialization.protobuf.UserMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userMetadata_);
              userMetadata_ = subBuilder.buildPartial();
            }

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
    return com.github.mxsm.serialization.protobuf.AntMessage.internal_static_com_github_mxsm_serialization_protobuf_Header_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.mxsm.serialization.protobuf.AntMessage.internal_static_com_github_mxsm_serialization_protobuf_Header_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.mxsm.serialization.protobuf.Header.class, com.github.mxsm.serialization.protobuf.Header.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  private long sender_;
  /**
   * <code>int64 sender = 1;</code>
   * @return The sender.
   */
  @java.lang.Override
  public long getSender() {
    return sender_;
  }

  public static final int RECEIVER_FIELD_NUMBER = 2;
  private long receiver_;
  /**
   * <code>int64 receiver = 2;</code>
   * @return The receiver.
   */
  @java.lang.Override
  public long getReceiver() {
    return receiver_;
  }

  public static final int TERMINAL_FIELD_NUMBER = 3;
  private com.github.mxsm.serialization.protobuf.Terminal terminal_;
  /**
   * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
   * @return Whether the terminal field is set.
   */
  @java.lang.Override
  public boolean hasTerminal() {
    return terminal_ != null;
  }
  /**
   * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
   * @return The terminal.
   */
  @java.lang.Override
  public com.github.mxsm.serialization.protobuf.Terminal getTerminal() {
    return terminal_ == null ? com.github.mxsm.serialization.protobuf.Terminal.getDefaultInstance() : terminal_;
  }
  /**
   * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
   */
  @java.lang.Override
  public com.github.mxsm.serialization.protobuf.TerminalOrBuilder getTerminalOrBuilder() {
    return getTerminal();
  }

  public static final int USERMETADATA_FIELD_NUMBER = 4;
  private com.github.mxsm.serialization.protobuf.UserMetadata userMetadata_;
  /**
   * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
   * @return Whether the userMetadata field is set.
   */
  @java.lang.Override
  public boolean hasUserMetadata() {
    return userMetadata_ != null;
  }
  /**
   * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
   * @return The userMetadata.
   */
  @java.lang.Override
  public com.github.mxsm.serialization.protobuf.UserMetadata getUserMetadata() {
    return userMetadata_ == null ? com.github.mxsm.serialization.protobuf.UserMetadata.getDefaultInstance() : userMetadata_;
  }
  /**
   * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
   */
  @java.lang.Override
  public com.github.mxsm.serialization.protobuf.UserMetadataOrBuilder getUserMetadataOrBuilder() {
    return getUserMetadata();
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
    if (sender_ != 0L) {
      output.writeInt64(1, sender_);
    }
    if (receiver_ != 0L) {
      output.writeInt64(2, receiver_);
    }
    if (terminal_ != null) {
      output.writeMessage(3, getTerminal());
    }
    if (userMetadata_ != null) {
      output.writeMessage(4, getUserMetadata());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sender_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, sender_);
    }
    if (receiver_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, receiver_);
    }
    if (terminal_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTerminal());
    }
    if (userMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUserMetadata());
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
    if (!(obj instanceof com.github.mxsm.serialization.protobuf.Header)) {
      return super.equals(obj);
    }
    com.github.mxsm.serialization.protobuf.Header other = (com.github.mxsm.serialization.protobuf.Header) obj;

    if (getSender()
        != other.getSender()) return false;
    if (getReceiver()
        != other.getReceiver()) return false;
    if (hasTerminal() != other.hasTerminal()) return false;
    if (hasTerminal()) {
      if (!getTerminal()
          .equals(other.getTerminal())) return false;
    }
    if (hasUserMetadata() != other.hasUserMetadata()) return false;
    if (hasUserMetadata()) {
      if (!getUserMetadata()
          .equals(other.getUserMetadata())) return false;
    }
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSender());
    hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReceiver());
    if (hasTerminal()) {
      hash = (37 * hash) + TERMINAL_FIELD_NUMBER;
      hash = (53 * hash) + getTerminal().hashCode();
    }
    if (hasUserMetadata()) {
      hash = (37 * hash) + USERMETADATA_FIELD_NUMBER;
      hash = (53 * hash) + getUserMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.mxsm.serialization.protobuf.Header parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.mxsm.serialization.protobuf.Header parseFrom(
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
  public static Builder newBuilder(com.github.mxsm.serialization.protobuf.Header prototype) {
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
   * Protobuf type {@code com.github.mxsm.serialization.protobuf.Header}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.mxsm.serialization.protobuf.Header)
      com.github.mxsm.serialization.protobuf.HeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.mxsm.serialization.protobuf.AntMessage.internal_static_com_github_mxsm_serialization_protobuf_Header_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.mxsm.serialization.protobuf.AntMessage.internal_static_com_github_mxsm_serialization_protobuf_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.mxsm.serialization.protobuf.Header.class, com.github.mxsm.serialization.protobuf.Header.Builder.class);
    }

    // Construct using com.github.mxsm.serialization.protobuf.Header.newBuilder()
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
      sender_ = 0L;

      receiver_ = 0L;

      if (terminalBuilder_ == null) {
        terminal_ = null;
      } else {
        terminal_ = null;
        terminalBuilder_ = null;
      }
      if (userMetadataBuilder_ == null) {
        userMetadata_ = null;
      } else {
        userMetadata_ = null;
        userMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.mxsm.serialization.protobuf.AntMessage.internal_static_com_github_mxsm_serialization_protobuf_Header_descriptor;
    }

    @java.lang.Override
    public com.github.mxsm.serialization.protobuf.Header getDefaultInstanceForType() {
      return com.github.mxsm.serialization.protobuf.Header.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.mxsm.serialization.protobuf.Header build() {
      com.github.mxsm.serialization.protobuf.Header result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.mxsm.serialization.protobuf.Header buildPartial() {
      com.github.mxsm.serialization.protobuf.Header result = new com.github.mxsm.serialization.protobuf.Header(this);
      result.sender_ = sender_;
      result.receiver_ = receiver_;
      if (terminalBuilder_ == null) {
        result.terminal_ = terminal_;
      } else {
        result.terminal_ = terminalBuilder_.build();
      }
      if (userMetadataBuilder_ == null) {
        result.userMetadata_ = userMetadata_;
      } else {
        result.userMetadata_ = userMetadataBuilder_.build();
      }
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
      if (other instanceof com.github.mxsm.serialization.protobuf.Header) {
        return mergeFrom((com.github.mxsm.serialization.protobuf.Header)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.mxsm.serialization.protobuf.Header other) {
      if (other == com.github.mxsm.serialization.protobuf.Header.getDefaultInstance()) return this;
      if (other.getSender() != 0L) {
        setSender(other.getSender());
      }
      if (other.getReceiver() != 0L) {
        setReceiver(other.getReceiver());
      }
      if (other.hasTerminal()) {
        mergeTerminal(other.getTerminal());
      }
      if (other.hasUserMetadata()) {
        mergeUserMetadata(other.getUserMetadata());
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
      com.github.mxsm.serialization.protobuf.Header parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.mxsm.serialization.protobuf.Header) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long sender_ ;
    /**
     * <code>int64 sender = 1;</code>
     * @return The sender.
     */
    @java.lang.Override
    public long getSender() {
      return sender_;
    }
    /**
     * <code>int64 sender = 1;</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(long value) {
      
      sender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 sender = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      
      sender_ = 0L;
      onChanged();
      return this;
    }

    private long receiver_ ;
    /**
     * <code>int64 receiver = 2;</code>
     * @return The receiver.
     */
    @java.lang.Override
    public long getReceiver() {
      return receiver_;
    }
    /**
     * <code>int64 receiver = 2;</code>
     * @param value The receiver to set.
     * @return This builder for chaining.
     */
    public Builder setReceiver(long value) {
      
      receiver_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 receiver = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiver() {
      
      receiver_ = 0L;
      onChanged();
      return this;
    }

    private com.github.mxsm.serialization.protobuf.Terminal terminal_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.mxsm.serialization.protobuf.Terminal, com.github.mxsm.serialization.protobuf.Terminal.Builder, com.github.mxsm.serialization.protobuf.TerminalOrBuilder> terminalBuilder_;
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     * @return Whether the terminal field is set.
     */
    public boolean hasTerminal() {
      return terminalBuilder_ != null || terminal_ != null;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     * @return The terminal.
     */
    public com.github.mxsm.serialization.protobuf.Terminal getTerminal() {
      if (terminalBuilder_ == null) {
        return terminal_ == null ? com.github.mxsm.serialization.protobuf.Terminal.getDefaultInstance() : terminal_;
      } else {
        return terminalBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     */
    public Builder setTerminal(com.github.mxsm.serialization.protobuf.Terminal value) {
      if (terminalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        terminal_ = value;
        onChanged();
      } else {
        terminalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     */
    public Builder setTerminal(
        com.github.mxsm.serialization.protobuf.Terminal.Builder builderForValue) {
      if (terminalBuilder_ == null) {
        terminal_ = builderForValue.build();
        onChanged();
      } else {
        terminalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     */
    public Builder mergeTerminal(com.github.mxsm.serialization.protobuf.Terminal value) {
      if (terminalBuilder_ == null) {
        if (terminal_ != null) {
          terminal_ =
            com.github.mxsm.serialization.protobuf.Terminal.newBuilder(terminal_).mergeFrom(value).buildPartial();
        } else {
          terminal_ = value;
        }
        onChanged();
      } else {
        terminalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     */
    public Builder clearTerminal() {
      if (terminalBuilder_ == null) {
        terminal_ = null;
        onChanged();
      } else {
        terminal_ = null;
        terminalBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     */
    public com.github.mxsm.serialization.protobuf.Terminal.Builder getTerminalBuilder() {
      
      onChanged();
      return getTerminalFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     */
    public com.github.mxsm.serialization.protobuf.TerminalOrBuilder getTerminalOrBuilder() {
      if (terminalBuilder_ != null) {
        return terminalBuilder_.getMessageOrBuilder();
      } else {
        return terminal_ == null ?
            com.github.mxsm.serialization.protobuf.Terminal.getDefaultInstance() : terminal_;
      }
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.Terminal terminal = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.mxsm.serialization.protobuf.Terminal, com.github.mxsm.serialization.protobuf.Terminal.Builder, com.github.mxsm.serialization.protobuf.TerminalOrBuilder> 
        getTerminalFieldBuilder() {
      if (terminalBuilder_ == null) {
        terminalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.mxsm.serialization.protobuf.Terminal, com.github.mxsm.serialization.protobuf.Terminal.Builder, com.github.mxsm.serialization.protobuf.TerminalOrBuilder>(
                getTerminal(),
                getParentForChildren(),
                isClean());
        terminal_ = null;
      }
      return terminalBuilder_;
    }

    private com.github.mxsm.serialization.protobuf.UserMetadata userMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.mxsm.serialization.protobuf.UserMetadata, com.github.mxsm.serialization.protobuf.UserMetadata.Builder, com.github.mxsm.serialization.protobuf.UserMetadataOrBuilder> userMetadataBuilder_;
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     * @return Whether the userMetadata field is set.
     */
    public boolean hasUserMetadata() {
      return userMetadataBuilder_ != null || userMetadata_ != null;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     * @return The userMetadata.
     */
    public com.github.mxsm.serialization.protobuf.UserMetadata getUserMetadata() {
      if (userMetadataBuilder_ == null) {
        return userMetadata_ == null ? com.github.mxsm.serialization.protobuf.UserMetadata.getDefaultInstance() : userMetadata_;
      } else {
        return userMetadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     */
    public Builder setUserMetadata(com.github.mxsm.serialization.protobuf.UserMetadata value) {
      if (userMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userMetadata_ = value;
        onChanged();
      } else {
        userMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     */
    public Builder setUserMetadata(
        com.github.mxsm.serialization.protobuf.UserMetadata.Builder builderForValue) {
      if (userMetadataBuilder_ == null) {
        userMetadata_ = builderForValue.build();
        onChanged();
      } else {
        userMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     */
    public Builder mergeUserMetadata(com.github.mxsm.serialization.protobuf.UserMetadata value) {
      if (userMetadataBuilder_ == null) {
        if (userMetadata_ != null) {
          userMetadata_ =
            com.github.mxsm.serialization.protobuf.UserMetadata.newBuilder(userMetadata_).mergeFrom(value).buildPartial();
        } else {
          userMetadata_ = value;
        }
        onChanged();
      } else {
        userMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     */
    public Builder clearUserMetadata() {
      if (userMetadataBuilder_ == null) {
        userMetadata_ = null;
        onChanged();
      } else {
        userMetadata_ = null;
        userMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     */
    public com.github.mxsm.serialization.protobuf.UserMetadata.Builder getUserMetadataBuilder() {
      
      onChanged();
      return getUserMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     */
    public com.github.mxsm.serialization.protobuf.UserMetadataOrBuilder getUserMetadataOrBuilder() {
      if (userMetadataBuilder_ != null) {
        return userMetadataBuilder_.getMessageOrBuilder();
      } else {
        return userMetadata_ == null ?
            com.github.mxsm.serialization.protobuf.UserMetadata.getDefaultInstance() : userMetadata_;
      }
    }
    /**
     * <code>.com.github.mxsm.serialization.protobuf.UserMetadata userMetadata = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.mxsm.serialization.protobuf.UserMetadata, com.github.mxsm.serialization.protobuf.UserMetadata.Builder, com.github.mxsm.serialization.protobuf.UserMetadataOrBuilder> 
        getUserMetadataFieldBuilder() {
      if (userMetadataBuilder_ == null) {
        userMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.mxsm.serialization.protobuf.UserMetadata, com.github.mxsm.serialization.protobuf.UserMetadata.Builder, com.github.mxsm.serialization.protobuf.UserMetadataOrBuilder>(
                getUserMetadata(),
                getParentForChildren(),
                isClean());
        userMetadata_ = null;
      }
      return userMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.github.mxsm.serialization.protobuf.Header)
  }

  // @@protoc_insertion_point(class_scope:com.github.mxsm.serialization.protobuf.Header)
  private static final com.github.mxsm.serialization.protobuf.Header DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.mxsm.serialization.protobuf.Header();
  }

  public static com.github.mxsm.serialization.protobuf.Header getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Header>
      PARSER = new com.google.protobuf.AbstractParser<Header>() {
    @java.lang.Override
    public Header parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Header(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Header> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Header> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.mxsm.serialization.protobuf.Header getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

