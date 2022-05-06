package Mison;

import java.util.Scanner;

public class Score1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] names = new String[] { "이진수", "김진수", "십진수", "팔진수", "최진수" };

		int[] korScore = new int[5];
		int[] engScore = new int[5];
		int[] mathScore = new int[5];
		int[] sumScore = new int[5];
		double[] avgScore = new double[5];

		int[] ranking = new int[] { 1, 1, 1, 1, 1 };

		while (true) {
			System.out.println("성적관리 프로그램");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 프로그램 종료");
			System.out.println("선택 > ");

			int selectNum = Integer.parseInt(scan.nextLine());

			if (selectNum == 0) {

			} else if (selectNum == 1) {
				System.out.println("\n성적 정보를 입력하세요.");
				for (int i = 0; i < names.length; i++) {
					System.out.println(names[i] + "학생");
					System.out.print("국어 점수 : ");
					korScore[i] = Integer.parseInt(scan.nextLine());
					System.out.print("영어 점수 : ");
					engScore[i] = Integer.parseInt(scan.nextLine());
					System.out.print("수학 점수 : ");
					mathScore[i] = Integer.parseInt(scan.nextLine());

					sumScore[i] = korScore[i] + engScore[i] + mathScore[i];

					avgScore[i] = sumScore[i] / 3.0;
					System.out.println();

					for (int j = 0; j < i; j++) {
						if (avgScore[i] < avgScore[j]) {
							ranking[i]++;
						} else {
							ranking[j]++;
						}
					}
				}
			} else if (selectNum == 2) {
				chkScore: while (true) {
					System.out.println("--- 성적 조회 ---");
					System.out.println("1. 개인별 성적 조회");
					System.out.println("2. 과목별 성적 조회");
					System.out.println("3. 이전 메뉴 돌아가기");
					System.out.print("선택>");

					int selectChkScore = Integer.parseInt(scan.nextLine());
					switch (selectChkScore) {
					case 1:
						System.out.println("조회할 학생의 이름을 입력하세요.");
						String chkName = scan.nextLine();

						int idx = -1;

						for (int i = 0; i < names.length; i++) {
							if (chkName.equals(names[i])) {
								idx = i;
								break;
							}
						}
						if (idx == -1) {
							System.out.println("학생 정보를 찾을 수 없습니다.");
						} else {
							System.out.println(names[idx] + "학생 성적 정보");
							System.out.println("국어점수 : " + korScore[idx]);
							System.out.println("영어점수 : " + engScore[idx]);
							System.out.println("수학점수 : " + mathScore[idx]);
							System.out.println("총   점 : " + sumScore[idx]);
							System.out.println("평   균 : " + avgScore[idx]);
						}
						break;
					case 2:
						System.out.println("조회 하려는 과목을 선택하세요.");
						System.out.println("1. 국어점수");
						System.out.println("2. 영어점수");
						System.out.println("3. 수학점수");
						System.out.print("선택>");

						int selectSubjectNum = Integer.parseInt(scan.nextLine());

						int[] Score;
						String subject = "";

						if (selectSubjectNum == 1) {
							Score = korScore;
							subject = "국어";
						} else if (selectSubjectNum == 2) {
							Score = engScore;
							subject = "영어";
						} else if (selectSubjectNum == 3) {
							Score = mathScore;
							subject = "수학";
						} else {
							System.out.println("잘못 입력했습니다.");
							break;
						}
						int sum = 0;
						double avg = 0.0;

						for (int i = 0; i < Score.length; i++) {
							sum += Score[i];
						}

						avg = sum / (double) Score.length;

						System.out.println(subject + "과목의 총점 : " + sum);
						System.out.println(subject + "과목의 평균 : " + avg);

						break;

					case 3:
						break chkScore;
					default:
						System.out.println("잘못 입력했습니다.");
						System.out.println("다시 확인해 주세요.");
					}
				}
			} else if (selectNum == 3) {
				for (int i = 0; i < ranking.length; i++) {
					System.out.println(names[i] + "학생의 석차 :" + ranking[i] + "등");
				}
			} else if (selectNum == 4) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				;
			} else {
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인해 주세요." + "");
			}
		}
	}

}
