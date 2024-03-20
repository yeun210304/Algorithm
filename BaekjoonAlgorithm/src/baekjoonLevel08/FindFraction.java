package baekjoonLevel08;

import java.util.Scanner;

// 1193	분수찾기
public class FindFraction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        in.close();
        int cnt = 0;
        int sum = 0;
        int a = 0;
        int b = 0;

        while (x > sum) {
            cnt++;
            sum += cnt;
        }

        // 짝수일 경우
        if (cnt % 2 == 0) {
            a = cnt - (sum - x);
            b = cnt + ((sum - cnt) - x) + 1;
        }
        else {
            a = cnt + ((sum - cnt) - x) + 1;
            b = cnt - (sum - x);
        }

        System.out.print(a + "/" + b);
    }
}
