package baekjoonLevel03;

import java.util.Scanner;
// 10950	A+B - 3
public class AplusB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] times = new int[num];
		int[] sum = new int[num];
		
		for (int i=0; i < times.length; i++) {
			sum[i] += sc.nextInt();
			sum[i] += sc.nextInt();
		}
		
		sc.close();
		
		for (int s : sum) 
			System.out.println(s);
	}
}
