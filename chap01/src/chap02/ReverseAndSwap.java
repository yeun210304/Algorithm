package chap02;

import java.util.Random;
//뭐가 잘 안됨...다음 클래스에서 제대로 해보겠음
public class ReverseAndSwap {
	public static void main(String[] args) {
		// 배열 요소를 역순으로 정렬하기
		// 그 전에 저번에 배운 걸로 난수배열 n생성
		int i;
		Random rand = new Random();
		int[] n = new int[4];
		for(int j = 0; j < n.length; j++) {
			n[j] = rand.nextInt(51);
			System.out.println(n[j]);
		}
		// 간단한 역순배열 알고리즘 for(i = 0; i < n / 2; i++) 은 이렇다.
		// a[i]와 a[n-i-1]의 값을 교환.
		 for(i = 0; i < n.length / 2; i++) {
			 System.out.println("n[" + i + "]:" + n[i]);
		 }
		
		swap(n, 1, 2);
	}

	// 배열 요소 a[idx1]과 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		System.out.println("-------------\n" + "t:"+t+"\nidx1:"+idx1+"\nidx2:"+idx2);
		
	}
}












