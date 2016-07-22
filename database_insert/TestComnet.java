package database_insert;
import java.sql.*;
public class TestComnet {
	/*
	 * 객체배열을 생성해서 데이터베이스에 값을 입력
	 */
	public static void main(String[] args) {
		Comnet[] c = new Comnet[5];
		c[0] = new Comnet("안병호", 173, 74);
		c[1] = new Comnet("박창율", 172, 60);
		c[2] = new Comnet("원치영", 176, 69);
		c[3] = new Comnet("안정우", 172, 80);
		c[4] = new Comnet("장재현", 172, 77);
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang", "root", "apmsetup");
			String query = "insert into comnet values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			for(Comnet hanyang : c){
				pstmt.setString(1, hanyang.getName());
				pstmt.setInt(2, hanyang.getHeight());
				pstmt.setInt(3, hanyang.getWeight());
				pstmt.execute();
			}
			pstmt.close();
			con.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("Success");
	}
}