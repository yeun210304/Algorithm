package baekjoonLevel03;

import java.util.Scanner;

public class AplusBminusFive {
	// 10952 A+B - 5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			
			if (sum == 0) {
				sc.close();
				break;
			}
			
			System.out.println(sum);
		}
	}
}