package study;

import java.util.HashSet;

public class Lotto {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		while(set.size() < 6){
			set.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(set);

	}

}
