package service3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: batch.proto")
public final class ServerStreamingServiceGrpc {

  private ServerStreamingServiceGrpc() {}

  public static final String SERVICE_NAME = "ServerStreamingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service3.Request,
      service3.Response> getSendDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendData",
      requestType = service3.Request.class,
      responseType = service3.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<service3.Request,
      service3.Response> getSendDataMethod() {
    io.grpc.MethodDescriptor<service3.Request, service3.Response> getSendDataMethod;
    if ((getSendDataMethod = ServerStreamingServiceGrpc.getSendDataMethod) == null) {
      synchronized (ServerStreamingServiceGrpc.class) {
        if ((getSendDataMethod = ServerStreamingServiceGrpc.getSendDataMethod) == null) {
          ServerStreamingServiceGrpc.getSendDataMethod = getSendDataMethod = 
              io.grpc.MethodDescriptor.<service3.Request, service3.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ServerStreamingService", "SendData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service3.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service3.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerStreamingServiceMethodDescriptorSupplier("SendData"))
                  .build();
          }
        }
     }
     return getSendDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerStreamingServiceStub newStub(io.grpc.Channel channel) {
    return new ServerStreamingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerStreamingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServerStreamingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerStreamingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServerStreamingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServerStreamingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendData(service3.Request request,
        io.grpc.stub.StreamObserver<service3.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSendDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                service3.Request,
                service3.Response>(
                  this, METHODID_SEND_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class ServerStreamingServiceStub extends io.grpc.stub.AbstractStub<ServerStreamingServiceStub> {
    private ServerStreamingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerStreamingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStreamingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerStreamingServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendData(service3.Request request,
        io.grpc.stub.StreamObserver<service3.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSendDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerStreamingServiceBlockingStub extends io.grpc.stub.AbstractStub<ServerStreamingServiceBlockingStub> {
    private ServerStreamingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerStreamingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStreamingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerStreamingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<service3.Response> sendData(
        service3.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getSendDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerStreamingServiceFutureStub extends io.grpc.stub.AbstractStub<ServerStreamingServiceFutureStub> {
    private ServerStreamingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerStreamingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStreamingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerStreamingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerStreamingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerStreamingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_DATA:
          serviceImpl.sendData((service3.Request) request,
              (io.grpc.stub.StreamObserver<service3.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServerStreamingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerStreamingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service3.BatchServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerStreamingService");
    }
  }

  private static final class ServerStreamingServiceFileDescriptorSupplier
      extends ServerStreamingServiceBaseDescriptorSupplier {
    ServerStreamingServiceFileDescriptorSupplier() {}
  }

  private static final class ServerStreamingServiceMethodDescriptorSupplier
      extends ServerStreamingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerStreamingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServerStreamingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerStreamingServiceFileDescriptorSupplier())
              .addMethod(getSendDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
