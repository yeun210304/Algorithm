package chap01;

import java.util.Scanner;

// 1, 2, ... n의 합을 구합니다.
// while문이 종료될 때 변수 i 값이 n+1이 됨을 확인하세요
public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n을 입력하세요.");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        sc.close();

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("합계 : " + sum);
        System.out.println("i : " + i);
    }
}
