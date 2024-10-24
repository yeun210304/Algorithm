package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("요솟수 : ");
            num = sc.nextInt();
        } while (num < 1);
        
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");
        System.out.print("x[o] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.printf("x[%d] : ", i);
                x[i] = sc.nextInt();    
            } while (x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();
        sc.close();
        
        int idx = Arrays.binarySearch(x, ky);

        // 중복된 ky 중 가장 앞에 값을 가져온다.
        if (idx >= 0) {
            while (idx > 0 && x[idx - 1] == ky) {
                idx--;
            }
        }

        if (idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        }
        else  {
            System.out.printf("%d은(는) x[%d]에 있습니다.", ky, idx);
        }
    }
}
