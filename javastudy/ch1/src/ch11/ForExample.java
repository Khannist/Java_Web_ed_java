package ch11;

public class ForExample {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i<=100;i++) {
//			sum += i;
//		}
//		System.out.println("1부터 100까지의 합(sum) = " + sum);
		
//		for (int m = 2; m<=9;m++) {
//			System.out.println("***" + m +"단***");
//			for (int n =1; n<=9;n++) {
//				System.out.println(m + " x " + n + " = " +( m*n));
//			}
//		}
		
		
//		int sum = 0;
//		
//		int i = 1;
//		
//		while (i <= 100) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~" + (i-1) + "의합 = " + sum);
		
//		
		for (int i = 0;i<=4;i++) {
			for (int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int p = 0;
		
		for (int i = 4;i>=1;i--) {
			for (int j = i;j>=1;j--) {
				System.out.print(" ");
			}
			for (int k = 0;k <= p;k++) {
				System.out.print("*");
			}
			System.out.println("");
			p++;
		}
		
		
	}

}
