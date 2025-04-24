import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        int v = Integer.valueOf(sc.nextLine());
        
        long cnt = Arrays.stream(arr).mapToInt(Integer::valueOf).filter(e -> e == v).count();
        System.out.print(cnt);
    }
}