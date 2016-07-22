package study;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		//HashSet은 순서가 없음(랜덤)
		//중복 비허용
		HashSet set = new HashSet();
		Person[] p = new Person[10];
		for(int i = 0; i < 10; i++){
			p[i] = new Person(i+1);
			set.add(p[i]);
		}
		set.add(1);
		set.add(2);
		set.add(1);
		
		System.out.println(set);

	}

}