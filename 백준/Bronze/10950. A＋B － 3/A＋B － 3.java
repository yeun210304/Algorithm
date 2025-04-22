import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        IntStream.range(0, T).forEach(e -> {
            System.out.println(sc.nextInt() + sc.nextInt());
        });
        sc.close();
    }
}