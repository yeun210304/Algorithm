package baekJoon_level01;

import java.util.Scanner;
// 	10869	사칙연산
public class FourfundamentalArithmeticOperation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstInput = scanner.nextInt();
		int secondInput = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("%d\n", firstInput + secondInput);
		System.out.printf("%d\n", firstInput - secondInput);
		System.out.printf("%d\n", firstInput * secondInput);
		System.out.printf("%d\n", firstInput / secondInput);
		System.out.printf("%d\n", firstInput % secondInput);
	}
	
}
