package Mison;

import java.util.Scanner;

// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하세요.
public class Exam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] intArray = new int[5];
		int max = 0;
		int min = 0;

		System.out.println("양수 5개 입력하세요.(1~999)");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			if (i == 0)
				min = intArray[i];
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 :" + max);
		System.out.println("가장 작은 수는 : " + min);

	}
}
