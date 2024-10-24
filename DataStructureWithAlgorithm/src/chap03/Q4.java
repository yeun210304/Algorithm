package chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q4 {
    int n;
    int ky;
    int pl;
    int pc;
    int pr;
    List<Integer> lst;

    Q4 () {
        
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        q4.n = q4.printLetterScanInt("3~9 홀수 사이 요소길이를 입력하시오 : ");
        q4.ky = q4.printLetterScanInt("0~10 중 찾고자 하는 검색할 숫자를 입력하시오 : ");
        // q4.n = 7;
        // q4.ky = 3;

        q4.lst = new ArrayList<Integer>();
        // q4.lst.addAll(Arrays.asList(0, 1, 2, 2, 3, 5, 7));
        q4.makeRandomLiteral();
        q4.lst.sort(null);
        
        q4.pl = 0;
        q4.pr = q4.n - 1;
        q4.pc = q4.findKy();
        
        q4.printResult();
    }

    int printLetterScanInt(String letter) {
        System.err.print(letter);
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        sc.close();
        return res;
    }

    int findKy() {
        do {
            int pc = (pl + pr) / 2;

            if (pc == ky) {
                return pc; 
            }
            else if (pc < ky) {
                pl = pc + 1;
            }
            else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }

    void printResult() {
        int pl = 0;
        int pr = n - 1;
        int pc;
        int idx = 0;
        boolean kyExist = false;

        for (int i = 0; i < n; i++) {
            pc = (pl + pr) / 2;

            if (pr - pl <= 1) {
                break;
            }

            if (i == 0) {
                System.out.print("   |");
                for (int j = 0; j < n; j++)
                    System.out.printf(" %d ", j);
                System.out.println();
                System.out.print("---+");
                for (int j = 0; j < n; j++)
                    System.out.print("---");
                System.out.println();
            }

            System.out.print("   |");
            for (int j = 0; j < n; j++) {
                if (j == pl)
                    System.out.print("<- ");
                else if (j == pr)
                    System.out.print(" ->");
                else if (j == pc)
                    System.out.print(" + ");
                else
                    System.out.print("   ");
            }
            System.err.println();

            System.out.printf("  %d|", pc);
            for (int j = 0; j < n; j++) {
                if (ky == (int) lst.get(j)) {
                    kyExist = true;
                    idx = j;
                }
                System.err.printf(" %d ", lst.get(j));
            }
            System.err.println();

            
            if ((int) lst.get(pc) == ky) {
                break;
            }    
            else if ((int) lst.get(pc) < ky)
                pl = pc + 1;
            else
                pr = pc - 1;
        }

        if (kyExist) 
            System.out.printf("%d는 x[%d]에 있습니다.", ky, idx);
        else 
            System.out.println("검색한 숫자는 배열에 존재하지 않습니다.");
    }

    void makeRandomLiteral() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lst.add(i, random.nextInt(10));
        }
    }

    // 정답안
    static int binSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		int pl = 0; // 검색범위 맨 앞의 index
		int pr = n - 1; // 검색범위 맨 뒤의 index

		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[pc] == key)
				return pc; // 검색성공
			else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);
		return -1; // 검색실패
	}

}
