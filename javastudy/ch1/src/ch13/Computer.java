package ch13;

public class Computer extends Calculator {
	@Override // 메소드 오버라이딩 : 재정의
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;

		// 메소드 오버라이딩 : 상속관계하에서 상위클레스에서 사용된 메소드를 하웨클레스에 재정의하여 사용하는 기술.
	}
}
