package level04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FlipTheBasket {
	// 10811	바구니 뒤집기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		int m = sc.nextInt();
		
	    for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0; i < m; i++) {
			List<Integer> lst = new ArrayList<Integer>();
			
			int a = sc.nextInt();
			int b = sc.nextInt();

			for (int j = 0; j < (b - a + 1); j++) {
				lst.add(j, arr[a - 1+ j]);
			}
			Collections.reverse(lst);
			
			for (int j = 0; j < lst.size(); j++) {
				arr[a - 1 + j] = lst.get(j);
			}
		}
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}