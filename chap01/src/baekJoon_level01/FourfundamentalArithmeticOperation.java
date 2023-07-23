package baekJoon_level01;

import java.util.Scanner;

public class FourfundamentalArithmeticOperation {
	// 6 사칙연산
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstInput = scanner.nextInt();
		int secondInput = scanner.nextInt();
		
		System.out.printf("%d\n", firstInput + secondInput);
		System.out.printf("%d\n", firstInput - secondInput);
		System.out.printf("%d\n", firstInput * secondInput);
		System.out.printf("%d\n", firstInput / secondInput);
		System.out.printf("%d\n", firstInput % secondInput);
	}
	
}
