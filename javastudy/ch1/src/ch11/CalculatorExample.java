package ch11;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Caculator.pi;
		int result2 = Caculator.plus(10, 5);
		int result3 = Caculator.minus(10, 5);
		
		System.out.printf("result1 = %f\n", result1);
		System.out.printf("result2 = %d\n", result2);
		System.out.printf("result3 = %d\n", result3);
		
		/*
		인스턴스 멤버: 객체(인스턴스)를 생성한 후 사용할 수 있는 필드와 메소드를 말하는데,
					이들은 각각 인스턴스 필드, 인스턴스 메소드라 부른다.
		정적 멤버 : 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를
					말한다. 이들을 각각 정적 필드, 정적 메소드라 부른다.
		static : 정적멤버를 선언할 때 사용하는 키워드이다.
		*/
	}

}
