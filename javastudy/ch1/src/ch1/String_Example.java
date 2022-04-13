package ch1;

public class String_Example {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		System.out.print("문자열-> 정수로 강제변환 value1 : ");
		System.out.println(value1);
		
		double value2 = Double.parseDouble("3.14");
		System.out.print("문자열-> 실수로 강제변환 value2 : ");
		System.out.println(value2);
		
		boolean value3 = Boolean.parseBoolean("True");
		System.out.print("문자열-> 논리형으로 강제변환 value3 : ");
		System.out.println(value3);
		System.out.println("숫자로 변환완료, value1 + value2 : " + (value1 + value2));
		
//		String str1 = String.valueOf(10);
//		String str2 = String.valueOf(3.14);
//		String str3 = String.valueOf(true);
//		
//		System.out.println("정수형 -> 문자열로 강제변환 str1 : " + str1);
//		System.out.println("실수형 -> 문자열로 강제변환 str2 : " + str2);
//		System.out.println("논리형 -> 문자열로 강제변환 str3 : " + str3);
//		System.out.println("문자열로 변환완료, str1 + str2 : " + str1 + str2);
		
		// 미션 : v1 = 3.5, v2 = 2.7, result3 = v1 + v2, result 6
		double v1 = 3.5;
		double v2 = 2.7;
		double result3 = v1 + v2;
//		int result3 = (int) (v1 + v2);
//		System.out.println("result3 = " + result3);
		System.out.println("result3 = " + (int) result3);
		
		//chmod 751 test.txt
		//test.txt 파일에 대해 소유자에게 읽기,쓰기,실행 권한을 부여하고, 그룹사용자에게 읽기,실행 권한을 부여하고,
		//기타사용자에게 실행권한을 부여한다.
	}

}
