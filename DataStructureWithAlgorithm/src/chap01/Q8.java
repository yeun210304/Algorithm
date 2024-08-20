package chap01;

import java.util.Scanner;

// 문제 : 1부터 10까지의 합은 (1 + 10) * 5와 같은 방법으로 구할 수 있다. 
// 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지 정수 합을 구하시오.
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n을 입력하시오 : ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        boolean evenNum = (n % 2 == 0);    // 짝수여부

        if (evenNum) {
            sum = (1 + n) * (n / 2);
        }   
        // 홀수일 경우
        else {
            sum = (1 + n) * ((n - 1) / 2) + ((1 + n) / 2);
        }
        
        System.out.println("합계 : " + sum);
    }
}
