package baekjoonLevel02;

import java.util.Scanner;

// 9498	시험 성적
public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
	
		String result = "";
		
		sc.close();
	
		switch (score / 10) {
		case 10: 
		case 9 : result = "A";
			break;
		case 8 : result = "B";
			break;
		case 7 : result = "C";
			break;
		case 6 : result = "D";
			break;
		default: result = "F";
			break;
		}
		
		System.out.println(result);
	}
}