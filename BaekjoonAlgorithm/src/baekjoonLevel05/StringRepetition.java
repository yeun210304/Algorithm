package baekjoonLevel05;

import java.util.Scanner;

// 2675	문자열 반복
public class StringRepetition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for (int  i = 0;  i < t;  i++) {
			int r = in.nextInt();
			String str = in.next();
			
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(str.charAt(j));
				}
			}
		}
		in.close();
	}
}
