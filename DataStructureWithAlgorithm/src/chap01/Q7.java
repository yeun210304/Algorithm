package chap01;

import java.util.Scanner;

// n이 3이면 '1 + 2 + 3 = 6'로 출력하시오
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n을 입력하시오 : ");
        int n = sc.nextInt();
        int sum = 0;
        sc.close();

        for (int i = 1; i <= n; i++) {
            sum += i;

            if (i == n) {
                System.out.print(i + " = " + sum);
            } 
            else {
                System.out.print(i + " + ");
            }
        }
    }
}
