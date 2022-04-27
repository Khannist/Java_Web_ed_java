package ch13;

class Parent {
	int compute(int num) {
		if (num <= 1)
			return num;
		return compute(num - 1) + compute(num - 2);
	}
}

class Child extends Parent {
	int compute(int num) {
		if (num <= 1)
			return num;
		return compute(num - 1) + compute(num - 3); // 재귀호출
	}
}

public class Test {

	public static void main(String[] args) {
		Parent obj = new Child(); // 출력값 1
//		//형 변환, 상속관계상에서 메소드 오버라이딩을 하게 되면 반드시 자식클래스의 메소드로 호출한다.
//		Child 클래스의 compute() 메소드로 호출한다.
//		Parent obj = NEW Parent(); // 출력값 3
		System.out.println(obj.compute(4));
	}

}
