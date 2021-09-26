package chap02;

public class IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};	// 배열 초기자에 의해 생성
		/* 
		 * 좀 더 명확하게 선언하자면
		 * int[] a = new int[]{1, 2, 3, 4, 5};
		 * 로 적을 수 있다.
		 */
		
		System.out.println("a의 길이는 " + a.length + "이다.");
		
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
