package ch11;

public class Car {
	String model;
	int speed;
	
	public Car(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i =10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(model + "가 달립니다.(시속: " + speed + "km/h)");
		}
	}
}
