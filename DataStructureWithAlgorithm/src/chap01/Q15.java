package chap01;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n을 입력하시오 : ");
        int n = sc.nextInt();
        sc.close();

        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRU(n);
        System.out.println();
        triangleRB(n);
    }
    
    /**
     * 왼쪽 아래가 직각인 이등변 삼각형 출력
     * @param n
     */
    static void triangleLB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3s", "*");
            }
            System.out.println();
        }
    }

    /**
     * 왼쪽 위가 직각인 이등변 삼각형 출력
     * @param n
     */
    static void triangleLU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.printf("%3s", "*");
            }
            System.out.println();
        }
    }

    /**
     * 오른쪽 위가 직각인 이등변 삼각형 출력
     * @param n
     */
    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%3s", " ");    
            }
            for (int j = n; j > i; j--) {
                System.out.printf("%3s", "*");  
            }
            System.out.println();
        }
    }

    /**
     * 오른쪽 아래가 직각인 이등변 삼각형 출력
     * @param n
     */
    static void triangleRB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j+1 < n-i; j++) {
                System.out.printf("%3s", " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3s", "*");
            }
            System.out.println();
        }
    }
}
