package ch13;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요> : ");
		int score = scanner.nextInt();

		System.out.printf("입력된 학점은 %d 입니다.\n", score);
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
			break;

		}
	}

}
