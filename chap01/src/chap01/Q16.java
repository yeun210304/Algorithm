package chap01;

import java.util.Scanner;

public class Q16 {

	// n단의 피라미드를 출력하는 메서드를 작성하세요
	
	public static void main(String[] agrs) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 n을 입력하시오.");
		n = sc.nextInt();
		sc.close();
		
		spira(n);
	}
	
	static void spira(int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
