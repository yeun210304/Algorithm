package baekJoon_level02;

import java.util.Scanner;

// 	1330	두 수 비교하기
public class CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a > b ? ">" : (a < b ? "<" : "=="));
	}
}
