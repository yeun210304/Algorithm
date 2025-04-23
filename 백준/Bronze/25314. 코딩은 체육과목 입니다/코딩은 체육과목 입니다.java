import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        IntStream.range(0, N/4).forEach(e -> {
            System.out.print("long ");
        });
        
        System.out.print("int");
    }
}