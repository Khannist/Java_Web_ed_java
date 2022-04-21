package ch11;

import java.util.Scanner; // 객체생성 후 CTRL + Shift + O를 누르면 자동 생성
import java.util.*;

public class Scanner1 {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("첫번째 수: ");
//		String strNum1 = scanner.nextLine(); // 키보드로 입력된 값을 strNum1에 저장
//		
//		
//		
//		System.out.print("두번째 수: ");
//		String strNum2 = scanner.nextLine(); // 키보드로 입력된 값을 strNum2에 저장
//		System.out.println();
//		
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);	
//		int result1 = num1 + num2;
//		int result1 = strNum1 + strNum2; 컴파일 에러
		
//		System.out.printf("%d + %d = %d",num1, num2, result1);
		
		//nextInt() 사용하면 바로 정수값으로 입력됨.
		//객체변수 jinsoo, num3 + num4 = result2
		
		Scanner jinsoo = new Scanner(System.in);
		
		System.out.print("num3 = ");
		int strNum3 = jinsoo.nextInt();
		
		System.out.print("num4 = ");
		int strNum4 = jinsoo.nextInt();
		
		int result2 = strNum3 + strNum4;
		System.out.println("num3 + num4 = " + result2);
	}

}
