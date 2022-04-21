package ch11;

public class FloatExample {

	public static void main(String[] args) {
		float var1 = 3.14f;
		double var2 = 3.14;
		int var3 = 999999;
		byte var4 = 127;
		short var5 = 127;
		long var6 = 1270000000;
		char var7 = 'a';
		
		System.out.println("var1(실수) : " + var1);
		System.out.println("var2(실수) : " + var2);
		System.out.println("var3(정수) : " + var3);
		System.out.println("var4(정수) : " + var4);
		System.out.println("var5(정수) : " + var5);
		System.out.println("var6(정수) : " + var6);
		System.out.println("var7(문자) : " + var7);
		
		System.out.println();
		
		boolean stop = true;
		boolean state = false;
		
		if (stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		if (state) {
			System.out.println("오늘의 컨디션은 아주 좋습니다.");
		}else {
			System.out.println("오늘의 컨디션은 안 좋습니다.");
		}
	}

}
