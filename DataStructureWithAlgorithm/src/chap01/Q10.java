package chap01;

import java.util.Scanner;

// 두 변수 a, b에 정수를 입력하고 b -a를 출력하시오
public class Q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a를 입력하시오 : ");
        int a = sc.nextInt();;
        int b;

        do {
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b를 입력하시오 : ");
            b = sc.nextInt();
        }
        while (b <= a);
        sc.close();

        System.out.println("b - a : " + (b - a));
    }
}
