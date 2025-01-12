package level05;

import java.util.Scanner;

// 	2908	상수
public class Constant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = Integer.parseInt(new StringBuilder(in.next()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(in.next()).reverse().toString());
		in.close();
		
		String max = Integer.toString(Math.max(a, b));
		
		System.out.println(max);
	}
}
