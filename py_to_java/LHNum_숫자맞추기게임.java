package py_to_java;

import java.util.*;

class LHgame {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
					
	public int LHgame() {
		System.out.print("낮은 숫자를 입력하세요: ");
		int low = scanner.nextInt();
			
		System.out.print("높은 숫자를 입력하세요: ");
		int high = scanner.nextInt();
		int num = random.nextInt(high) + low;
		System.out.println();
		return num;
			
		}
	public int user_ask() {
		System.out.print("당신이 생각하는 숫자는 무엇인가요? : ");
		int ask = scanner.nextInt();
		return ask;
	}
	public boolean check(int ask, int comp_num) {
		if (ask == comp_num) {
			return true;
		}else {
			return false;			
		}
	}
	
	
}

public class LHNum_숫자맞추기게임 {
	
	
	public static void main(String[] args) {
		LHgame game = new LHgame();
		boolean state = true;
		
		int comp_num = game.LHgame();
		while (state) {
			int ask = game.user_ask();
			if (game.check(ask, comp_num)) {
				state = false;
				System.out.println("정확합니다. 게임에 승리하였습니다.");
			}
			else {
				if (ask <comp_num) {
					System.out.println("\n너무 낮은 숫자입니다.");
				}else if (ask > comp_num) {
					System.out.println("\n너무 높은 숫자입니다.");
				}
			}
		}
			
	}

}
