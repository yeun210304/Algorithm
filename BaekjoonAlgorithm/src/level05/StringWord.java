package level05;

import java.util.Scanner;

// 9086	문자열
public class StringWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		for (int i = 0; i < num; i++) {
			String str = in.next();
			
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length() - 1));
		}
		in.close();
	}
}
