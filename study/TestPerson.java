package study;

public class TestPerson {

	public static void main(String[] args) {
		Person yang = new Person("정환", 15);  //reference variable(변수)
		System.out.println(yang);
		
		Person ahn = new Person("안");
		System.out.println(ahn);

//		Person won = new Person(); //생성자를 하나라도 만들어주면 기본 생성자가 사라짐.
	}

}