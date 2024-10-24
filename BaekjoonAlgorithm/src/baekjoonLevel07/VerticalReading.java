package baekjoonLevel07;

import java.util.Scanner;

// 10798	세로읽기
public class VerticalReading {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = in.nextLine();

            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        in.close();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == '\0') {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
    }
}
