package chap01;

import java.util.Scanner;

public class Q17 {

	// 아래를 향한 n단의 숫자 피라미드를 출력하시오	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력하시오");
		int n = sc.nextInt();
		npira(n);
	}
	
	static void npira(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
		
	}
}
