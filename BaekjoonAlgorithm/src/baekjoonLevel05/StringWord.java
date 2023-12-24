package baekjoonLevel05;

import java.util.Scanner;

// 9086	문자열
public class StringWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] strArr = new String[in.nextInt()];

		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = in.next();
		}

		for (int i = 0; i < strArr.length; i++) {
			String str = strArr[i];
			
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length() - 1));
		}
	}
}
