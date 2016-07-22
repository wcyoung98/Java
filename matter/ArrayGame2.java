package matter;

import java.util.Scanner;

public class ArrayGame2 {	
	public static void main(String[] args) {
		int count;
		int[][] array = new int[4][4];
		int number = 1;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++){  
			for(int j = 0; j < 4; j++){
				array[i][j] = number++;
			}
		}
		
		while(true){
			count = 0;
			for(int i = 0; i < 4; i++){  
				for(int j = 0; j < 4; j++){
					System.out.print(array[i][j] + "\t");
					if(0 == array[i][j]) count++;
				}
				System.out.println();
			}
			
			if(16 == count){
				System.out.println("Game Over");
				break;
			}
			
			System.out.println("1: 좌, 2: 우, 3: 위, 4: 아래");
			System.out.print("입력 : ");
			int input = scan.nextInt();
			
			switch(input){
			case 1:
				left(array);
				break;
			case 2:
				right(array);
				break;
			case 3:
				top(array);
				break;
			case 4:
				bottom(array);
				break;
			default: 
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	
	public static void left(int[][] array){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				array[i][j] = array[i][j+1];
			}
			array[i][3] = 0;
		}
	}
	
	public static void right(int[][] array){
		for(int i = 0; i < 4; i++){
			for(int j = 3; j > 0; j--){
				array[i][j] = array[i][j-1];
			}
			array[i][0] = 0;
		}
	}
	
	public static void top(int[][] array){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				array[j][i] = array[j+1][i];
			}
			array[3][i] = 0;
		}
	}
	
	public static void bottom(int[][] array){
		for(int i = 0; i < 4; i++){
			for(int j = 3; j > 0; j--){
				array[j][i] = array[j-1][i];
			}
			array[0][i] = 0;
		}
	}
}
