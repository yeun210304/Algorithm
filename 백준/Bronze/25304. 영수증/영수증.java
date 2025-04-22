import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        
        for (int i=0; i<N; i++) {
            sum += sc.nextInt() * sc.nextInt();
        }
        sc.close();
        
        System.out.print(X == sum ? "Yes" : "No");        
    }
}