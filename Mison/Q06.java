package Mison;

import java.util.Scanner;

// 배열을 이용하여, unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1} 화폐 단위
// 임의의 금액을 입력하여 화폐단위별 개수를 출력하라. 58950원, 50000원: 1, 10000원: 0, 5000원: 1

public class Q06 {

	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };

		while (true) {
			System.out.print("금액을 입력하세요.(나가기: -1) : "); // 68679 입력
			Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();

			if (money == -1) {
				System.out.println("종료합니다.");
				break;
			}
			for (int i = 0; i < unit.length; i++) {
				System.out.println(unit[i] + "의 개수 : " + (money / unit[i]));
				money -= ((money / unit[i]) * unit[i]);
			}
		}

	}

}
