package baekjoonLevel04;

import java.util.Scanner;

public class ChageAball {
	// 10813	공 바꾸기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ball = new int[sc.nextInt()];
		int m = sc.nextInt();
		
		for (int i = 1; i <= ball.length; i++) {
			ball[i-1] = i;
		}
		
		for (int j = 0; j < m; j++) {
			int firstIn = sc.nextInt();
			int secondIn = sc.nextInt();
			int firstBall = ball[firstIn-1];
			int secondBall = ball[secondIn-1];
			
			ball[firstIn-1] = secondBall;
			ball[secondIn-1] = firstBall;
		}
		sc.close();
		
		for (int i = 0; i < ball.length; i++) {
			System.out.printf("%d ", ball[i]);
		}
	}
}
