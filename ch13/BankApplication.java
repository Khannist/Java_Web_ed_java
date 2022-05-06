package ch13;

import java.util.Scanner;

public class BankApplication {
	private static final int MAX_ACCOUNT = 2; // 최대 계좌수 2개로 제한
	private static final boolean SUCCESS = true; // 상수(Constant)

	private static Account[] accountArray = new Account[MAX_ACCOUNT]; // Account 클래스를 배열로 객체 생성 최대크니는 MAX_ACCOUNT만큼 지정
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu;

		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌해지 | 6.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("메뉴를 선택하세요> ");
			menu = sc.nextInt();

			if (menu == 1)
				createAccount();
			else if (menu == 2)
				accountList();
			else if (menu == 3)
				deposit();
			else if (menu == 4)
				withdraw();
			else if (menu == 5)
				removeAccount();
			else if (menu == 6)
				run = false;
		} while (run);
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");

		System.out.print("계좌번호: ");
		String accountNo = sc.next();

		System.out.print("계좌주: ");
		String owner = sc.next();

		System.out.println("초기입금액: ");
		int money = sc.nextInt();
		if (money > Account.MAX_BALANCE) { // 입력한 금액이 Account 클래스의 MAX_BALANCE보다 크다면 아래의 출력문 출력
			System.out.println("결과: 잔고 한도를 초괴합니다.");
			return; // 종료
		}
		int emptyAccountIndex = findEmptyAccount(); // emptyAccountIndex에 fintEmptyAccount()메소드 초기화

		if (emptyAccountIndex == -1) { // emptyAccountIndex가 -1이라면 아래의 출력문 출력
			System.out.println("계좌를 개설할 수 없습니다.");
		} else {
			accountArray[emptyAccountIndex] = new Account(accountNo, owner, money); // emptyAccountIndex가 -1이 아니라면
																					// acoountArray 객체리스트에 입력한
																					// 계좌번호,계좌주,초기입금액 초기화
																					// 자동호출 생성자
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
	}

	private static int findEmptyAccount() { // accountArray 객체리스트의 빈공간 찾는 메소드
		for (int i = 0; i < MAX_ACCOUNT; i++) { // MAX_ACCOUNT만큼 반복
			if (accountArray[i] == null) { // accountArray객체리스트의 i번째 인덱스의 값이 널이라면 i값 반환
				return i;
			}
		}
		return -1; // null값이 없다면 -1 반환
	}

	private static void accountList() { // 계좌리스트 출력문
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		for (int i = 0; i < MAX_ACCOUNT; i++) {
			Account account = accountArray[i]; // 계좌번호로 계좌리스트 검색
			if (account != null) { // account에 값이 있다면 출력
				System.out.printf("%7s%6s%8d\n", account.getAno(), account.getName(), account.getBalance());
			}
		}
	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano = sc.next();

		System.out.print("예금액: ");
		int money = sc.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌번호를 확인하세요.");
			return;
		}

		if (account.incrementBalance(money) == SUCCESS) {
			System.out.println("결과: 예금이 성공되었습니다.");
		} else {
			System.out.println("결과: 잔고 한도를 초과합니다.");
		}
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano = sc.next();

		System.out.print("출금액: ");
		int money = sc.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌번호를 확인하세요.");
			return;
		}
		boolean result = account.decrementBalance(money);

		if (result == SUCCESS) {
			System.out.println("결과: 출금이 성공되었습니다.");
		} else {
			System.out.println("결과: 잔액을 확인하세요.");
		}
	}

	private static void removeAccount() {
		System.out.println("--------");
		System.out.println("계좌해지");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String accountNo = sc.next();

		System.out.print("계좌주: ");
		String owner = sc.next();
		int accountIndex = findAccountIndex(accountNo);
		if (accountIndex == -1) {
			System.out.println("결과: 계좌를 확인하세요.");
		} else {
			Account account = accountArray[accountIndex];
			if (account.getName().equals(owner)) {
				accountArray[accountIndex] = null;
			} else {
				System.out.println("결과: 계좌를 확인하세요.");
			}
		}
	}

	private static Account findAccount(String ano) {
		int accountIndex = findAccountIndex(ano);
		if (accountIndex == -1) { // 입력한 계좌가 없다면 null값 반환
			return null;
		} else {
			return accountArray[accountIndex]; // 있다면 accountArray객체리스트의 accountIndex번째 리스트 반환
		}
	}

	private static int findAccountIndex(String ano) { // 계좌의 원하는 리스트 순서를 찾는 메소드
		for (int i = 0; i < MAX_ACCOUNT; i++) { // MAX_ACCOUNT만큼 반복
			if (accountArray[i] != null && ano.equals(accountArray[i].getAno())) { // accountArray객체리스트의 i번째가 널이 아니고 입력한
																					// 계좌번호가 accountArray i번째의 계좌번호와 같다면
				return i; // i를 반환
			}
		}
		return -1; // 아니라면 -1 반환
	}

}
