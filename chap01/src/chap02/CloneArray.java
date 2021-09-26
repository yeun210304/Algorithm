package chap02;

public class CloneArray {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();	// b는 a의 복제를 참조
		
		b[3] = 0;
		
		System.out.print("a = ");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);
		
		System.out.print("\nb = ");
		for (int i = 0; i < b.length; i++)
			System.out.print(" " + b[i]);
		
		System.out.println("\n------------------------\n배열 요소의 최댓값 구하기");
		
		int max = a[0];
		
		if(a[1] > max) max = a[1];
		if(a[2] > max) max = a[2];
		if(a[3] > max) max = a[3];
		
		// 최댓값을 if문을 for문으로 간단히 만들면
		
		for (int i = 1; i < a.length; i++)
			if(a[i] > max) max = a[i];
		
		// 이런 식으로 적을 수 있다.
		
		System.out.println("배열 a에서 최댓값은 " + max + "이다.");
	}
}























