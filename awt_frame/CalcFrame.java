package awt_frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFrame extends Frame {
	TextField input1, input2;
	Button add, sub, mul, div, erase;
	TextArea result;
	public CalcFrame(){
		setLayout(new FlowLayout());
		input1 = new TextField(20);
		add = new Button("+");
		add.addActionListener(new CalcHandler());
		sub = new Button("-");
		sub.addActionListener(new CalcHandler());
		mul = new Button("*");
		mul.addActionListener(new CalcHandler());
		div = new Button("/");
		div.addActionListener(new CalcHandler());
		erase = new Button("Áö¿ö");
		erase.addActionListener(new CalcHandler());
		input2 = new TextField(20);
		result = new TextArea(10, 50);
		
		add(input1);	add(add);	add(sub);
		add(mul);	add(div);	add(input2);
		add(erase);
		add(result);
	}
	public class CalcHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String str1 = input1.getText();
			String str2 = input2.getText();
			
			int i = Integer.parseInt(str1);
			int j = Integer.parseInt(str2);
			
			if(e.getSource() == add){
				result.setText(String.valueOf(i+j));
			} else if(e.getSource() == sub){
				result.setText(String.valueOf(i-j));
			} else if(e.getSource() == mul){
				result.setText(String.valueOf(i*j));
			} else if(e.getSource() == div){
				result.setText(String.valueOf(i/j));
			} else if(e.getSource() == erase){
				input1.setText("");
				input2.setText("");
				result.setText("");
			}
		}
		
	}
}