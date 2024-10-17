package chap02;

import java.util.Scanner;

public class Q11 {
    static class YMD {
        int y;
        int m;
        int d;
        
        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        YMD afterN(int n) {
            YMD temp = new YMD(this.y, this.m, this.d);
            
            if (n < 0) {
                return beforeN(-n);
            }

            temp.d += n;

            while (temp.d > mdays[isLeap(temp.y)][temp.m-1]) {
                temp.d -= mdays[isLeap(temp.y)][temp.m-1];
                if (++temp.m > 12) {
                    temp.y++;
                    temp.m = 1;
                }
            }
            return temp;
        }

        YMD beforeN(int n) {
            YMD temp = new YMD(this.y, this.m, this.d);

            if (n < 0) {
                return (afterN(-n));
            }

            temp.d -= n;

            while (temp.d < 1) {
                if (--temp.m < 1) {
                    temp.y--;
                    temp.m = 12;
                }
                temp.d += mdays[isLeap(temp.y)][temp.m - 1];
            }

            return temp;
        }

        // 서기 year년은 윤년인가? (윤년：1／평년：0)
        int isLeap(int year) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        }

        // 각 달의 일수
        static int[][] mdays = {
                { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
                { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년 (2월이 29일이다)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("계산할 연도를 입력하시오.");
        System.out.print("연 : "); int y = sc.nextInt();
        System.out.print("월 : "); int m = sc.nextInt();
        System.out.print("일 : "); int d = sc.nextInt();
        System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = sc.nextInt();
        sc.close();

        YMD ymd = new YMD(y, m, d);

        YMD afterN = ymd.afterN(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, afterN.y, afterN.m, afterN.d);

        YMD beforeN = ymd.beforeN(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, beforeN.y, beforeN.m, beforeN.d);

    }
}

