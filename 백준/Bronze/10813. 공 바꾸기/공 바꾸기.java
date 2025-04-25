import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] MN = sc.nextLine().split(" ");
        int N = Integer.valueOf(MN[0]);
        int M = Integer.valueOf(MN[1]);
        String[] arr = new String[M];
        
        List<Integer> lst = new ArrayList<>();
        for (int i=0; i<N; i++) {
            lst.add(i + 1);
        }
        
        for (int idx=0; idx<M; idx++) {
            arr[idx] = sc.nextLine();
            
            String[] ij = arr[idx].split(" ");
            int i = Integer.valueOf(ij[0])-1;
            int j = Integer.valueOf(ij[1])-1;
            
            int tmp = lst.get(i);
            lst.set(i, lst.get(j));
            lst.set(j, tmp);
        }
        sc.close();
        
        lst.stream().forEach(e -> {
           System.out.print(e + " "); 
        });
    }
}