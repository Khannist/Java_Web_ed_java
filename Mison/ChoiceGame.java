package Mison;

public class ChoiceGame {

	public static void main(String[] args) {
		int choice = (int) (Math.random() * 6) + 1;

		switch (choice) {
		case 1:
			System.out.println(choice + "이 나왔습니다. 6등입니다.\n벌금은 20000원 입니다.");
			break;
		case 2:
			System.out.println(choice + "가 나왔습니다. 5등입니다.\n벌금은 20000원 입니다.");
			break;
		case 3:
			System.out.println(choice + "이 나왔습니다. 4등입니다.\n벌금은 10000원 입니다.");
			break;
		case 4:
			System.out.println(choice + "가 나왔습니다. 3등입니다.\n벌금은 10000원 입니다.");
			break;
		case 5:
			System.out.println(choice + "가 나왔습니다. 2등입니다.\n벌금은 없습니다.");
			break;
		default:
			System.out.println(choice + "이 나왔습니다. 1등입니다.\n벌금은 없습니다.");
		}
	}

}
