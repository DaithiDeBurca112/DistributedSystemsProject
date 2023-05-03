package service2;

import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import service2.BidirectionalServiceGrpc.BidirectionalServiceImplBase;
import service2.PriceServer;

public class PriceServer extends BidirectionalServiceImplBase{

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Starting gRPC PriceServer");
		PriceServer Priceserver = new PriceServer();

		int port = 50061;

		try {
			Server server = ServerBuilder.forPort(port)
					.addService(Priceserver)
					.build()
					.start();

			System.out.println("Server started with Port:" + server.getPort());
		    server.awaitTermination();

		}//try
		catch(IOException e){
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public void Request(Request request, StreamObserver<Response> responseObserver) {
		System.out.println("Inside PriceService::Calculate price()");
		String food = request.getFoodType();
		double weight = request.getQuantity();

		Response.Builder response = Response.newBuilder();
		
		double price = weight * 2.5;

       System.out.println("The price of " + weight + " KG of " + food + " is: $" + price);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	
	}
	
	
//	public void sendPrice(Response response, StreamObserver<Response> responseObserver) {
//		System.out.println("Inside UserService::Logout()");
//		String username = request.getUsername();
//
//		LogoutResponse.Builder response = LogoutResponse.newBuilder();
//		System.out.println("Logging out username = " + username);
//
//		if(username.equals("Enda")) {
//			// return Success response
//			response.setResponseCode(1).setResponseMessage(username + ".....Successfully logged out");
//		}
//		else {
//			// return Success response
//			response.setResponseCode(99).setResponseMessage(username +
//					"... Sorry Logout Failed, user not logged in: " + username);
//		}
//
//		responseObserver.onNext(response.build());
//		responseObserver.onCompleted();
//	}


}
	
	
