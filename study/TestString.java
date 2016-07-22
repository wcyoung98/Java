package study;

public class TestString {

	public static void main(String[] args) {
		String a = new String("안녕하세요.");
		String b = new String("안녕하세요.");
		
		String c = "안녕하세요.";
		String d = "안녕하세요.";
		
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		
		if(a.equals("안녕하세요.")){
			System.out.println("같습니다.");
		}

	}

}