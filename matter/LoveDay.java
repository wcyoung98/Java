package matter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LoveDay {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		String inputDate = scan.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date start = format.parse(inputDate);
		Date today = new Date();
		long time = (today.getTime() - start.getTime()) / (1000 * 60 * 60 * 24);
				
		System.out.println("오늘까지 사귄지 " + time + "일 되었습니다.");
	}
}