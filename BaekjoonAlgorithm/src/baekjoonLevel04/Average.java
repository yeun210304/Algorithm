package baekjoonLevel04;

import java.util.Scanner;

// 1546	평균
public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int subjectNum = sc.nextInt();

		double m = 0;
		double sum = 0;
		double[] subjectArr = new double[subjectNum]; 
		
		for (int i = 0; i < subjectNum; i++) {
			subjectArr[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < subjectArr.length; i++) { 
			m = Math.max(m, subjectArr[i]);
		}
		for (int i = 0; i < subjectArr.length; i++) {
			subjectArr[i] = subjectArr[i]/m*100; 
		}
		for (int i = 0; i < subjectArr.length; i++) {
			 sum += subjectArr[i];
		}
		System.out.println(sum/subjectNum);
	}
}
