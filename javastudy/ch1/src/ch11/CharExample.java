package ch11;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041'; // 유니코드값 16진수로 저장
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		char c7 = 'a';
		char c8 = 97;
		int c9 = c7 + 1;
		char c10 = 'a' + 1;
		char c11 = 'A' + 1;
		
		System.out.println("c1 " + c1);
		System.out.println("c2 " + c2);
		System.out.println("c3 " + c3);
		System.out.println("c4 " + c4);
		System.out.println("c5 " + c5);
		System.out.println("c6 " + c6);
		System.out.println("c7 " + c7);
		System.out.println("c8 " + c8);
		System.out.println("c9 " + c9);
		System.out.println("c10 " + c10);
		System.out.println("c11 " + c11);
	}

}
