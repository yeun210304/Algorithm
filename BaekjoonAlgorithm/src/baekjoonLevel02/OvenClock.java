package baekjoonLevel02;

import java.util.Scanner;
// 2525	오븐 시계
public class OvenClock {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		int total = hour*60 + min + time;
		int printHour = total / 60;
		int printMin = total % 60;
		
		if (printHour >= 24) printHour -= 24; 
		
		System.out.printf("%d %d", printHour, printMin);
		
	}
}
