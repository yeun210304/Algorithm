package level2;

import java.util.Scanner;

public class GrearShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        String res = "";

        for (int i=0; i<s.length; i++) {
            arr[i] = Integer.valueOf(s[i]);
        }
        
        if (arr[0] == 1) {
            res = "ascending";
            for (int i=1; i<=8; i++) {
                if (arr[i-1] != i) {
                    res = "mixed";
                    break;
                }
            }
        }
        else if (arr[0] == 8) {
            res = "descending";
            int tmp = 0;
            for (int i=8; i>=1; i--) {
                if (arr[tmp] != i) {
                    res = "mixed";
                    break;
                }
                tmp++;
            }
        }
        else {
            res = "mixed";
        }
        
        System.out.println(res);
    }
}
