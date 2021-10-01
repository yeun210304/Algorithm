package chap02;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("6개의 값을 입력하시오");
		int[] num = new int[6];
		for(int i = 0; i < num.length; i++) {
			System.out.print("x["+i+"]: ");
			num[i] = stdIn.nextInt();
		}
		reverse(num);
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	static void print(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
		
	static void swap(int[] num, int idx1, int idx2) {
		int t = num[idx1];
		num[idx1] = num[idx2];
		num[idx2] = t;
	}	
	
	static void reverse(int[] num) {
		print(num);
		for (int i = 0; i < num.length / 2; i++) {
			System.out.println("num["+num[i]+"]"+"와 a["+(num.length -i)+"]를 교환홥니다.");
			swap(num, i, num.length -i - 1);
			print(num);
		}
	}
}
