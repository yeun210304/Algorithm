package level01;

import java.util.Scanner;

public class ADyear {
	// 8	18108	1998년생인 내가 태국에서는 2541년생?!
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("%d", scanner.nextInt() - 543);
		scanner.close();
	}
	
}
