package level03;

import java.util.Scanner;

// 2739	구구단
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= 9; i ++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
}
