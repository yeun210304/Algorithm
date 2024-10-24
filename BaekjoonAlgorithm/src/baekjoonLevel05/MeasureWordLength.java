package baekjoonLevel05;

import java.util.Scanner;

// 2743	단어 길이 재기
public class MeasureWordLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		
		System.out.println(str.length());
	}
}