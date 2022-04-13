package ch1;

import java.util.*;

// 미션 : 컴퓨터가 랜덤으로 한 수를 기억하고 있습니다. 여러분이 컴퓨터 수를 맞춰보세요.
// 수의 범위는 0~50까지의 랜덤수를 컴퓨터가 기억하게 하세요.
// 객체생성 : userNum : 사용자가 입력할 수
// 컴퓨터랜덤수 객체 : comNum

public class DigitGame {

	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		Random comNum = new Random();
		
		int a = comNum.nextInt(50);
		System.out.println("컴퓨터가 랜덤 숫자를 기억하였습니다.");
		System.out.println(a);
		System.out.println("0 ~ 50 사이의 숫자를 맞춰보세요.");
		
		while (true){
			System.out.print("랜덤수를 입력하세요 : ");
			int b = userNum.nextInt();
			
			if(a == b) {
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("틀렸습니다.");
			}
		
		}

	}

}
