package chap03;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    int[] x;
    int ky;
    int idx;

    Q2() {  
        this.x = new int[7];
        makeRandomLiterals(x);
    }

    Q2(int[] x, int ky, int idx) {
        this.x = x;
        this.ky = ky;
        this.idx = idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 q2 = new Q2();
        q2.idx = q2.findKy();

        System.out.print("0 ~ 9 중 검색할 값을 입력하시오 : ");
        do {
            q2.ky = sc.nextInt();
        } while (11 < q2.ky ||  q2.ky < -1);
        sc.close();

        q2.printResult();
    }

    int findKy() {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == ky) {
                return i;
            }
        }
        return -1;
    }
    
    void printResult() {
        if (idx == -1) {
            System.out.println();
            System.out.printf("%d은 배열에 존재하지 않습니다.", ky);    
            return;
        }

        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                System.out.print("   |");
                for (int j = 0; j < x.length; j++) {
                    System.out.printf(" %d ", j);
                }
                System.out.println();
                System.out.print("---+");
                for (int j = 0; j < x.length; j++) {
                    System.out.print("---");    
                }
            }

            System.out.println();
            System.out.printf("   | ");
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            System.out.println("*");

            System.out.printf("  %d|", i);
            for (int j = 0; j < x.length; j++) {
                System.out.printf(" %d ", x[j]);
            }

            if (idx == x[i]) {
                System.out.println();
                System.out.printf("%d은 x[%d]에 있습니다.", ky, i);
                break;
            }
        }
    }

    void makeRandomLiterals(int[] x) {
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10);
        }
    }
}
