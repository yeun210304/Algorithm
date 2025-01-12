package level06;

import java.util.Scanner;

// 2444	별 찍기 - 7
public class Stargazing7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.close();

		String b = " ";
		String s = "*";

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j< n-i; j++) {
				System.out.print(b);
			}
			for (int j = 0; j < i*2-1; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
 
		for (int i = n-1; i >= 0; i--) {
			for(int j = 0; j < n-i; j++) {
				System.out.print(b);
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}
