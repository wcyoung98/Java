package matter;

public class NumberPlate {
/*
 * 숫자가 오름차순으로 된 번호판의 갯수 출력
 */
	public static void main(String[] args) {
		String str = "";
		int count = 0;
		
		for(int i = 0; i < 10000; i++){
			str = String.format("%04d", i);
			if(Integer.parseInt(str.substring(0,1)) < Integer.parseInt(str.substring(1,2)) && 
					Integer.parseInt(str.substring(1,2)) < Integer.parseInt(str.substring(2,3)) &&
					Integer.parseInt(str.substring(2,3)) < Integer.parseInt(str.substring(3,4)))
						count++;
		}
		
		System.out.println(count);
	}
}