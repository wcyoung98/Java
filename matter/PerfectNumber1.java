package matter;

import java.util.ArrayList;

public class PerfectNumber1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		int sum = 0;
		int index = 0;
		
		for(int i = 1; i <= 10000; i++){
			for(int j = 1; j <= (i / 2); j++){
				if(i % j == 0) sum += j;
			}
			if(sum == i) list.add(i);
			sum = 0;
		}
		System.out.println(list);
	}

}
