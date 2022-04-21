package ch11;

import java.util.*;
//키보드로 아이디와 패스워드 입력
//조건 이름 문자열, 패스워드 정수
//입력된 내용을 비교해서 아이디가 java이고 패스워드가 12345라면 로그인 성공을 출력하고,
//그렇지 않으면 로그인 실패 출력

public class Login_송치현 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("로그인 페이지");
		System.out.print("아이디 입력: ");
		String inid = scanner.nextLine();
		System.out.print("비밀번호 입력: ");
		int inpw = scanner.nextInt();
		
		
		if (inid.equals("java")){			
			if (inpw == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
		
	}

}
