package ch13;

abstract class Animal { // abstract 추상클래스 : new 연산자를 통해서 객체를 생성하지 못하고.
						// 상속을 통해 자식클래스를 만들수 있다.
	String a = "is animal";

	abstract void look();

	void show() {
		System.out.println("Zoo");
	}
}

class Chicken extends Animal {
	Chicken() {
		look();
	}

	void look() {
		System.out.println("Chicken" + a);
	}

	void display() {
		System.out.println("two wings");
	}
}

public class ZooTest {
	public static void main(String[] args) {
		Animal a = new Chicken();
		a.show();
	}
}
