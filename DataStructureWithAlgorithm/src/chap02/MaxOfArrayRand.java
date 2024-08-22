package chap02;

import java.util.Random;
import java.util.Scanner;

// 난수로 구성된 배열 요소의 최댓값을 구한다.
public class MaxOfArrayRand {
    public static void main(String[] args) {
        // 현재시간을 이용한 난수생성
        Random rand = new Random(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);

        System.out.print("생성할 난수의 갯수를 입력하시오 : ");
        int num = sc.nextInt();
        sc.close();

        int[] numArr = new int[num];
        
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = rand.nextInt(100);
            System.out.printf("numArr[%d] : %d\n", i, numArr[i]);
        }

        System.out.println("최댓값 : " + maxOf(numArr));
    }

    /**
     * 매개변수 배열 요소의 최댓값을 반환한다.
     * @param int형 배열 a
     * @return 최댓값
     */
    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
}
