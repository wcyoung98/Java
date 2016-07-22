package study;

public class IntegerTest {

	public static void main(String[] args) {
		byte b1 = Byte.MIN_VALUE;
		byte b2 = Byte.MAX_VALUE;
		short s1 = Short.MIN_VALUE;
		short s2 = Short.MAX_VALUE;
		int i1 = Integer.MIN_VALUE;
		int i2 = Integer.MAX_VALUE;
		long l1 = Long.MIN_VALUE;
		long l2 = Long.MAX_VALUE;
		
		System.out.println("byte의 범위 : " + b1 + " ~ " + b2);
		System.out.println("short의 범위 : " + s1 + " ~ " + s2);
		System.out.println("integer의 범위 : " + i1 + " ~ " + i2);
		System.out.println("long의 범위 : " + l1 + " ~ " + l2);
		
		System.out.println(Integer.toBinaryString(-128)); //128의 2의 보수로 표현됨
		System.out.println(Integer.toBinaryString(-65535)); //65535의 2의 보수로 표현됨
		System.out.println(Integer.toBinaryString(-4)); //4의 2의 보수로 표현됨
	}

}