package level01;

import java.util.Scanner;

public class LittleJeongmin {
	// 11	11382	꼬마 정민
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		scanner.close();
		
		String[] inputArr = input.split(" ");
		
		long sum = 0;
		
		for (String i : inputArr) {
			sum += Long.parseLong(i);
		}
		
		System.out.print(sum);
	}
}
