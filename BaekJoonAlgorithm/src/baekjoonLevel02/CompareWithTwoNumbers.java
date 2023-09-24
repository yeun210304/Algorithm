package baekjoonLevel02;

import java.util.Scanner;

// 1330	두 수 비교하기
public class CompareWithTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputA = sc.nextInt();
		int inputB = sc.nextInt();
		
		System.out.println(inputA > inputB ? ">" : (inputA < inputB ? "<" : "=="));
		
		sc.close();
	}
}
