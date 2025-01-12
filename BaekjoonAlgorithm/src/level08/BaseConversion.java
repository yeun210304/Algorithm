package level08;

import java.util.Scanner;

// 	2745	진법 변환
public class BaseConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();   // 수

        int b = in.nextInt();   // 진법
        in.close();
        int res = 0;
        int num = 0;

        for (int i = n.length() - 1, cnt = 0; i >= 0; i--, cnt++) {
            char c = n.charAt(i);

            // char c를 int에 담으면 ASCII 값으로 변환되는데
            if (c >= '0' && c <= '9') {
                // 여기에서 ASCII코드 숫자중 첫번째인'0'을 빼주면 10진수가 된다.
                num = c - '0';
            }
            // 입력된 수가 문자일 경우
            else {
                // 여기에서 ASCII코드 문자중 첫번째인'A'코드값 55를 빼주면 10진수가 된다.
                num = c - 55;
            }
            
            res += Math.pow(b, cnt) * num;
        }

        System.out.print(res);
    }
}