package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class GPTstyleComparingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        int N;

        do {
            N = sc.nextInt();
        } while (N < 1 || 1000 < N);

        for (int i=0; i<N; i++) {
            lst.add(sc.next());
        }
        sc.close();

        for (int i = 0; i < lst.size() - 1; i++) {
            for (int j = 0; j < lst.size() - 1 - i; j++) {
                if (Double.valueOf(lst.get(j)).compareTo(Double.valueOf(lst.get(j + 1))) > 0) {
                    String temp = lst.get(j);
                    lst.set(j, lst.get(j + 1));
                    lst.set(j + 1, temp);
                }
            }
        }

        for (int i=0, j=1; j<N; i++, j++) {
            String orgI = lst.get(i);
            String orgJ = lst.get(j);
            
            double iTmp = Double.valueOf(orgI);
            int iX = (int) iTmp;
            char[] iY = String.valueOf(iTmp % iX * (iX>10 ? 100 : 10)).toCharArray();

            double jTmp = Double.valueOf(orgJ);
            int jX = (int) jTmp;
            char[] jY = String.valueOf(jTmp % jX * (jX>10 ? 100 : 10)).toCharArray();

            if (iX == jX) {
                if (orgI.length() == orgJ.length()) {
                    if (orgJ.length() == 1) {
                        lst.set(i, orgJ);
                        lst.set(j, orgI);
                    }
                }
                else if (orgJ.length() < orgI.length()) {
                    lst.set(i, orgJ);
                    lst.set(j, orgI);   
                }
            }
        }

        for (int i=0; i<N; i++) {
            System.out.println(lst.get(i));
        }
    }

}
