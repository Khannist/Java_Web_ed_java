package ch1;

import java.util.ArrayList;
import java.util.*;

public class PrintExample {

	public static void main(String[] args) {
//		int value = 123;
//		System.out.printf("상품의 가격: %d원\n", value);
//		System.out.printf("상품의 가격: %6d원\n", value);
//		
//		String value1 = "이진수";
//		System.out.printf("%6s\n", value1);
//		System.out.printf("%-6s\n", value1);
//		System.out.printf("%-10s\n", value1);
//		
//		String name = "홍길동";
//		String job = "프로그래머";
//		System.out.printf("%6d | %-8s | %-8s\n", 1, name, job);
//		
//		
//		String name1 = "송치현";
//		String job1 = "엔지니어링";
//		System.out.printf("%6d | %-8s | %-8s\n\n\n", 2, name1, job1);
//		
//		int r = 10;
//		double area = 3.14159 * r * r;
//		System.out.printf("반지름이 %d인 원의 넓이: %8.2f\n",r , area);
//		System.out.printf("반지름이 %d인 원의 넓이: %-8.2f\n",r , area);
//		
		ArrayList lname = new ArrayList();
		ArrayList ljob = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i <= 4; i ++) {
			
			System.out.println("이름 = ");
			lname.add(scanner.nextLine());
			
			System.out.println("직업 = ");
			ljob.add(scanner.nextLine());
		}
		
		for (int i = 0; i < lname.size(); i++) {
			System.out.printf("%6d | %-8s | %-8s\n", i, lname.get(i), ljob.get(i));
		}
	}

}
