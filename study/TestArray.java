package study;

public class TestArray {

	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4, 5};
		//int b[] = new int[5];
		//b[0] = 1;
		for(int i = 0; i < 5; i++){
			System.out.println(a[i]);
		}
		
		//for each문
		for(int hanyang: a){
			System.out.println(hanyang);
		}

	}

}
