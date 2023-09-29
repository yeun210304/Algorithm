package baekjoonLevel01;

import java.util.Scanner;

public class Remain {
	// 9	10430	나머지
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("%d\n", (a + b) % c);
		System.out.printf("%d\n", ((a % c) + (b % c)) % c);
		System.out.printf("%d\n", (a * b) % c);
		System.out.printf("%d", ((a % c) * (b % c)) % c);
	}
}
