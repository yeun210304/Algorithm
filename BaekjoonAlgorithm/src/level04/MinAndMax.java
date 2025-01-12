package level04;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {
	// 10818	최소, 최대
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		for (int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(nArr);
		
		System.out.printf("%d %d", nArr[0], nArr[n-1]);
	}
}