package level06;

import java.util.Scanner;

public class Chess {
	// 	3003	킹, 퀸, 룩, 비숍, 나이트, 폰
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] cnt = new int[6];
		
		for (int i = 0; i < cnt.length; i++) {
			cnt[i] = in.nextInt();
			
			System.out.print(chess[i] - cnt[i] + " ");
		}
		in.close();
	}
}
