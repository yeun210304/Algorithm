package chap01;

import java.util.Scanner;

// 양의 정수를 입력하고 자릿수를 출력
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n을 입력하시오 : ");
        String n = sc.next();
        sc.close();

        System.out.println("n의 자릿수 : " + n.length());
    }
}
