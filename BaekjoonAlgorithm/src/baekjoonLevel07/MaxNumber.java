package baekjoonLevel07;

import java.util.Scanner;

// 	2566	최댓값
public class MaxNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int maxNum = 0;
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = in.nextInt();
				
				maxNum = Math.max(arr[i][j], maxNum);
			}
		}
		in.close();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (maxNum == arr[i][j]) {
					row = i+1;
					col = j+1;
				}
			}
		}
		
		System.out.print(maxNum + "\n" + row + " " + col);
	}
}
