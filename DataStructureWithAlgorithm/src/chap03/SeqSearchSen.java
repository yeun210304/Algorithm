package chap03;

import java.util.Random;
import java.util.Scanner;

// 보초법
public class SeqSearchSen {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] x = new int[6];

        for (int i : x) {
            x[i] = random.nextInt(10);
        }

        System.out.println("요소의 값은 0~10사이 5개가 존재합니다.");
        System.out.print("검색할 값을 입력하시오 : ");
        
        int ky = sc.nextInt();
        sc.close();
        
        int idx = seqSearchSen(x, 5, ky);
        
        if (idx == -1) {
            System.out.println("입력값이 존재하지 않습니다.");
        }
        else {
            System.out.printf("%d은 [%d]에 존재합니다.", ky, idx);
        }
    }

    static int seqSearchSen(int[] a, int n, int ky) {
        int i = 0;

        a[n] = ky;          // 보초를 추가
        
        while (true) {
            if (a[i] == ky) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }
}
