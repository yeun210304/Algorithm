package chap02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			System.out.print("num["+i+"]: ");
			num[i] = sc.nextInt();
		}
		System.out.print("num배열합계: "+sumOf(num));
	}
	
	static int sumOf(int[] a) {
		int[] b = a;
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		return sum;
	}
}
