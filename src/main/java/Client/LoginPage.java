package Client;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import service1.LoginRequest;
import service1.LoginResponse;
import service1.LogoutRequest;
import service1.UserServiceGrpc;
import service1.UserServiceGrpc.UserServiceBlockingStub;
import service1.UserServiceGrpc.UserServiceStub;

public class LoginPage {
	private static UserServiceBlockingStub blockingStub;
	private static UserServiceStub asyncStub;
    
	LoginPage(){
    	
    	JFrame service1Frame = new JFrame("Service 1");
        JButton loginButton = new JButton("Login");
        JButton logoutButton = new JButton("Logout");
        JButton backButton = new JButton("Back");
        JLabel nameLabel = new JLabel("Name:");
        JPasswordField passwordLabel = new JPasswordField("Password:");
        JTextField nameField = new JTextField(20);
        JTextField idField = new JTextField(20);
        
    	service1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	service1Frame.setSize(420, 420);
    	service1Frame.setLayout(null);
    	service1Frame.setVisible(true);
    	
    	
    	ManagedChannel channel1 = ManagedChannelBuilder
				.forAddress("localHost", 50051).usePlaintext().build();
		
		blockingStub = UserServiceGrpc.newBlockingStub(channel1);
//		LoginRequest loginRequest = LoginRequest.newBuilder().setUsername("david").setPassword("1234").build();
//		LogoutRequest logoutRequest = LogoutRequest.newBuilder().setUsername("david").build();
//		
//		LoginResponse response = blockingStub.login(loginRequest);
//		System.out.println("Response from Server: " + response);
		
		
		
		asyncStub = UserServiceGrpc.newStub(channel1);
    }
}
