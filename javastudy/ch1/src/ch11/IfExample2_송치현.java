package ch11;

public class IfExample2_송치현 {

	public static void main(String[] args) {
//		System.out.println(Math.random() * 6 + 1); // Math.random() 0~1미만의 랜덤수 발생, 0<= 수 < 1
		//주사위게임을 시작합니다. , 5~6 나오면 1~2등입니다. 벌금은 없습니다.
		// 3~4 나오면 3~4등 입니다. 벌금은 10,000원입니다.
		// 1~2 나오면 5~6등 입니다. 벌금은 20,000원입니다.
		int dice = (int) (Math.random() * 6 + 1);
		
		System.out.println("주사위 게임을 시작합니다.");
		
		System.out.println(dice + "이 나왔습니다.");
		
		if (dice == 6) {
			System.out.println("1등입니다. 벌금은 없습니다.");
		}else if (dice ==  5) {
			System.out.println("2등입니다. 벌금은 없습니다.");
		}else if (dice == 4){
			System.out.println("3등 입니다. 벌금은 10,000원입니다.");
		}else if (dice == 3){
			System.out.println("4등 입니다. 벌금은 10,000원입니다.");
		}else if (dice == 2){
			System.out.println("5등 입니다. 벌금은 20,000원입니다.");
		}else {
			System.out.println("6등 입니다. 벌금은 20,000원입니다.");
		}
		
	}

}
