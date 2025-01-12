package level08;

import java.util.Scanner;

// 2292	벌집
public class Honeycomb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();
        int around = 1;
        int cnt = 0;

        for (int i = 0; i <= n; i++) {
            if (i == around) {
                cnt++;
                if (i == 1) {
                    around = 2;
                    continue;
                }
                around = around + (6 * (cnt - 1));
            }
        }

        System.out.println(cnt);
    }
}