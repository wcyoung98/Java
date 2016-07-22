package study;

public class TestStaticModel {

	public static void main(String[] args) {
		StaticModel s1 = new StaticModel();
		StaticModel s2 = new StaticModel();
		StaticModel s3 = new StaticModel();

		s1.a = 1;
		s2.a = 2;
		s3.a = 3;
		
		StaticModel.hohoho();
		
		s1.hoho = 100;
		System.out.println(s3.hoho);
		System.out.println(StaticModel.hoho);
	}

}
