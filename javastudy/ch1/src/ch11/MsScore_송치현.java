package ch11;

import java.util.Scanner;

class Score {
	public static void inscore(int num) {
		
		switch (num/10) {
		case 10:
		case 9: System.out.println("학점은 A 학점입니다.");break;
		case 8: System.out.println("학점은 B 학점입니다.");break;
		case 7: System.out.println("학점은 C 학점입니다.");break;
		case 6: System.out.println("학점은 D 학점입니다.");break; 
		default: System.out.println("학점은 F 학점입니다.");break;
		}
		
	}
}

public class MsScore_송치현 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Score score = new Score();
		
		while (true) {
			System.out.print("1. 학점입력 2. 종료: ");
			int yn = scanner.nextInt();
			if (yn == 1) {
				System.out.print("학점을 입력하세요. : ");
				int num = scanner.nextInt();
				System.out.println("입력된 점수는 " + num + "입니다.");
				if (num > 100) {
					System.out.println("학점을 다시 입력해 주십시오.");					
				}else {
					score.inscore(num);
				}
			}
			else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}


}
