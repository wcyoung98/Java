package study;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		//list는 입력하는 순서대로 입력됨
		//중복값 허용
		ArrayList list = new ArrayList();  //import단축키 : ctrl + shift + O
		//다형성 ex)
		//List list = new Vactor();  //해도 아래의 add method는 사용가능
		Person[] p = new Person[10]; //Person타입의 10개의 배열 생성
		
		for(int i = 0; i < p.length; i++){
			p[i] = new Person(i);
			list.add(p[i]);
		}
		list.add(1);
		list.add(2);
		list.add(3, 999);
		House h = new House();
		list.add(h);
		
		System.out.println(list);

	}

}