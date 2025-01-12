package level03;

import java.util.Scanner;

public class AplusB_8 {
	// 11022	A+B - 8
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String[] out = new String[t];
		
		for (int i=0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			out[i] = "Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b);
		}
		sc.close();
		
		for (String o:out) System.out.println(o);
	}
}