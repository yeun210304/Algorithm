package baekjoonLevel04;

import java.util.Scanner;

public class FindTheCount {
	// 10807	개수 세기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nArr = new int[n];
		int count = 0;
		
		for (int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		sc.close();
		
		for (int a : nArr) {
			if (a == v) 
				count++;
		}
		
		System.out.print(count);
	}
}
