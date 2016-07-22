package awt_frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtFrame extends Frame {
	TextField tf1, tf2;
	Label l1;
	Button b1, b2, b3;
	public AwtFrame(){
		setLayout(new FlowLayout());
		b1 = new Button("1");
		b1.addActionListener(new WonHandler());
		b2 = new Button("2");
		b2.addActionListener(new WonHandler());
		b3 = new Button("cancel");
		b3.addActionListener(new WonHandler());
		l1 = new Label("아이디: ");
		tf1 = new TextField(10);
		tf2 = new TextField(10);
		add(l1);
		add(tf1);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		//b1.setLabel("눌러라");
		//b2.setLabel("취소");
	}
	public class WonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1)
				tf1.setText("호호호");
			else if(e.getSource() == b2)
				tf2.setText("호호호");
			else if(e.getSource() == b3){
				tf1.setText("");
				tf2.setText("");
			}
		}
		
	}
}