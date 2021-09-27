package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int whatIsRand1 = rand.nextInt(3);
		int whatIsRand2 = rand.nextInt(3);
		int whatIsRand3 = rand.nextInt(3);
		System.out.println("whatIsRand : " + whatIsRand1);
		System.out.println("whatIsRand : " + whatIsRand2);
		System.out.println("whatIsRand : " + whatIsRand3);
		// 0부터 n-1개의 난수가 생성된다.
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 140 + rand.nextInt(60);		// 요소의 값을 난수로 결정
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
	
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < max) {
				max = a[i];
			}
		}
		return max;
	}
}
