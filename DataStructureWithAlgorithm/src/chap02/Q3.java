package chap02;

import java.util.Arrays;
import java.util.Random;

public class Q3 {
    static Random rand = new Random();
    public static void main(String[] args) {
        int[] a = new int[rand.nextInt(10)];
        
        insertArrElement(a);
        System.out.println(Arrays.toString(a));

        System.out.println("a요소 합계 : " + sumOf(a));
    }

    /**
     * a에 요소를 추가한다.
     * @param a
     */
    static void insertArrElement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
    }

    /**
     * a요소 합계를 반환한다.
     * @param a
     * @return a요소 합계
     */
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
