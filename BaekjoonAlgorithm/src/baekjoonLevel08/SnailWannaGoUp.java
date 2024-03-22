package baekjoonLevel08;

import java.util.Scanner;

// 2869	달팽이는 올라가고 싶다
public class SnailWannaGoUp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int a = in.nextInt();   // 낮에 올라가는 거리
        int b = in.nextInt();   // 밤에 미끄러지는 거리
        int v = in.nextInt();   // 나무막대 길이
        in.close();
        int cnt = 0;            // 며칠 걸리는 지
        int m = 0;              // 가는 거리

        while (v >= m) {
            m += a;

            cnt++;

            if (m >= v)
                break;

            m -= b;
        }

        System.out.print(cnt);
    }
}
