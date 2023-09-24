package baekjoonLevel01;

import java.util.Scanner;
// 1008	A/B
public class AdivideB {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double firstNumber = scanner.nextDouble();
		double secondNumber = scanner.nextDouble();
		
		System.out.println(firstNumber / secondNumber);
		
		float inputFirst = scanner.nextFloat();
		float inputSecond = scanner.nextFloat();
		
		System.out.println(inputFirst / inputSecond);
	}
	
}
