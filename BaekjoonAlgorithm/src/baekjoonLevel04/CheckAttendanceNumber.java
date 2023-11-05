package baekjoonLevel04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CheckAttendanceNumber {
	// 5597	과제 안 내신 분..?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] result = new int[2];
		List<Integer> thirty = new ArrayList<Integer>();
		
		int[] inArr = new int[28];
		
		for (int i = 0; i < inArr.length; i++) {
			inArr[i] = sc.nextInt();
		}

		for (int i = 0; i < thirty.size(); i++) {
			thirty.add(i+1);
		}
		
		for (int i = 0; i < thirty.size(); i++) {
			for (int j = 0; j < inArr.length; j++) {
				if (thirty.get(i) == j) {
					thirty.remove(i);
				}
			}			
		}
		
		System.out.println(thirty.toString());
		
		
//		for (int i = 0; i < 28; i++) {
//			int in = sc.nextInt();
//			int who = 0;
//			int index = 0;
//			boolean same = false;
//
//			for (int j = 1; j <= 30; j++) {
//				if (in == j) {
//					same = true;
//					continue;
//				}
//			}
//			
//			if (!same) {
//				index++;
//				result[index] = who;
//			}
//		}		
//		
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
	}
}