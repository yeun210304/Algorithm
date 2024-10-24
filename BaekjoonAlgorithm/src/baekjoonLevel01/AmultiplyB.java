package baekjoonLevel01;

import java.util.Scanner;
// 	10998	A×B
public class AmultiplyB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		scanner.close();

		System.out.print(firstNumber * secondNumber);
	}
}
