package baekjoonLevel02;

import java.util.Scanner;

// 2884	알람 시계
public class AlarmClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		sc.close();
		
		hour = 0 >= hour ? 24 : hour;
		
		int sum = (hour * 60 + min) - 45;
		int printHour = 0 > sum/60 ? 23 : sum/60;
		int printMin = sum % 60;
	
		System.out.println(printHour + " " + printMin);
	}
}
