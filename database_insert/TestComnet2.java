package database_insert;

import java.sql.*;
import java.io.*;
import java.util.*;
/*
 * csv파일을 읽어와서 데이터베이스에 입력
 */
public class TestComnet2 {
	public static void main(String[] args) {		
		File file = new File("C:\\workspace\\insert.csv");  //불러올 파일
		Connection con = null;  //con으로 connection
		try {
			Scanner scan = new Scanner(file);
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang", "root", "apmsetup");
			String query = "insert into comnet values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			while(scan.hasNext()){  //행이 유효할 때까지 실행
				String str = scan.nextLine();  //한 행마다 저장
				System.out.println(str);
				String[] value = str.split(",");  //,로 구분 지어서 문자열을 나눔
				pstmt.setString(1, value[0]);
				pstmt.setInt(2, Integer.parseInt(value[1]));
				pstmt.setInt(3, Integer.parseInt(value[2]));
				pstmt.execute();
			}
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Success");


	}
}