package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		// 조건 판단과 분기
		// 실행되는 부분이 if, else if, else 에서 각 하나씩 분기로 이루어져 하나씩 실행되고 있다.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. : ");
		int n = stdIn.nextInt();
		stdIn.close();
		
		if (n > 0)
			System.out.println("이 수는 양수입니다.");
		else if (n < 0)
			System.out.println("이 수는 음수입니다..");
		else
			System.out.println("이 수는 0입니다.");
		
		if (n == 1)
			System.out.println("이 수는 1입니다.");
		else if(n == 2)
			System.out.println("이 수는 2입니다.");
		else if(n == 3)
			System.out.println("이 수는 3입니다.");
	}
}
