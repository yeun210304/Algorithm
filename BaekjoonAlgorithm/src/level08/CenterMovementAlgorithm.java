package level08;

import java.util.Scanner;

// 2903	중앙 이동 알고리즘
public class CenterMovementAlgorithm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();   // 중앙 점을 찍는 과정의 수
        in.close();

        if (1 <= n && n <= 15) {
            System.out.print(howManyPoint(n));
        }
    }

    static int howManyPoint(int n) {
        int res = 0;
        int cnt = 2;

        for (int i = 0; i < n; i++) {
            res = (int) (cnt + Math.pow(2, i));
            cnt = res;
        }
        
        return res * res;
    }
}
