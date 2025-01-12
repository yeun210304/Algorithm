package level02;

import java.util.Scanner;

// 2884	알람 시계
public class AlarmClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		sc.close();

		if (45 > min) {
			hour--;
			min = 60 - (45-min);
		}
		else min -= 45;
			
		if (0 > hour) hour += 24; 
		
		System.out.printf("%d %d", hour, min);
	}
}
