package Mison;

public class Dice_송치현 {
//1~2 벌금x 3~4 벌금만원 5~6 벌금 2만원
	public static void main(String[] args) {
		int dice = (int) (Math.random() * 6 + 1);

		System.out.println(dice + "번이 나왔습니다.");
		switch (dice) {
		case 1:
			System.out.println("1등입니다 벌금은 없습니다.");
			break;
		case 2:
			System.out.println("2등입니다 벌금은 없습니다.");
			break;
		case 3:
			System.out.println("3등입니다 벌금은 10,000원입니다.");
			break;
		case 4:
			System.out.println("4등입니다 벌금은 10,000원입니다.");
			break;
		case 5:
			System.out.println("5등입니다 벌금은 20,000원입니다.");
			break;
		case 6:
			System.out.println("6등입니다 벌금은 20,000원입니다.");
			break;
		}
	}

}
