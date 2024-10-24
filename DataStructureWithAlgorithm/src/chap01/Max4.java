package chap01;

import java.util.Scanner;

/**
 * 네 값의 최댓값을 구하는 메서드를 작성하시요.
 */
public class Max4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("max : " + max4(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        sc.close();
    }

    public static int max4(int a, int b, int c) {
        int max = a;

        max = Math.max(max, Math.max(b, c));

        return max;
    }
}
