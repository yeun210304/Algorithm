package chap01;

public class SumForTest {

	public static void main(String[] args) {
		first();
	}

	public static void first() {
		int sum = 0;

		for (int i = 1; i <= 7; i++)
			sum += i;

		System.out.println(sum);
	}
	
}
