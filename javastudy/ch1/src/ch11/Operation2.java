package ch11;

public class Operation2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		boolean result4 = (num1 > num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result5 = (char1 < char2);
		System.out.println(result5);
		
		int charCode = 'A';
		
		if( (charCode >= 65) & (charCode <=90)) {
			System.out.println("대문자이군요!");
		}
		if( (charCode >= 97) & (charCode <=122)) {
			System.out.println("소문자이군요!");
		}
		if( !(charCode < 48) & !(charCode >157)) {
			System.out.println("소문자이군요!");
		}
		int value = 6;
		
		if ((value % 2 == 0) | (value%3 == 0)) {
			System.out.println("2또는 3의 배수이군요!");
		}
		int value1 = 45;
		
 	}

}
