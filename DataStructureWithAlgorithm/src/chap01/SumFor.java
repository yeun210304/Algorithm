package chap01;

import java.util.Scanner;

// 1부터 n까지의 합을 구합니다.
public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();
        int sum = 0;
        sc.close();

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("합 : " + sum);
    }
}
