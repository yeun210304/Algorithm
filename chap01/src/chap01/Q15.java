package chap01;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		triangleLB(n);

	}
	
	static void triangleLB(int n) { 		// 왼쪽 아래가 직각인 이등변 삼각형을 출력
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
			
	}
}
