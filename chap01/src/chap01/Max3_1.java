package chap01;

import java.util.Scanner;

public class Max3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
			3개의 정숫값을 입력하고 최댓값을 구합니다.
		 */
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : "); int a = sc.nextInt();
		System.out.println("b의 값 : "); int b = sc.nextInt();
		System.out.println("c의 값 : "); int c = sc.nextInt();
		sc.close();
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
