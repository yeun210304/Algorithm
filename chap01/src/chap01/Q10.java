package chap01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// testQ10();
		testQ11();
	}

	public static void testQ10() {
		
		Scanner stdIn = new Scanner(System.in);
		
		int b;
		int a;
		
		do {
			System.out.println("b의 값을 입력하시오");
			 b = stdIn.nextInt();
			 System.out.println("a의 값을 입력하시오"); 
			 a = stdIn.nextInt();
		} while (a > b);
			System.out.printf("%d - %d의 값은 %d입니다",b,a,b-a);
	}
	
	public static void testQ11() {
		
		Scanner stdIn = new Scanner(System.in);
		
		int c;
		
		do {
			System.out.println("값을 입력하시오");
			c = stdIn.nextInt();
		} while (c <= 0);
			int count = 0;
			
			while(c > 0) {
				c /= 10;		// /= 이걸 몰라서...와...괜찮아..이제 알면 됐지..
				count++;
			}
		
		System.out.printf("입력하신 값의 자릿수는 %d자리입니다", count);
	}
	
}





















