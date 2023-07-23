package baekJoon_level01;

import java.util.Scanner;

public class Multiplication {
	// 10	2588	곱셈
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstInput = scanner.nextInt();
		int secondInput = scanner.nextInt();
	
		System.out.printf("%d\n", firstInput * (secondInput % 10));
		System.out.printf("%d\n", firstInput * ((secondInput % 100) / 10));
		System.out.printf("%d\n", firstInput * (secondInput / 100));
		System.out.printf("%d", firstInput * secondInput);
	}
}