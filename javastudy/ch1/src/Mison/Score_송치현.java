package Mison;

import java.util.Scanner;

public class Score_송치현 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학점을 입력하세요> ");
		int score = sc.nextInt();

		System.out.println("점수는 " + score + "점 입니다.");
		if (score >= 90 && score <= 100)
			System.out.println("A학점 입니다.");
		else if (score >= 80)
			System.out.println("B학점 입니다.");
		else if (score >= 70)
			System.out.println("C학점 입니다.");
		else if (score >= 60)
			System.out.println("D학점 입니다.");
		else
			System.out.println("F학점 입니다.");
	}

}
