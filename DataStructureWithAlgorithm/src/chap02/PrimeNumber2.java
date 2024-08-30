package chap02;
// 1000이하 소수를 구하는 프로그램2(개선version)
public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;                    // 나눗셈 횟수
        int ptr = 0;                        // 소수의 갯수
        int[] prime = new int[500];         // 소수를 저장하는 배열

        prime[ptr++] = 2;                   // [0]번지에 소수 2 대입

        for (int n = 3; n <= 1000; n+= 2) { // 대상은 홀수만
            int i;
            for (i = 0; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0)      // 이미 찾은 소수로 나누어 본다.
                    break;
            }
            if (ptr == i)
                prime[ptr++] = n;
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
