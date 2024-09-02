package chap02;

import java.util.Scanner;

// 연/월/일 입력 후 그 해의 남은 일 수를 구한다.
public class Q9 {
    // 각 달의 일수
    static int[][] mdays = {
        {31,28,31,30,31,30,31,31,30,31,30,31},  // 평년
        {31,29,31,30,31,30,31,31,30,31,30,31}   // 윤년 (2월이 29일이다)
    };

    /**
     * 입력 연/월/일을 기준으로 다음 해까지 남은 일 수를 계산한다.
     * @param y 연
     * @param m 월
     * @param d 일
     * @return 남은 일수
     */
    static int leftDaysOfYear(int y, int m, int d) {
        int days = 0;
        m -= 1;
        while (m++ < 12) {
            days += mdays[isLeapYear(y)][m-1];
        }
        days -= d+1;
        return days;
        // 정답코드
        // for (int i = 1; i < m; i++) // 1월~(m-1)월의 일 수를 더함
		// 	days += mdays[isLeap(y)][i - 1];
		// return 365 + isLeap(y) - days;
    }
    
    static int isLeapYear(int y) {
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("다음 해까지 남은 일수를 구합니다.");

        System.out.print("연 : "); int y = sc.nextInt();
        System.out.print("월 : "); int m = sc.nextInt();
        System.out.print("일 : "); int d = sc.nextInt();
        sc.close();

        System.out.printf("%d년까지 %d일 남았습니다.", y+1, leftDaysOfYear(y, m, d)); 
    }
}
