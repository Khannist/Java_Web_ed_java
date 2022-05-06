package ch13;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();

		sa.takeoff();
		sa.fly();
		sa.flyMode = 2;
		sa.fly();
		sa.flyMode = 1;
		sa.fly();
		sa.land();
	}

}
