package ch11;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;	//char 2바이트 = 16비트 0~65535
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doublevalue : " + doubleValue);
		
		int intValue1 = 1010;
		byte byteValue1 = (byte) intValue1;
		System.out.println("Casting_int_to_byte : " + byteValue1);
		
		int intValue2 = 97;
		char charValue2 = (char) intValue2;
		System.out.println("Casting_int_to_char : " + charValue2);
		
		double doubleValue1 = 30.14;
		int intValue3 = (int) doubleValue1;
		System.out.println("Casting_double_to_int : " + intValue3);
		
		int byteValue4 = 97;
//		char charValue4 =  byteValue4; //컴파일에러, char에는 음수가 없어 안된다
	}
}
