package ch12;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		System.out.println("제작회사 : " + mycar.company);
		System.out.println("모델명 : " + mycar.model);
		System.out.println("색깔 : " + mycar.color);
		System.out.println("최고속도 : " + mycar.maxSpeed);
		System.out.println("현재속도 : " + mycar.speed);
		
	}

}
