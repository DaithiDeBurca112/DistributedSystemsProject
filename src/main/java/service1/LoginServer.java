package service1;
import java.io.IOException;
import java.util.logging.Logger;

import grpc.examples.user.UserServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import service1.UserServiceGrpc.UserServiceImplBase;
public class LoginServer  extends UserServiceImplBase {
	
		private static final Logger logger = Logger.getLogger(UserServer.class.getName());	
		public static void main(String[] args) throws IOException, InterruptedException {
			System.out.println("Starting gRPC Server");
			LoginServer Loginserver = new LoginServer();

			int port = 50051;

			try {
				Server server = ServerBuilder.forPort(port)
						.addService(Loginserver)
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
		@Override
		public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
			
			boolean loginSuccess = false;
			System.out.println("Inside UserService::Login()");
			String username = request.getUsername();
			String password = request.getPassword();

			LoginResponse.Builder response = LoginResponse.newBuilder();
			System.out.println("username = " + username + ", password = " + password);

			if(username.equals("david") && password.equals("1234")) {
				// return Success response
				loginSuccess = true;
				response.setResponseCode(1).setResponseMessage(username + ".....Successfully logged in"+ loginSuccess);
			}
			else {
				// return Success response
				response.setResponseCode(99).setResponseMessage(username + "... Sorry Login Failed");
			}

			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}




		@Override
		public void logout(LogoutRequest request, StreamObserver<LogoutResponse> responseObserver) {
			System.out.println("Inside UserService::Logout()");
			String username = request.getUsername();

			LogoutResponse.Builder response = LogoutResponse.newBuilder();
			System.out.println("Logging out username = " + username);

			if(username.equals("david")) {
				// return Success response
				response.setResponseCode(1).setResponseMessage(username + ".....Successfully logged out");
			}
			else {
				// return Success response
				response.setResponseCode(99).setResponseMessage(username +
						"... Sorry Logout Failed, user not logged in: " + username);
			}

			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

	}

			

			
			
	
	

