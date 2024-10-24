package baekjoonLevel01;

import java.util.Scanner;

public class Multiplication {
	// 10	2588	곱셈
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstInput = scanner.nextInt();
		int secondInput = scanner.nextInt();
		scanner.close();
	
		System.out.println("secondInput % 10 : " + secondInput % 10);
		System.out.println("(secondInput % 100) / 10) : " + (secondInput % 100) / 10);
		System.out.println("(secondInput / 100) : " + (secondInput / 100));
		System.out.printf("%d\n", firstInput * (secondInput % 10));
//		System.out.printf("%d\n", firstInput * ((secondInput % 100) / 10));
//		System.out.printf("%d\n", firstInput * (secondInput / 100));
//		System.out.printf("%d", firstInput * secondInput);
	}
}