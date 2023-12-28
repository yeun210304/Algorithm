package baekjoonLevel05;

import java.util.Scanner;

// 10809	알파벳 찾기
public class FindTheAlphabet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String word = in.next();
		in.close();
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.printf("%d ", word.indexOf(i));
		}
	}
}
