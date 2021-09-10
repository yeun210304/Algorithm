package chap01;

import java.util.Scanner;

public class TestOfTest {

	public static void main(String[] args) {
		
		boolean a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		b = sc.nextInt();
		
		a = b <= 0;
		
		System.out.println(a);
		
	}
}
