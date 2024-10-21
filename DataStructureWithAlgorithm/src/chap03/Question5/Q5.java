package chap03.Question5;

import java.util.List;
import java.util.Scanner;

public class Q5 {
    int len;
    int pl;
    int pc;
    int pr;
    int ky;
    int idx;
    List<Integer> x;
    
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        Q5 arr = new MakeArray();

        q5.len = arr.len;
        q5.x = arr.x;
        q5.scanSearchKy();
        
        q5.idx = q5.findKy();
        q5.printResult();
    }

    void scanSearchKy() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("0~9사이 검색할 숫자를 입력하시오 : ");
            ky = sc.nextInt();    
        } while (ky < 0 || 9 < ky);
        sc.close();
    }

    int findKy() {
        int key = ky;
        pl = 0;
        pr = len - 1;
        do {
            pc = (pl + pr) / 2;
            if (key == x.get(pc)) {
                for (; pc > pl; pc--) {
                    if (x.get(pc-1) < key) {
                        break;
                    }
                }
                return pc;
            }
            else if (x.get(pc) < key) {
                pl = pc + 1;
            }
            else {
                pr = pc - 1;
            }
        } while (pl <= pr);
        return -1;
    }

    void printResult() {
        System.out.println("배열 : " + x.toString());
        if (idx == -1) 
            System.out.printf("검색한 %d는 배열에 존재하지 않습니다.", ky);
        else 
            System.out.printf("검색한 %d는 x[%d]에 존재합니다.", ky , idx);
    }
}
