package ch13;

class Calculator2 {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCirlce() 실행");
		return 3.14159 * r * r;
	}
}

class Computer2 extends Calculator2 {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;

	}
}

public class ComputerExample2 {

	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
		System.out.println();
	}

}
