package chap02;

import java.util.Scanner;

// 입력 받은 10진수를 n진수로 변환한다.
public class CardConvRev {
    /**
     * 0-9까지, A-Z까지의 문자를 결합해 반환
     * @return 결합된 문자열
     */
    static String makeLetters() {
        String letter = "";
        for (int i = 0; i <= 9; i++)
            letter += Integer.toString(i);
        for (char i = 'A'; i <= 'Z'; i++) {
            letter += Character.toString(i);
        }

        return letter;
    }

    /**
     * 정숫값 x를 r진수로 반환하여 배열 d에 아랫자리부터 넣어 자릿수를 반환
     * @param x 정수
     * @param r 진수
     * @param d
     * @return 변환한 기수값
     */
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;                         // 변환 후 자릿수
        String dchar = makeLetters();

        do {
            d[digits++] = dchar.charAt(x % r);  // r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("변환할 정수를 입력하시오 : ");
        int no = sc.nextInt();              // 변환할 정수
        int cd;                             // 기수
        int dno;                            // 변환 후 자릿수
        char[] cno = new char[32];          // 변환 후 숫자를 담는다.
        
        do {
            System.out.print("변환할 기수를 입력하시오(2~ 36) : ");
            cd = sc.nextInt();
        } while (2 > cd || cd > 36); 
        sc.close();

        dno = cardConvR(no, cd, cno);
        
        System.out.printf("%d진수로 변환한 정수 %d의 숫자 : ", cd, no);

        for (int i = dno-1; i >= 0; i--) {
            System.out.print(cno[i]);
        }
    }
}
