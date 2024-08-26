package chap02;

import java.util.Scanner;

public class Q7 {
    static String makeLetters() {
        String letter = "";
        for (int i = 0; i <= 9; i++)
            letter += Integer.toString(i);
        for (char i = 'A'; i <= 'Z'; i++) 
            letter += Character.toString(i);
        return letter;
    }

    static int cardConv(int no, int cd, char[] cno) {
        int digits = 0;
        String letter = makeLetters();

        do {
            cno[digits++] = letter.charAt(no % cd);
            no /= cd;
        } while(no != 0);

        return digits;
    }

    static void printProcess(int no, int cd) {
        int temp = no;

        for (int i = no; i >= 0; i/=cd) {
            if (i == no&& i != 0) {
                System.out.printf("%d|\t%d\n", cd, i);
            }
            else if (i == 0) {
                System.out.println(" +--------");
                System.out.printf("  \t%d ··· %d\n", i, (temp) % cd);
                break;
            }
            else {
                System.out.println(" +--------");
                System.out.printf("%d|\t%d ··· %d\n", cd, i, (temp) % cd);
            }
            temp = i;
        }
    }

    static void reverse(int digits, char[] cno) {
        for (int i = 0; i < digits/2; i++) {
            char temp = cno[i];
            cno[i] = cno[digits-i-1];
            cno[digits-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no;
        int cd;
        int digits;
        char[] cno = new char[36];
        
        do {
            System.out.print("변환할 정수를 입력하세요 : ");
            no = sc.nextInt();
        } while (no <= 0);

        do {
            System.out.print("변환할 기수를 입력하세요(2~36) : ");
            cd = sc.nextInt();
        } while (cd < 2 || cd > 36);
        sc.close();
        System.out.println();
    
        digits = cardConv(no, cd, cno);

        reverse(digits, cno);
        printProcess(no, cd);
    }
}
