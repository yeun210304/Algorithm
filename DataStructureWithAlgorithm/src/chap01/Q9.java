package chap01;

import java.util.Scanner;

// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
public class Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sumof(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
    
    /**
     * 매개변수 a부터 b까지의 합을 구한다.
     * @param int a
     * @param int b
     * @return a~b까지 정수의 합
     */
    static int sumof(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }
}