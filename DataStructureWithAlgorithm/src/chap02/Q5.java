package chap02;

import java.util.Arrays;
import java.util.Random;

public class Q5 {
    static Random rand = new Random();

    /**
     * 배열에 요소 값으로 난수를 추가한다.
     * @param a
     */
    static void insertElement(int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(100);
        }
    }

    /**
     * b의 모든 요소를 a에 역순으로 복사한다.
     * @param a
     * @param b
     */
    static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1];
    }

    public static void main(String[] args) {
        int[] b = new int[rand.nextInt(10)];
        int[] a = new int[rand.nextInt(10)];

        insertElement(b);
        insertElement(a);

        System.out.println("b : " + Arrays.toString(b));
        rcopy(a, b);
        System.out.println("a : " + Arrays.toString(a));
    }
}
