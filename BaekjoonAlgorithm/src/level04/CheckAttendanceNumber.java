package level04;

import java.util.Scanner;

public class CheckAttendanceNumber {
	// 5597	과제 안 내신 분..?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inArr = new int[31];
		
		for (int i = 0; i < 28; i++) {
			inArr[sc.nextInt()] = 1;
		}
		sc.close();
		
		for (int i = 1; i < inArr.length; i++) {
			if (inArr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}