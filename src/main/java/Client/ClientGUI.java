package Client;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import grpc.examples.user.LogoutResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import service1.LoginRequest;
import service1.LoginResponse;
import service1.LogoutRequest;
import service1.UserServiceGrpc;
import service1.UserServiceGrpc.UserServiceBlockingStub;
import service1.UserServiceGrpc.UserServiceStub;
import service2.PriceServer;
import service2.Request;
import service2.Response;
import service3.LabelServer;

import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.TextField;

public class ClientGUI extends JFrame implements ActionListener {

//	private static final JButton button1 = null;
//	private static final JButton button2 = null;
//	private static final JButton button3 = null;
//	private JPanel contentPane;
	private static UserServiceBlockingStub blockingStub;
	private static UserServiceStub asyncStub;
	
	ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localHost", 50051).usePlaintext().build();
	PricePage pricePage = new PricePage();
	LabelPage labelPage = new LabelPage();

	JButton batchCodeGeneratorButton = new JButton("Create Batch Code");
	JButton priceGeneratorButton = new JButton("Create Price");
	JButton loginButton = new JButton("Login");
	JButton logoutButton = new JButton("Logout");

	JTextField nameField = new JTextField(20);
	JTextField passwordField = new JTextField(20);

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientGUI frame = new ClientGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientGUI() {

		JFrame service1Frame = new JFrame("Service 1");

//        JButton backButton = new JButton("Back");

		JLabel nameLabel = new JLabel("Name:");
		JLabel passwordLabel = new JLabel("Password:");

		service1Frame.add(nameLabel).setBounds(50, 100, 75, 25);
		service1Frame.add(passwordLabel).setBounds(50, 150, 75, 25);

		service1Frame.add(nameField).setBounds(125, 100, 200, 25);
		service1Frame.add(passwordField).setBounds(125, 150, 200, 25);

		service1Frame.add(loginButton).setBounds(50, 200, 75, 25);
		loginButton.addActionListener(this);
		service1Frame.add(logoutButton).setBounds(200, 200, 75, 25);
		loginButton.addActionListener(this);

		service1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		service1Frame.setSize(420, 420);
		service1Frame.setLayout(null);
		service1Frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Get the source of the event (i.e., which button was clicked)
		// JButton source = (JButton) e.getSource();

		if (e.getSource() == loginButton) {
			

			blockingStub = UserServiceGrpc.newBlockingStub(channel1);
			LoginRequest loginRequest = LoginRequest.newBuilder().setUsername((nameField.getText()))
					.setPassword(passwordField.getText()).build();

			LoginResponse response = blockingStub.login(loginRequest);
			System.out.println("Response from Server: " + response);

			asyncStub = UserServiceGrpc.newStub(channel1);

			if (nameField.getText().equals("david") && passwordField.getText().equals("1234")) {
				JFrame servicesFrame = new JFrame();
				JLabel serviceLabel = new JLabel("Service Menu");

				serviceLabel.setBounds(50, 100, 75, 35);

				serviceLabel.setText("Hello " + nameField.getText());

				servicesFrame.add(serviceLabel);
				servicesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				servicesFrame.setSize(420, 420);
				servicesFrame.setLayout(null);
				servicesFrame.setVisible(true);

				priceGeneratorButton.setBounds(125, 200, 100, 25);
				priceGeneratorButton.setFocusable(false);
				priceGeneratorButton.addActionListener(this);

				batchCodeGeneratorButton.setBounds(125, 300, 100, 25);
				batchCodeGeneratorButton.setFocusable(false);
				batchCodeGeneratorButton.addActionListener(this);

				servicesFrame.add(priceGeneratorButton);
				servicesFrame.add(batchCodeGeneratorButton);

			}

			
		}
		
		if (e.getSource() == logoutButton) {
			ManagedChannelBuilder.forAddress("localHost", 50051).usePlaintext().build();

			blockingStub = UserServiceGrpc.newBlockingStub(channel1);

			LogoutRequest logoutRequest = LogoutRequest.newBuilder().setUsername("david").build();

			service1.LogoutResponse logoutResponse = blockingStub.logout(logoutRequest);

			System.out.println("Response from Server: " + logoutResponse);

			asyncStub = UserServiceGrpc.newStub(channel1);

			nameField.setText("");
			passwordField.setText("");
		}

		if (e.getSource() == priceGeneratorButton) {
			 pricePage = new PricePage();
		}
		if (e.getSource() == batchCodeGeneratorButton) {
			 labelPage = new LabelPage();
		}

	}

}