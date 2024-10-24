package chap03.Question5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MakeArray extends Q5 {
    MakeArray() {
        scanListSize();
        super.x = new ArrayList<Integer>();
        addArrayRandomLiteral();
        super.x.sort(null);
    }

    void scanListSize() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("배열 크기를 입력하시오(홀수만 가능) : ");
            super.len = sc.nextInt();
        } while (super.len % 2 == 0);
        sc.close();
    }

    void addArrayRandomLiteral() {
        Random random = new Random();
        for (int i = 0; i < super.len; i++) {
            x.add(i, random.nextInt(10));
        }
    }
}
