package chap02;

import java.util.Scanner;

public class Q8 {
    // 각 달의 일수
    static int[][] mdays = {
        {31,28,31,30,31,30,31,31,30,31,30,31},  // 평년
        {31,29,31,30,31,30,31,31,30,31,30,31}   // 윤년 (2월이 29일이다)
    };
    
    /**
     * year가 윤년인 지 확인한다.
     * @param year 확인할 연도
     * @return 1:윤년/ 0:평년
     */
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    /**
     * 서기 y/m/d 그 해 경과 일 수를 구한다
     * @param y 연
     * @param m 월
     * @param d 일
     * @return 경과일 수
     */
    static int dayOfYear(int y, int m , int d) {
        m -= 1;
        while (m > 0) {
            m--;
            d += mdays[isLeap(y)][m];
        }
        // 정답코드
        // while (--m != 0)
		// 	d += mdays[isLeap(y)][m - 1];
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("그 해의 경과 일수를 구합니다.");

        System.out.print("연 : "); int y = sc.nextInt();
        System.out.print("월 : "); int m = sc.nextInt();
        System.out.print("일 : "); int d = sc.nextInt();
        sc.close();

        System.out.printf("그 해 %d일째입니다.", dayOfYear(y, m, d));
    }
}
