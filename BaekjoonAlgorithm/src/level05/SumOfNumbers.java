package level05;

import java.util.Scanner;

// 11720	숫자의 합
public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int sum = 0;
		
		String str = in.next();
		in.close();
		
		for (int i = 0; i < num; i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.print(sum);
	}
}
