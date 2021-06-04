package chap01;

import java.util.Scanner;

public class Max3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 순차적(concatenation)구조 : 순차적으로 여러문장(프로세스)이 실행되는 구조.
		 * 선택(selection)구조 : () 안 식의 평가결과에 따라 프로그램의 실행흐름을 변경하는 if문.
		 */
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : "); int a = sc.nextInt();
		System.out.println("b의 값 : "); int b = sc.nextInt();
		System.out.println("c의 값 : "); int c = sc.nextInt();
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
