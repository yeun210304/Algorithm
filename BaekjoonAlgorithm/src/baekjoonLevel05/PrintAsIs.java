package baekjoonLevel05;

import java.util.Scanner;

// 11718	그대로 출력하기
public class PrintAsIs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cnt = 0;
		
		while(cnt < 100 && in.hasNextLine()) {
			cnt++;
			
			System.out.println(in.nextLine());
		}
		in.close();
	}
}
