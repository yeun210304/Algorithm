package level02;

import java.util.Scanner;

// 14681	사분면 고르기
public class ChoosingAqauadrant {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int result = 0;
		
		int firstInput = sc.nextInt();
		int secondInput = sc.nextInt();
		
		sc.close();
		
		if (firstInput > 0 && secondInput > 0) result = 1;
		else if (firstInput < 0 && secondInput > 0) result = 2;
		else if (firstInput < 0 && secondInput < 0) result = 3;
		else if (firstInput > 0 && secondInput < 0) result = 4;
		
		System.out.print(result);
	}
}
