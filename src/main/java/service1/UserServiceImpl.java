// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Login.proto

package service1;

public final class UserServiceImpl {
  private UserServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LoginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LogoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LogoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LogoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LogoutResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Login.proto\022\004user\"2\n\014LoginRequest\022\020\n\010u" +
      "sername\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\">\n\rLogin" +
      "Response\022\027\n\017responseMessage\030\001 \001(\t\022\024\n\014res" +
      "ponseCode\030\002 \001(\005\"!\n\rLogoutRequest\022\020\n\010user" +
      "name\030\001 \001(\t\"?\n\016LogoutResponse\022\027\n\017response" +
      "Message\030\001 \001(\t\022\024\n\014responseCode\030\002 \001(\0052x\n\013U" +
      "serService\0222\n\005login\022\022.user.LoginRequest\032" +
      "\023.user.LoginResponse\"\000\0225\n\006logout\022\023.user." +
      "LogoutRequest\032\024.user.LogoutResponse\"\000B\035\n" +
      "\010service1B\017UserServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_user_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LoginRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_user_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LoginResponse_descriptor,
        new java.lang.String[] { "ResponseMessage", "ResponseCode", });
    internal_static_user_LogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_user_LogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LogoutRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_user_LogoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_user_LogoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LogoutResponse_descriptor,
        new java.lang.String[] { "ResponseMessage", "ResponseCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
