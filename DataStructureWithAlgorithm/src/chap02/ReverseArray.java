package chap02;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        
        int[] arr = new int[rand.nextInt(10)];
        int arrLeng = arr.length;

        for (int i = 0; i < arrLeng; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println("arr : " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("arr : " + Arrays.toString(arr));
    }

    /**
     * 배열 요소를 역순으로 정렬한다.
     * @param arr
     */
    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length -i -1);
        }
    }

    /**
     * 배열요소 a[idx1]과 a[idx2]의 값을 바꾼다.
     * @param a
     * @param idx1
     * @param idx2
     */
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
}
