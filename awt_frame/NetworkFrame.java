package awt_frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NetworkFrame extends Frame {
	TextField ipText;
	Label ip;
	Button input;
	TextArea inputText;
	public NetworkFrame(){
		setLayout(new FlowLayout());
		ip = new Label("¾ÆÀÌÇÇ");
		ipText = new TextField(20);
		input = new Button("´­·¯");
		input.addActionListener(new NetworkHandler());
		inputText = new TextArea(10,50);
		add(ip);	add(ipText);	add(input);	add(inputText);
	}
	
	public class NetworkHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String ipText_s = ipText.getText();
			int ip_i = Integer.parseInt(ipText_s.split("\\.")[0]);
			
			if(0 <= ip_i && ip_i <= 126){
				inputText.setText("A class");
			} else if (127 <= ip_i && ip_i <= 191){
				inputText.setText("B class");
			} else if (192 <= ip_i && ip_i <= 223){
				inputText.setText("C class");
			} else {
				inputText.setText("fuck you");
			}
		}
		
	}
}