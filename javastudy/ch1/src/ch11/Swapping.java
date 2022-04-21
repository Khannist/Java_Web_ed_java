package ch11;

public class Swapping {

	public static void main(String[] args) {
		int x = 30;
		int y = 50;
		System.out.println("X: " + x + ", Y: " + y);
		System.out.println("X와 Y값을 교환합니다. 스와핑됩니다.\n");
		
		int temp1 = 0;
		temp1 = x;
		x = y;
		y = temp1;
		System.out.println("X: " + x + ", Y: " + y);
		System.out.println("X와 Y값이 스와핑 되었습니다.\n");
		
		//i 본인이름 , you 홍길동
		//나 : 이진수, 너: 홍길동
		// 나와 너의 이름을 스와핑 하겠습니다.
		
		String i = "송치현";
		String you = "홍길동";
		System.out.println("나 : " + i + ", 너 : " + you);
		System.out.println("나와 너의 이름을 스와핑 하겠습니다.\n");
		
		String temp2 = "";
		temp2 = i;
		i = you;
		you = temp2;
		
		System.out.println("나 : " + i + ", 너 : " + you);
		System.out.println("나와 너의 이름이 스와핑 되었습니다.\n");
		
	}

}
