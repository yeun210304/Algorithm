package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("사람 수 : ");
		int randnum = rand.nextInt(10);
		
		int[] height = new int[randnum];
		
		for (int i = 0; i < randnum; i++) {
			height[i] = 140 + rand.nextInt(60);
			System.out.println("height["+i+"]:"+height[i]);
		}
		
		System.out.println("제일 키가 큰 사람은" + maxOf(height) + "입니다.");
	}
	
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length;i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}
