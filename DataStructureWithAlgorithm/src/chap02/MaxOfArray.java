package chap02;

public class MaxOfArray {
    public static void main(String[] args) {
        int max = 0;
        int[] a = {1, 2, 3};

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }

        if (a[0] > max) max = a[0];
        if (a[1] > max) max = a[1];
        if (a[2] > max) max = a[2];

        System.out.println(max);
    }
}
