package ch11;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score = scanner.nextInt();
		
		if (score >= 90 & score <= 100) {
			System.out.println("점수가 90~100입니다.");
			System.out.println("등급은 A 입니다.");
		}else if (score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B 입니다.");
		}else if (score >= 70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C 입니다.");
		}else if (score >= 60) {
			System.out.println("점수가 60~69입니다.");
			System.out.println("등급은 D 입니다.");
		}else {
			System.out.println("점수가 0~59입니다.");
			System.out.println("등급은 F 입니다.");
		}
	}

}
