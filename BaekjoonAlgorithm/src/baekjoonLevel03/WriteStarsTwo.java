package baekjoonLevel03;

import java.util.Scanner;

public class WriteStarsTwo {
	// 2439	별 찍기 - 2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String star = "";
		
		for (int i=1; i<=t; i++) {
			String space = "";
			star += "*";

			for (int j=0; j<t-i; j++) {
				space += " ";
			}
			
			System.out.print(space);
			System.out.println(star);
		} 
	}
}