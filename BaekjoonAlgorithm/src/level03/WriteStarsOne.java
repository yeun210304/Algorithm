package level03;

import java.util.Scanner;

public class WriteStarsOne {
	// 2438	별 찍기 - 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.close();

		String star = "";
		
		for (int i=0; i<t; i++) {
			star += "*";
			System.out.println(star);
		}
	}
}
