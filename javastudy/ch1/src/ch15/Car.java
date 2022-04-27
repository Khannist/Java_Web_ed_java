package ch15;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 10);
	Tire backLeftTire = new Tire("뒤왼쪽", 40);
	Tire backRightTire = new Tire("뒤오른쪽", 30);

	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		} else if (frontRightTire.roll() == false) {
			stop();
			return 2;
		} else if (backLeftTire.roll() == false) {
			stop();
			return 3;
		} else if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
