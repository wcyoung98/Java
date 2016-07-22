package matter;

public class LockerRoom {

	public static void main(String[] args) {
		int[] a = new int[100];
		
		//a배열의 0으로 초기화
		for(int i = 0; i < 100; i++){
			a[i] = 0;
		}
		
		//2~100의 배수번호의 문을 여닫음
//		for(int i = 0; i < 100; i++){
//			for(int j = 2; j <= 100; j++){
//				if((i+1) % j == 0){
//					if(a[i] == 0) a[i] = 1;
//					else a[i] = 0;
//				}
//			}
//		}
		
		for(int i = 2; i <= 100; i++){
			for(int j = 1; j < 100; j++){
				if((j+1) % i == 0){
					if(a[j] == 0) a[j] = 1;
					else a[j] = 0;
				}
			}
		}
		
		//출력
		System.out.println("닫힌 문");
		for(int i = 0; i < 100; i++){
			if(a[i] == 0)System.out.println((i+1) + "번문");
		}
		System.out.println("열린 문");
		for(int i = 0; i < 100; i++){
			if(a[i] == 1)System.out.println((i+1) + "번문");
		}
		
	}

}