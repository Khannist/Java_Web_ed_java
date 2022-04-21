package ch12;

public class EarthExample {

	public static void main(String[] args) {
		Earth e1 = new Earth();
		System.out.println("지구의 반지름 : " + e1.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + e1.EARTH_AREA + "km^2");
		
		// 불변의 값을 상수(static final)라고 하낟. 원주율 파이
		// final 필드는 상수가 아니다. 생성자의 매개값을 통해서 여러가지 값을 가지기 때문이다.
		
		/* final 필드 : 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에
		 * 수정 할 수 없는 필드를 말한다. final 필드는 final 키워드로 선언한다.
		 * 
		 * 상수 : 수학에서 사용하는 원주율 파이나 지구의 무게 및 둘레 같은 불변의 값을 저장하는
		 * 필드를 자바에서는 상수(Constant)라고 한다. 상수는 final static 키워드로 선언한다.
		 * 
		 * 인스턴스 멤버 : 객체를 생성한 후 사용할 수 있는 필드와 메소드를 말한다.
		 * 이들은 각각 인스턴스 필드, 인스턴스 메소드라고 부른다.
		 * 
		 * 정적멤버 : 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를
		 * 말한다. 이들은 각각 정적 필드, 정적 메소드라고 말한다. static은 정적 멤버를 선언할 때 사용하는
		 * 키워드이다.
		 */
	}

}
