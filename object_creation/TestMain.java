package object_creation;

public class TestMain {

	public static void main(String[] args) {
		Object o1 = new Object();
//		Object o2 = new InterA();  //interface는 객체로 생성불가능
//		Object o3 = new InterB();  //interface는 객체로 생성불가능
//		Object o4 = new InterC();  //interface는 객체로 생성불가능
//		Object o5 = new AbstractClassA();  //abstract는 객체로 생성불가능
		Object o6 = new ClassA();
		Object o7 = new ClassB();
		
//		InterA a1 = new Object();  //자식으로 아빠를 객체로 생성불가능
//		InterA a2 = new InterA();  //interface는 객체로 생성불가능
//		InterA a3 = new InterB();  //interface는 객체로 생성불가능
//		InterA a4 = new InterC();  //interface는 객체로 생성불가능
//		InterA a5 = new AbstractClassA();  //abstract는 객체로 생성불가능
		InterA a6 = new ClassA();
		InterA a7 = new ClassB();
		
//		InterB b1 = new Object();  //자식으로 아빠를 객체로 생성불가능
//		InterB b2 = new InterA();  //interface는 객체로 생성불가능
//		InterB b3 = new InterB();  //interface는 객체로 생성불가능
//		InterB b4 = new InterC();  //interface는 객체로 생성불가능
//		InterB b5 = new AbstractClassA();  //abstract는 객체로 생성불가능
		InterB b6 = new ClassA();
		InterB b7 = new ClassB();
		
//		InterC c1 = new Object();  //자식으로 아빠를 객체로 생성불가능
//		InterC c2 = new InterA();  //interface는 객체로 생성불가능
//		InterC c3 = new InterB();  //interface는 객체로 생성불가능
//		InterC c4 = new InterC();  //interface는 객체로 생성불가능
//		InterC c5 = new AbstractClassA();  //abstract는 객체로 생성불가능
//		InterC c6 = new ClassA();  //ClassA가 interC를 상속받고 있지 않아 불가능
		InterC c7 = new ClassB();
		
//		AbstractClassA aa1 = new Object();  //자식으로 아빠를 객체로 생성불가능
//		AbstractClassA aa2 = new InterA();  //interface는 객체로 생성불가능
//		AbstractClassA aa3 = new InterB();  //interface는 객체로 생성불가능
//		AbstractClassA aa4 = new InterC();  //interface는 객체로 생성불가능
//		AbstractClassA aa5 = new AbstractClassA();  //abstract는 객체로 생성불가능
		AbstractClassA aa6 = new ClassA();
//		AbstractClassA aa7 = new ClassB();  //ClassB가 AbstractClassA를 상속받고 있지 않아 불가능
		
//		ClassA ca1 = new Object();  //자식으로 아빠를 객체로 생성불가능
//		ClassA ca2 = new InterA();  //interface는 객체로 생성불가능
//		ClassA ca3 = new InterB();  //interface는 객체로 생성불가능
//		ClassA ca4 = new InterC();  //interface는 객체로 생성불가능
//		ClassA ca5 = new AbstractClassA();  //abstract는 객체로 생성불가능
		ClassA ca6 = new ClassA();
//		ClassA ca7 = new ClassB();  //ClassB가 ClassA를 상속받고 있지 않아 불가능
		
//		ClassB cb1 = new Object();  //자식으로 아빠를 객체로 생성불가능
//		ClassB cb2 = new InterA();  //interface는 객체로 생성불가능
//		ClassB cb3 = new InterB();  //interface는 객체로 생성불가능
//		ClassB cb4 = new InterC();  //interface는 객체로 생성불가능
//		ClassB cb5 = new AbstractClassA();  //abstract는 객체로 생성불가능
//		ClassB cb6 = new ClassA();  //ClassA가 ClassB를 상속받고 있지 않아 불가능
		ClassB cb7 = new ClassB();

	}

}