package py_to_java;

import java.util.*;

public class gugu_구구단 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("단을 입력하세요 : ");
			int ask = scanner.nextInt();
			
			if (ask <= 0) {
				break;
			}else {
				for (int i = 1;i < 10; i++) {
					System.out.printf("%d x %d = %d\n",ask,i,(ask*i));
				}
			}
		}
	}

}
