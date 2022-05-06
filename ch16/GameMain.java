package ch16;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Character character = null;
		PlayGame pg = null;
		System.out.println("원하는 캐릭터를 선택하시오. \n1.피카츄 2.꼬북이 3.이상해씨");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			character = new Picachu();
			break;
		case 2:
			character = new Gobook();
			break;
		case 3:
			character = new Lee();
			break;
		default:
			System.out.println("잘못선택하셨습니다.");
		}
		if (character == null) {
			System.out.println("게임을 종료합니다.");
			return;
		} else {
			pg = new PlayGame(character);
		}
		while (true) {
			pg.printMenu(sc);
			if (pg.isExit()) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}

}
