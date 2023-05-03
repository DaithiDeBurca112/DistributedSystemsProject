package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import service3.ServerStreamingServiceGrpc;
import service3.ServerStreamingServiceGrpc.ServerStreamingServiceBlockingStub;
import service3.ServerStreamingServiceGrpc.ServerStreamingServiceStub;
import service3.Request;

public class LabelPage extends JFrame implements ActionListener{
	
	private static ServerStreamingServiceBlockingStub blockingStub;
	private static ServerStreamingServiceStub asyncStub;
	JFrame service3Frame = new JFrame("Service 3");
         JButton batchCodeGeneratorButton = new JButton("Create Batch Code");
         JButton dateButton = new JButton("Date");
         JButton backButton = new JButton("Back");
         JLabel foodLabel = new JLabel("Food Item:");
         JLabel dateLabel = new JLabel("Date:");
         JTextField foodField = new JTextField(20);
         JTextField dateField = new JTextField(20);
         
         
	 LabelPage(){
		 service3Frame.add(foodLabel).setBounds(50,100,75,25);
		 service3Frame.add(dateLabel).setBounds(50,150,75,25);
		 
		 service3Frame.add(foodField).setBounds(125,100,200,25);
		 service3Frame.add(dateField).setBounds(125,150,200,25);
		 
		 
		 service3Frame.add(batchCodeGeneratorButton).setBounds(50, 200, 75, 25);
		 batchCodeGeneratorButton.addActionListener(this);


		 service3Frame.dispose();
         
         
        
	 }
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == batchCodeGeneratorButton) {
	 	
				 ManagedChannel channel3 = ManagedChannelBuilder
			 				.forAddress("localHost", 50071).usePlaintext().build();
			         
			 		blockingStub = ServerStreamingServiceGrpc.newBlockingStub(channel3);
			 		asyncStub = ServerStreamingServiceGrpc.newStub(channel3);
				
				 Request request = Request.newBuilder()
			         .setFoodItem(foodField.getText())
			         .build();
				 

	  
			}	
	 }
}
