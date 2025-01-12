package level01;

import java.util.Scanner;

public class QuestionMark {
	// 7	10926	??!
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String id = scanner.next();
		scanner.close();
		
		System.out.printf("%s??!", id);
	}
}
