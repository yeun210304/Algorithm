package level03;

import java.util.Scanner;

// 	8393	합
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.print(sum);
	} 
}
