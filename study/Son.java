package study;

public class Son extends Father {
	public Son(){  //생성자
		System.out.println("아들 기본 생성자");
	}
	
	void printNickName(){  //overriding
		System.out.println("존나 멋있는 최신 닉네임 아들");
	}
}