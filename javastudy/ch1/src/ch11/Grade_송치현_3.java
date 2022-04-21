package ch11;

import java.util.Scanner;
class Check {
	void grcheck(char ingrade) {
		switch (ingrade) {
			case 'A':
			case 'a':System.out.println("우수회원 입니다.");break;
			case 'B':
			case 'b':System.out.println("일반회원 입니다.");break;
			default: System.out.println("손님 입니다.");break;
					
		}
	}
}

public class Grade_송치현_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Check ck = new Check();
		
		System.out.print("등급을 입력해주세요: ");
		char ingrade = scanner.next().charAt(0);
		ck.grcheck(ingrade);
	}
	
}
