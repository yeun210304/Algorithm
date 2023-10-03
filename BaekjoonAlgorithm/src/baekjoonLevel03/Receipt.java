package baekjoonLevel03;

import java.util.Scanner;

// 25304	영수증
public class Receipt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int num = sc.nextInt();
		int itemPrice = 0;
		
		for (int i=0; i < num; i++) {
			int price = sc.nextInt();
			int item = sc.nextInt();
			
			itemPrice += price*item;
		}
		sc.close();
		
		System.out.print(sum == itemPrice ? "Yes" : "No");
	}
}