package service2;

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
    comments = "Source: price.proto")
public final class BidirectionalServiceGrpc {

  private BidirectionalServiceGrpc() {}

  public static final String SERVICE_NAME = "BidirectionalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service2.Request,
      service2.Response> getSendDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendData",
      requestType = service2.Request.class,
      responseType = service2.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<service2.Request,
      service2.Response> getSendDataMethod() {
    io.grpc.MethodDescriptor<service2.Request, service2.Response> getSendDataMethod;
    if ((getSendDataMethod = BidirectionalServiceGrpc.getSendDataMethod) == null) {
      synchronized (BidirectionalServiceGrpc.class) {
        if ((getSendDataMethod = BidirectionalServiceGrpc.getSendDataMethod) == null) {
          BidirectionalServiceGrpc.getSendDataMethod = getSendDataMethod = 
              io.grpc.MethodDescriptor.<service2.Request, service2.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BidirectionalService", "SendData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service2.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service2.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new BidirectionalServiceMethodDescriptorSupplier("SendData"))
                  .build();
          }
        }
     }
     return getSendDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BidirectionalServiceStub newStub(io.grpc.Channel channel) {
    return new BidirectionalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BidirectionalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BidirectionalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BidirectionalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BidirectionalServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BidirectionalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<service2.Request> sendData(
        io.grpc.stub.StreamObserver<service2.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendDataMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                service2.Request,
                service2.Response>(
                  this, METHODID_SEND_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class BidirectionalServiceStub extends io.grpc.stub.AbstractStub<BidirectionalServiceStub> {
    private BidirectionalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<service2.Request> sendData(
        io.grpc.stub.StreamObserver<service2.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BidirectionalServiceBlockingStub extends io.grpc.stub.AbstractStub<BidirectionalServiceBlockingStub> {
    private BidirectionalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class BidirectionalServiceFutureStub extends io.grpc.stub.AbstractStub<BidirectionalServiceFutureStub> {
    private BidirectionalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BidirectionalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BidirectionalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendData(
              (io.grpc.stub.StreamObserver<service2.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BidirectionalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BidirectionalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service2.PriceServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BidirectionalService");
    }
  }

  private static final class BidirectionalServiceFileDescriptorSupplier
      extends BidirectionalServiceBaseDescriptorSupplier {
    BidirectionalServiceFileDescriptorSupplier() {}
  }

  private static final class BidirectionalServiceMethodDescriptorSupplier
      extends BidirectionalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BidirectionalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BidirectionalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BidirectionalServiceFileDescriptorSupplier())
              .addMethod(getSendDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
