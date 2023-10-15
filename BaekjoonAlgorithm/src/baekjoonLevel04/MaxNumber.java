package baekjoonLevel04;

import java.util.Scanner;

public class MaxNumber {
	// 2562	최댓값
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int maxIndex = 0;
		int[] numArr = new int[9];
		 
		for (int i=0; i<numArr.length; i++) { 
			numArr[i] = sc.nextInt();
			
			if (max < numArr[i]) {
				max = numArr[i];
				maxIndex = i+1;
			}
			
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(maxIndex);
	}
}
