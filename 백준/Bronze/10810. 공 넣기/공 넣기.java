import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] MN = sc.nextLine().split(" ");
        int N = Integer.valueOf(MN[0]);
        int M = Integer.valueOf(MN[1]);
        String[] arr = new String[M];
        
        ArrayList<Integer> lst = new ArrayList<>(Collections.nCopies(N, 0));
        
        for (int idx1=0; idx1<M; idx1++) {
            arr[idx1] = sc.nextLine();
            
            String[] ijk = arr[idx1].split(" ");
            int i = Integer.valueOf(ijk[0])-1;
            int j = Integer.valueOf(ijk[1])-1;
            int k = Integer.valueOf(ijk[2]);
            
            for (int idx2=i; idx2<=j; idx2++) {
                lst.set(idx2, k);
            }
        }
        sc.close();
        
        lst.stream().forEach(e -> {
           System.out.print(e + " "); 
        });
    }
}