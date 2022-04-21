package ch11;

import java.util.Scanner;

class Tool {
	Scanner scanner = new Scanner(System.in);
	int balance = 0;
	int won = 0;
	void line() {
		for (int i=0;i<=36;i++)
			System.out.print("-");
		System.out.println("");
	}
	boolean inmenu(int menu) {
		switch (menu) {
		case 1:
			System.out.print("예금액> ");
			won = scanner.nextInt();
			balance += won;
			break;
		case 2:
			System.out.print("출금액> ");
			won = scanner.nextInt();
			if (balance < won)
				System.out.println("출금할 수 없습니다 현재잔고 " + balance + "입니다");
			else
				balance -= won;
			break;
		case 3:
			System.out.println("잔고>" + balance);
			break;
		case 4:
			System.out.println("프로그램 종료합니다.");
			return false;
		default:
			System.out.println("잘못된 입력입니다.");
			break;				
		}
		return true;
	}
}

public class WhileExample_송치현 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tool t = new Tool();
		boolean run = true;
		
		while (run) {
			t.line();
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			t.line();
			System.out.print("메뉴를 선택하세요> ");
			int menu = scanner.nextInt();
			run = t.inmenu(menu);
			
		}
	}

}
