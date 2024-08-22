package chap01;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n을 입력하시오 : ");
        int n = sc.nextInt();
        sc.close();
        
        spira(4);
        npira(n);
    }

    static void spira(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");    
            }
            for (int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void npira(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
