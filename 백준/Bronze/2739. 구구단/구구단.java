import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        IntStream.range(1, 10).forEach(e -> {
           System.out.printf("%d * %d = %d\n", N, e, N*e); 
        });
    }
}