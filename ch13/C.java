package ch13;

class A {
	void hello() {
		System.out.println("A say hello");
	}

	void coin() {
		System.out.println("COIN IS NARAK");
	}
}

class B extends A {
	void hello() {
		System.out.println("B say hello");
		System.out.println("hahahahahaha");
	}
}

public class C {

	public static void main(String[] args) {
		A a = new A();
		a.hello();
		B b = new B();
		b.hello();
		b.coin();
		a.coin();
	}

}
