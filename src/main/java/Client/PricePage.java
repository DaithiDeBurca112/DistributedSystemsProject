package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import service1.UserServiceGrpc;
import service2.BidirectionalServiceGrpc;
import service2.BidirectionalServiceGrpc.BidirectionalServiceBlockingStub;
import service2.BidirectionalServiceGrpc.BidirectionalServiceStub;
import service2.Request;

public class PricePage extends JFrame implements ActionListener{
	
	private static BidirectionalServiceBlockingStub blockingStub;
	private static BidirectionalServiceStub asyncStub;
	
	JFrame service2Frame = new JFrame("Service 2");
    
    JButton priceGeneratorButton = new JButton("Create Price");
    JButton backButton = new JButton("Back");
    
    JLabel foodLabel = new JLabel("Food Item:");
    JLabel weightLabel = new JLabel("Weight (KG):");
    
    JTextField foodField = new JTextField(20);
    JTextField weightField = new JTextField(20);
    
    
    
    //double d;
	
	PricePage(){
		
		
		service2Frame.add(foodLabel).setBounds(50,100,75,25);
		service2Frame.add(weightLabel).setBounds(50,150,75,25);
		
		service2Frame.add(foodField).setBounds(125,100,200,25);
		service2Frame.add(weightField).setBounds(125,150,200,25);
		//d = Double.parseDouble(weightField.getText());
		service2Frame.add(priceGeneratorButton).setBounds(50, 200, 75, 25);
		priceGeneratorButton.addActionListener(this);
		
		service2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		service2Frame.setSize(420, 420);
		service2Frame.setLayout(null);
		service2Frame.setVisible(true);
		
    	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == priceGeneratorButton) {
			ManagedChannel channel2 = ManagedChannelBuilder
				.forAddress("localHost", 50061).usePlaintext().build();
		blockingStub = BidirectionalServiceGrpc.newBlockingStub(channel2);
		
		asyncStub = BidirectionalServiceGrpc.newStub(channel2);
    	
        Request request = Request.newBuilder()
                .setFoodType(foodField.getText())
             //   .setQuantity(d)
                .build();
	}
		
		
		
	}

}
