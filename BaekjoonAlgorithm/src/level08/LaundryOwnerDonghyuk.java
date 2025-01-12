package level08;

import java.util.Scanner;

// 2720	세탁소 사장 동혁
public class LaundryOwnerDonghyuk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /**
         * Quarter: $0.25
         * Dime: $0.10
         * Nickel: $0.05
         * Penny: $0.01
         */

        int t = in.nextInt();       // 테스트 케이스 수
        int[] change = {25, 10, 5, 1};  // 잔돈종류

        for (int i = 0; i < t; i++) {
            int cash = in.nextInt();
            int last = cash;

            for (int j = 0; j < change.length; j++) {
                System.out.print(last / change[j] + " ");

                last %= (change[j]);
            }
            System.out.println();
        }
        in.close();
    }
}
