package ch13;

public class BinaryTranslate {

	public static void main(String[] args) {
		int a[] = new int[8]; // 정수형 초깃값은 0 으로 채워짐
		int i = 0;
		int n = 10;
		while (n > 0) {
			a[i++] = n % 2;
			n /= 2;
		}
		for (i = 7; i >= 0; i--) {
			System.out.print(a[i]);
		}
		// a/ 10 5 2 1 0
		// a% 0 1 0 1
		// 답 : 0010
	}

}
