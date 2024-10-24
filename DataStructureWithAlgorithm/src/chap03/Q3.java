package chap03;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int[] a = new int[9];
        int[] idx = new int[9];
        int key;

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }

        System.out.println("0~9 중에 검색할 키를 입력하시오 : ");
        do {
            key = sc.nextInt();
        } while (key < -1 || 9 < key);
        sc.close();

        int count = searchIdx(a, a.length, key, idx);

        if (count == 0) {
            System.out.print("키가 존재하지 않습니다.");
        }
        else {
            StringBuffer sb = new StringBuffer();
            sb.append("해당 키는 배열의 [");
            for (int i = 0; i < a.length; i++) {
                if (key == a[i]) {
                    sb.append(i + ", ");
                }
            }
            String sbStr = sb.toString().substring(0, sb.toString().length() -2);
            System.out.print(sbStr + "] 에 존재합니다.");
        }
    }

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                idx[j] = a[i];
                j++;
            }
        }
        return j;
    }
}
