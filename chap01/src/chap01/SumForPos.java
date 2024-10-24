package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;					// 제어문 밖에서도 사용하기 위해 미리 선언
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do{
			System.out.print("n의 값: ");
			n = stdIn.nextInt();
		}while(n <= 0);			// 0보다 작은 숫자를 입력할 시 실행되지 않는다.
		stdIn.close();
		
		int sum = 0;			// 합
		
		for(int i = 1; i <= n; i++)
			sum += i;
		
		System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
	}
}
