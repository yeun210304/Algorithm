package chap02;

import java.util.Arrays;
import java.util.Random;

// 배열 요소를 역순으로 정렬하는 과정을 모두 나타낸다
public class Q2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] a = new int[rand.nextInt(10)];

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
        
        reverse(a);
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length/ 2; i++) {
            printArray(a, i, a.length - i - 1);
            swap(a, i, a.length - i - 1);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void printArray(int[] a, int idx1, int idx2) {
        System.out.println(Arrays.toString(a));
        System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n", idx1, idx2);
    }
}
