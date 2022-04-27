package ch13;

public class SupersonicAireplaneExample1 {

	public static void main(String[] args) {
		SuperSonicAirplane1 sa = new SuperSonicAirplane1();

		sa.takeoff();
		sa.fly();
		sa.flyMode = 2;
		sa.fly();
		sa.flyMode = 1;
		sa.fly();
		sa.land();

	}

}

class SuperSonicAirplane1 extends Airplane1 {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
	}

}

class Airplane1 {
	public void land() {
		System.out.println("착륙합니다.");
	}

	public void fly() {
		System.out.println("일반비행합니다.");
	}

	public void takeoff() {
		System.out.println("이륙합니다.");
	}
}
