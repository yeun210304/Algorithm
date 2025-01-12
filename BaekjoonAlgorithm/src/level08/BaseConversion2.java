package level08;

import java.util.Scanner;

// 	11005	진법 변환 2
public class BaseConversion2 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int n = in.nextInt();   // 10진법 수
        int b = in.nextInt();   // 진법
        in.close();

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int last = n % b;

            String res = "";

            if (last >= 10 ) {
                char c = (char) ((int) last + 55);
                res = Character.toString(c);
            }
            else {
                res = Integer.toString(last);
            }
            
            n /= b;

            sb.append(res);
        }
        System.out.print(sb.reverse().toString());
    }
}