package baekjoonLevel05;

import java.util.Scanner;

// 27866	문자와 문자열
public class LettersAndStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String letter = in.nextLine();

		char[] arr = letter.toCharArray();
		
		System.out.println(arr[in.nextInt() - 1]);
		in.close();
	}
}