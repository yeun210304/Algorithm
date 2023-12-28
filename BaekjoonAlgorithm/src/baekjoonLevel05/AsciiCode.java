package baekjoonLevel05;

import java.util.Scanner;

// 11654	아스키 코드
public class AsciiCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.next();
		
		int asc = str.charAt(0);
		
		in.close();
		
		System.out.print(asc);
	}
}
