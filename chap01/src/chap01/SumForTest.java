package chap01;

import java.util.Scanner;

public class SumForTest {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		first();
		
	}

	public static void first() {
		int sum = 0;

		for (int i = 1; i <= 7; i++)
			sum += i;

		System.out.println(sum);
	}
	
}
