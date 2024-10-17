package chap03;

import java.util.Random;
import java.util.Scanner;
// 선형검색(순차검색) Linear search
public class SeqSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] x = new int[5];

        for (int i : x) {
            x[i] = random.nextInt(10);
        }

        System.out.println("요소의 값은 0~10사이 5개가 존재합니다.");
        System.out.print("검색할 값을 입력하시오 : ");
        
        int ky = sc.nextInt();
        sc.close();
        
        int idx = seqSearchWhile(x, 5, ky);
        
        if (idx == -1) {
            System.out.println("입력값이 존재하지 않습니다.");
        }
        else {
            System.out.printf("%d은 [%d]에 존재합니다.", ky, idx);
        }
    }

    static int seqSearchWhile(int[] a, int n, int ky) {
        int i = 0;
        
        // 무한루프 while사용
        while (true) {
            // 종료조건은 검색 성공/실패 2가지가 존재한다.
            if (i == n) {
                return -1;  // 검색실패
            }
            if (a[i] == ky) {
                return 1;   // 검색성공
            }
            i++;
        }
    }

    static int seqSearchFor(int[] a, int n, int ky) {
        for (int j = 0; j < a.length; j++) {
            if (a[j] == ky) {
                return j;
            }
        }
        return -1;
    }
}
