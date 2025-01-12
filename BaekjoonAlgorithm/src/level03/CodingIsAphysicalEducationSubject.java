package level03;

import java.util.Scanner;

// 25314	코딩은 체육과목 입니다
public class CodingIsAphysicalEducationSubject {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < num/4; i++) {
			System.out.print("long ");
		}
		
		System.out.print("int");
	}
}
