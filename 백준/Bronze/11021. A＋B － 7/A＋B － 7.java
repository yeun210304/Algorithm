import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        
        for (int i=0; i<T; i++) {
            int sum = Arrays.stream(sc.nextLine().split(" "))
                            .mapToInt(Integer::valueOf)
                            .sum();
            System.out.printf("Case #%d: %d\n", i+1, sum);
        }
        sc.close();
    }
}