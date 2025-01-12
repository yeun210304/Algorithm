package level04;

import java.util.Scanner;

public class PutAball {

	// 10810	공 넣기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] res = new int[sc.nextInt()+1];
		int m = sc.nextInt();
		
		for (int a=1; a<=m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for (int b=i; b<=j; b++) {
				res[b] = k;
			}
		}
		sc.close();
		
		for (int i=1; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}