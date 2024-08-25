package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrauEqual {
    static Scanner sc = new Scanner(System.in);

    /**
     * 두 배열 a, b의 모든 요소가 같은 지 판단한다
     * @param a
     * @param b
     * @return 두 배열이 같은 지 여부
     */
    static boolean arrEquals(int[] a, int[] b) {
        // 두 배열 길이가 같은 지 여부
        if (a.length != b.length)
            return false;
        
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        return true;
    }
    
    public static void main(String[] args) {
        int[] arr1 = new int[sc.nextInt()];
        int[] arr2 = new int[sc.nextInt()];

        insertElement(arr1);
        insertElement(arr2);
        
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        System.out.println("두 배열은 " + (arrEquals(arr1, arr2)  ? "같습니다." : "다릅니다."));
    }

    static void insertElement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
}
