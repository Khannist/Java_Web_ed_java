package ch11;

public class SwitchExample_송치현 {

	public static void main(String[] args) {
//		int num = (int) (Math.random() * 6) + 1;
//		
//		switch(num) {
//		case 1:
//			System.out.println("1번이 나왔습니다.");
//			break;
//		case 2:
//			System.out.println("2번이 나왔습니다.");
//			break;
//		case 3:
//			System.out.println("3번이 나왔습니다.");
//			break;
//		case 4:
//			System.out.println("4번이 나왔습니다.");
//			break;
//		case 5:
//			System.out.println("5번이 나왔습니다.");
//			break;
//		default:
//			System.out.println("6번이 나왔습니다.");
//			break;
//		}
		
		// 미션 : 8시 = 출근합니다. 9시 = 회의를 시작합니다.
		
		int time = (int) (Math.random() * (12 - 8)) + 8;
		
		System.out.println("현재 시각: " + time);
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");break;
		case 9:
			System.out.println("회의를 시작합니다.");break;
		case 10:
			System.out.println("업무를 봅니다.");break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}
		
		
	}

}
