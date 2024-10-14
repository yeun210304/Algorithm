package chap02;

import java.util.Arrays;

public class ArraysInitialize {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};

        int[] test2 = test1.clone();

        System.out.println("test1 의 주소 : " + test1);
        System.out.println("test2 의 주소 : " + test2);
        System.out.println("test1 의 값 : " + Arrays.toString(test1));
        System.out.println("test2 의 값 : " + Arrays.toString(test2));
    }
}
