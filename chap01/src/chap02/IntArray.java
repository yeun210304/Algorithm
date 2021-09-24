package chap02;

public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5];	// 배열의 선언.
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
		
		/* 배열과 달리 일반 지역 변수는 초깃값으로 초기화되지 않아 실행시 오류가 발생한다.
		 
		int b;
		
		System.out.println("b 값은" + b);
		
		*/
	}
}
