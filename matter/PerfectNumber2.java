package matter;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int index = 0;
		int input;
		
		System.out.println("입력 : ");
		input = scan.nextInt();
		
		for(int j = 1; j <= (input / 2); j++){
			if(input % j == 0) sum += j;
		}
		if(sum == input) System.out.println("완전수입니다.");
		else System.out.println("완전수가 아닙니다.");
	}

}