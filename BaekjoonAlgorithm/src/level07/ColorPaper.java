package level07;

import java.util.Scanner;

// 2563	색종이
public class ColorPaper {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pprCnt = in.nextInt();
        int res = 0;
        int[][] arr = new int[100][100];

        for (int i = 0; i < pprCnt; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
        
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        in.close();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    res++;
                }
            }
        }
       
        System.out.println(res);
    }
}
