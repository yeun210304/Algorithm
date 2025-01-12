package level04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TheNumberLessThanX {
	// 10871	X보다 작은 수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] nArr = new int[n];
		
		List<String> lessThanX = new ArrayList<String>();
		
		for (int i=0; i<n; i++) {
			nArr[i] = sc.nextInt(); 
		}
		sc.close();
		
		for (int a : nArr) {
			if (a < x)
				lessThanX.add(a + " ");
		} 
		
		Iterator<String> lessThanXiter = lessThanX.iterator();
		
		while (lessThanXiter.hasNext())
			System.out.print(lessThanXiter.next());
	}
}
