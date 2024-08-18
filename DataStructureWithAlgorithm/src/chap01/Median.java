package chap01;

import java.util.Scanner;
/**
 *  3개의 정숫값으 입력하고 중앙값을 구한 다음 출력합니다.
 */
public class Median {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("중앙값 : " + med3(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        sc.close();
    }

    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            }
            else if (a <= c) {
                return a;
            }
            else {
                return c;
            }
        }
        else if (a > c) {
            return a;
        }
        else if (b > c) {
            return c;
        }
        else {
            return b;
        }
    }

    static int med3_otherWay(int a, int b, int c) {
        if ((b >= a && c < a) || (b <= a && c >= a)) {
            return a;
        }
        else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        else {
            return c;
        }
    }
} 