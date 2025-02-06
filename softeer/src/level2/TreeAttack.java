package level2;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeAttack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nm;
        int n;
        int m;

        do {
            nm = sc.nextLine();
            n = Integer.valueOf(nm.split(" ")[0]);
            m = Integer.valueOf(nm.split(" ")[1]);
        } while (n < 5 || 100 < m);

        String[] tbl = new String[n];
        HashMap<Integer, ArrayList<Integer>> forest = new HashMap<>();

        for (int i=1; i<n; i++) {
            tbl[i-1] = sc.nextLine();
            String[] tmp  = tbl[i-1].split(" ");
            ArrayList<Integer> lst = new ArrayList<>();
            
            for (int j=0; j<m; j++) {
                lst.add(Integer.valueOf(tmp[j]));
            }
            forest.put(i, lst);
        }

        String LR1 = sc.nextLine();
        String LR2 = sc.nextLine();
        int L1 = Integer.valueOf(LR1.split(" ")[0]);
        int R1 = Integer.valueOf(LR1.split(" ")[1]);
        int L2 = Integer.valueOf(LR2.split(" ")[0]);
        int R2 = Integer.valueOf(LR2.split(" ")[1]);
        
        for (int i=L1-1; i<R1-1; i++) {
            for (int j=0; j<m; j++) {
                if (forest.get(i).get(i) == 1) {
                    forest.get(i).set(j, 0);
                    break;
                }
            }
        }
        for (int i=L2-1; i<R2-1; i++) {
            for (int j=0; j<m; j++) {
                if (forest.get(i).get(i) == 1) {
                    forest.get(i).set(j, 0);
                    break;
                }
            }
        }

        int enemyNum = 0;
        
        for (int i=1; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (forest.get(i).get(j) == 1) enemyNum++;
            }
        }

        System.out.print(enemyNum);
    }
}
