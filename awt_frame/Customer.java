package awt_frame;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Customer extends Frame{
	Label nameL, sexL, telL;
	TextField nameT, telT1, telT2, telT3;
	Choice sex;
	Button input;
	TextArea result;
	Panel panel1, panel2, panel3, panel4;
	
	public Customer(){
		panel1 = new Panel();
		panel1.setPreferredSize(new Dimension(400, 30));
		panel2 = new Panel();
		panel2.setPreferredSize(new Dimension(400, 30));
		panel3 = new Panel();
		panel3.setPreferredSize(new Dimension(400, 30));
		panel4 = new Panel();
		
		setLayout(new FlowLayout());
		nameL = new Label("이름");
		panel1.add(nameL);
		nameT = new TextField(15);
		panel1.add(nameT);
		sexL = new Label("성별");
		panel2.add(sexL);
		sex = new Choice();
		sex.add("남자");
		sex.add("여자");
		panel2.add(sex);
		telL = new Label("전화번호");
		panel3.add(telL);
		telT1 = new TextField(5);
		panel3.add(telT1);
		telT2 = new TextField(5);
		panel3.add(telT2);
		telT3 = new TextField(5);
		panel3.add(telT3);
		input = new Button("입력");
		input.addActionListener(new CusHandler());
		panel3.add(input);
		result = new TextArea(10,50);
		panel4.add(result);
		
		add(panel1);	add(panel2);	add(panel3);
		add(panel4);
	}
	
	
	public class CusHandler implements ActionListener{
		public void actionPerformed(ActionEvent a) {
			String sexS = "";
			String tel = telT1.getText() + "-" + telT2.getText() + "-" + telT3.getText();
			if(sex.getSelectedItem().equals("남자")) sexS = "man";
			else if(sex.getSelectedItem().equals("여자")) sexS = "woman";	
			Connection con = null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang", "root", "apmsetup");
				
				if(a.getSource() == input){
					String query2 = "insert into cus values(?,?,?)";
					PreparedStatement pstmt2 = con.prepareStatement(query2);
					pstmt2.setString(1, nameT.getText());
					pstmt2.setString(2, sexS);
					pstmt2.setString(3, tel);
					pstmt2.execute();
					pstmt2.close();
				}
				String query1 = "select name, sex, tel from cus";
				PreparedStatement pstmt1 = con.prepareStatement(query1);
				ResultSet rs = pstmt1.executeQuery();
				String str = "";
				while(rs.next()){
					str = str + rs.getString("name") + "(" + rs.getString("sex") + ") : " + rs.getString("tel") + "\n";
					result.setText(str);
				}
				pstmt1.close();
				con.close();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}