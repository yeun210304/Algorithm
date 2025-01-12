package level02;

import java.util.Scanner;

// 2480	주사위 세개
public class ThreeDices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int reward = 0;
		int max = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();

		if (a == b) {
			if (b == c) reward = 1;
			else reward = 2;
			
			max = a;
		}
		else if (a == c) {
			if (c == b) reward = 1;
			else reward = 2;
			
			max = a;
		}
		else if (b == c) {
			if (c == a) reward = 1;
			else reward = 2;
			
			max = b;
		}
		else {
			reward = 3;
			
			max = Math.max(a, Math.max(b, c));
		} 
		
		switch (reward) {
		case 1: reward = 10000 + max*1000; 
			break;
		case 2: reward = 1000 + max*100;
			break;
		case 3: reward = max * 100;
			break;
		default:break;
		}
		
		System.out.print(reward);
	}
}