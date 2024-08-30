package chap02;
// 1000이하 소수를 구하는 프로그램3(개선version의 version)
public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;                    // 곱셈과 나눗셈의 횟수
        int ptr = 0;                        // 찾은 소수 갯수
        int[] prime = new int[500];         // 소수 저장배열
        
        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int n = 5; n <= 1000; n += 2) {// 홀수만 대상으로
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {    // 3으로 먼저 나눠 봄
                counter += 2;               // 안쪽 for문이 돌아가지 않은 횟수도 계산
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }
        
        for (int i = 0; i < ptr; i++) {
            System.out.print(i == ptr-1 ? prime[i] + "\n" : prime[i] + ", ");
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
