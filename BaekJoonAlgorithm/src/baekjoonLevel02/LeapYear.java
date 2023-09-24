package baekjoonLevel02;

import java.util.Scanner;

// 2753	윤년
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		System.out.print(year%4 == 0 && (year%100 != 0 || year%400 == 0) ? 1 : 0);
	}
}
