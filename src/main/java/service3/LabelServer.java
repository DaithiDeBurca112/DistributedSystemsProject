package service3;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import service3.LabelServer;
import service3.ServerStreamingServiceGrpc.ServerStreamingServiceImplBase;

public class LabelServer extends ServerStreamingServiceImplBase{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
			System.out.println("Starting gRPC LabelServer");
			LabelServer labelServer = new LabelServer();

			int port = 50071;

			try {
				Server server = ServerBuilder.forPort(port)
						.addService(labelServer)
						.build()
						.start();

				System.out.println("Label Server started with Port:" + server.getPort());
			    server.awaitTermination();

			}//try
			catch(IOException e){
				e.printStackTrace();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	
	@Override
    public void sendData(Request request, StreamObserver<Response> responseObserver) {
        // get the food item from the request
        String foodItem = request.getFoodItem();

        // generate the current date as a string
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateString = now.format(formatter);

        // create the response with the date
        Response response = Response.newBuilder().setDate(dateString).build();

        // send the response back to the client
        responseObserver.onNext(response);

        // complete the stream
        responseObserver.onCompleted();
    }

	}


