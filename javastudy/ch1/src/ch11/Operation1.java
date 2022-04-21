package ch11;

public class Operation1 {

	public static void main(String[] args) {
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		
		byte b = 100;
//		byte result3 = -b; // 컴파일에러, 부호연산 결과는 int이다.
		int result3 = -b;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		int x = 1;
		int y = 1;
		// x++ x= x + 1 ++x x += 1
//		int result4 = --x + 10;
//		int result5 = y-- + 10;
		int result4 = ++x + 10;
		int result5 = y++ + 10;
		// 전치연산자는 먼저 변수의 값을 증감하고 대입연산식에 반영한다.
		// 후치연산자는 대입연산자에 반영하지 않고 빠져 나올때 증감한다.
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("result4: " + result4);
		System.out.println("result5:\n " + result5);
		
		int c = 10;
		int d = 10;
		int e;
		
		System.out.println("---------------------------");
		c++;	//++,-- 증감연산자가 단독으로 나왔을때에는 전치,후치 연산을 따지지않음.
		++c;
		System.out.println("c=" + c);
		
		System.out.println("---------------------------");
		d--;
		--d;
		System.out.println("d=" + d);
		System.out.println("---------------------------");
		e = c++;
		System.out.println("e=" + e);
		System.out.println("c=" + c);
		System.out.println("---------------------------");
		e = ++c + --d + c++ + d--;
		System.out.println("c=" + c); // 15
		System.out.println("d=" + d); // 6
		System.out.println("e=" + e);
		System.out.println("---------------------------");
		e = c-- - d++ + ++c - --d;//
		System.out.println("c=" + c); // 
		System.out.println("d=" + d); //
		System.out.println("e=" + e);
		
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}

}
