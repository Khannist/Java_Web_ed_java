package ch1;

public class Four_add_1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		float f = (float) a / b;
		int g = a % b;
		char a_korea = 'K';
		String name = "홍길동";
		
		System.out.println("a + b : " + c);
		System.out.println("a - b : " + d);
		System.out.println("a * b : " + e);
		System.out.println("a / b : " + f);
		System.out.println("a % b : " + g);
		System.out.println("한 문자의 출력은 " + a_korea + "입니다.");
		System.out.println("문자열의 출력은 " + name + "입니다.");
		
		char charValue = 'A';
		System.out.println("charValue : " + charValue);
		int intValue = charValue;
		System.out.println("intValue : " + intValue);
		
		
		byte byteValue = 65;
		System.out.println("byteValue : " + byteValue);
		charValue = (char)byteValue;
		System.out.println("charValue : " + charValue);
		
		intValue = 65;
		charValue = (char)charValue;
		System.out.println("charValue : " + charValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue : " + intValue);
		
		byte x = 10;
		byte y = 20;
		int result = x + y;
		String str = "1" + 2 + 3;
		System.out.println(str);
	}

}
