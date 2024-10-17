package chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        List<Integer> x = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            x.add(i, random.nextInt(20));
        }

        x.sort(null);

        System.out.println("요소의 값은 0~20사이 10개가 존재합니다.");
        System.out.print("검색할 값을 입력하시오 : ");
        
        int ky = sc.nextInt();
        sc.close();

        int idx = binSearch(x, x.size(), ky);

        if (idx == -1) {
            System.out.println("검색 값이 존재하지 않습니다.");
        }
        else {
            System.out.printf("%d은 [%d]에 존재합니다.", ky, idx);
        }
    }

    static int binSearch(List<Integer> x, int n, int key) {
        int pl = 0;                 // 요소의 시작
        int pr = n -1;              // 요소의 끝

        do {
            int pc = (pl + pr) / 2; // 요소의 중간

            if (x.get(pc) == key) {
                return pc;          // 검색 성공!
            }
            else if (x.get(pc) < key) {
                pl = pc + 1;        // 검색범위에서 요소의 시작을 중앙 뒤 인덱스로 바꾼다.
            }
            else {
                pr = pc -1;         // 검색범위에서 요소의 끝은 중앙 앞 인덱스로 바꾼다.
            }
        } while (pl <= pr);

        return -1;                  // 검색 실패!
    }
}
