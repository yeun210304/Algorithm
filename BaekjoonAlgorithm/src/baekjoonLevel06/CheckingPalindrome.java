package baekjoonLevel06;

import java.util.Scanner;

// 	10988	팰린드롬인지 확인하기
public class CheckingPalindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		in.close();
		int sL = s.length();
		int res = 1;
		
		for (int i = 0; i < sL; i++) {
			if (s.charAt(i) != s.charAt(sL -1 - i)) {
				res = 0;
			}
		}
		
		System.out.println(res);
	}
}
