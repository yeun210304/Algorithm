package chap02;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;

        // n 중에 소수가 있는 지 확인한다.
        for (int n = 0; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) {
                    if (n % i == 0) // 나누어 떨어지면 소수가 아니다.
                        break;
                }
            }
            if (n == 1)
                System.out.println(n);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
