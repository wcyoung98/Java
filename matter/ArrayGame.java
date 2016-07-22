package matter;

import java.util.Scanner;

public class ArrayGame {
	static int left = 0;  //left로 옮길때 사용할 인덱스변수
	static int right = 0;  //right로 옮길때 사용할 인덱스변수
	static int top = 0;  //top로 옮길때 사용할 인덱스변수
	static int bottom = 0;  //bottom로 옮길때 사용할 인덱스변수
	
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		int number = 1;  //2차원 배열에 할당할 변수
		Scanner scan = new Scanner(System.in);
		
		//2차원 배열에 1 ~ 16까지 할당
		for(int i = 0; i < 4; i++){  
			for(int j = 0; j < 4; j++){
				array[i][j] = number++;
			}
		}
		
		while(true){
			//2차원배열 출력
			for(int i = 0; i < 4; i++){  
				for(int j = 0; j < 4; j++){
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
			
			//모두 0이 되는 조건이 되면 프로그램 종료
			if(4 == left + right || 4 == top + bottom){  
				System.out.println("Game Over");
				break;
			}
			System.out.println("1: 좌, 2: 우, 3: 위, 4: 아래");
			System.out.print("입력 : ");
			int input = scan.nextInt();
			
			//입력 받은 값으로 메소드호출
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
	
	//왼쪽으로 밀어주는 메소드
	public static void left(int[][] array){
		for(int i = 0; i < 4; i++){
			for(int j = right; j < 3-left; j++){
				array[i][j] = array[i][j+1];
			}
			array[i][3-left] = 0;
		}
		left++;
	}
	
	//오른쪽으로 밀어주는 메소드
	public static void right(int[][] array){
		for(int i = 0; i < 4; i++){
			for(int j = 3-left; j > 0; j--){
				array[i][j] = array[i][j-1];
			}
			array[i][right] = 0;
		}
		right++;
	}
	
	//위쪽으로 밀어주는 메소드
	public static void top(int[][] array){
		for(int i = 0; i < 4; i++){
			for(int j = bottom; j < 3-top; j++){
				array[j][i] = array[j+1][i];
			}
			array[3-top][i] = 0;
		}
		top++;
	}
	
	//아래쪽으로 밀어주는 메소드
	public static void bottom(int[][] array){
		for(int i = 0; i < 4; i++){
			for(int j = 3-top; j > bottom; j--){
				array[j][i] = array[j-1][i];
			}
			array[bottom][i] = 0;
		}
		bottom++;
	}
}