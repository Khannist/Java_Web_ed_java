package ch13;

public class Account {

	public static final int MIN_BALANCE = 0; // 최소 한도액
	public static final int MAX_BALANCE = 1000000; // 최대 한도액

	private String ano; // 계좌번호
	private String name; // 이름
	private int balance; // 계좌잔액

	public Account(String ano, String name, int balance) { // Account 생성자
		this.ano = ano;
		this.name = name;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean decrementBalance(int money) {
		if (money > balance) { // 입력한 금액이 계좌잔액보다 많다면 false 리턴
			return false;
		} else {
			balance -= money; // 입력한 금액이 계좌잔액보다 적다면 잔액 - 입력한금액
			return true;
		}
	}

	public boolean incrementBalance(int money) {
		if (balance + money > MAX_BALANCE) { // 계좌잔액 + 입력한금액이 100만원보다 크다면 false 리턴
			return false;
		} else {
			balance += money; // 계좌잔액 + 입력한금액이 100만원보다 작다면 잔액에 입력한금액을 더한후 true 리턴
			return true;
		}
	}
}
