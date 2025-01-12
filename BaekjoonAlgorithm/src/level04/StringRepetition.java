package level04;

import java.util.Scanner;

// 2675	문자열 반복
public class StringRepetition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			int r = in.nextInt();
			
			String s = in.next();

			for (int k = 0; k < s.length(); k++) {
				for (int j = 0; j < r; j++) {
					System.out.print(s.charAt(k));
				}
			}
			System.out.println();
		}
		in.close();
	}
}
