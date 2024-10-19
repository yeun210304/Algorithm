package chap03;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Q1 {
    int[] x;
    int key;
    int idx;

    Q1() {  
        x = new int[10];
        makeRandomLiteral(x);
    }

    Q1(int[]x, int key, int idx) {
        this.x = x;
        this.key = key;
        this.idx = idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색값 : ");
        int key = sc.nextInt();
        sc.close();

        Q1 q1 = new Q1();
        q1.key = key;
        q1.idx = q1.findLetter();

        q1.printResult();
    }

    void makeRandomLiteral(int[] x) {
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(20);
        }
    }

    int findLetter() {
        for (int i = 0; i < x.length; i++) {
            if(x[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    void printResult() {
        if (idx == -1) {
            System.out.printf("검색값 %d는(은) 배열에 존재하지 않습니다. \n%s", key, Arrays.toString(x));
        }
        else {
            System.out.printf("검색값 %d는 배열 index[%d]에 존재합니다. \n%s", key, idx, Arrays.toString(x));
        }
    }
}
