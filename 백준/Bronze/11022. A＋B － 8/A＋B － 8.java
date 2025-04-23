import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        
        for (int i=0; i<T; i++) {
            String[] arr = sc.nextLine().split(" ");
            int A = Integer.valueOf(arr[0]);
            int B = Integer.valueOf(arr[1]);
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, A, B, A+B);
        }
        sc.close();
    }
}