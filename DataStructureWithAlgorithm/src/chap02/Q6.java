package chap02;

import java.util.Scanner;

public class Q6 {
    static String makeLetters() {
        String letter = "";
        for (int i = 0; i <= 9; i++)
            letter += Integer.toString(i);
        for (char i = 'A'; i <= 'Z'; i++) {
            letter += Character.toString(i);
        }

        return letter;
    }

    static void swap(char[] cno, int digits) {
        for (int i = 0; i < digits/2; i++) {
            char temp = cno[i];
            cno[i] = cno[digits-i-1];
            cno[digits-i-1] = temp;    
        }
    }
    
    static int cardConv(int no, int cd, char[] cno) {
        int digits = 0;
        String letter = makeLetters();

        do {
            cno[digits++] = letter.charAt(no % cd);
            no /= cd;
        } while (no != 0);

        swap(cno, digits);

        return digits;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("변환할 정수를 입력하시오 : ");
        int no = sc.nextInt();              // 변환할 정수
        int cd;                             // 기수
        int digits;
        char[] cno = new char[32];          // 변환 후 숫자를 담는다.

        do {
            System.out.print("변환할 기수를 입력하시오(2~ 36) : ");
            cd = sc.nextInt();
        } while (cd < 2 || cd > 36);
        sc.close();

        digits = cardConv(no, cd, cno);

        System.out.printf("%d진수로 변환한 정수 %d의 숫자 : ", cd, no);
        for (int i = digits-1; i >= 0; i--) {
            System.out.print(cno[i]);
        } 
    }
}
