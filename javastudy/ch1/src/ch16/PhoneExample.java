package ch16;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("홍길동");

		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

		System.out.println("스마트폰 주인 : " + smartphone.owner);
	}

}
