package study;

public class TestException {

	public static void main(String[] args) {
		try {
			String s1 = args[0];
			String s2 = args[1];
			System.out.println(s1 + "love" + s2);
		} catch(Exception e) {
			System.out.println("오류발생");
		}

	}

}
