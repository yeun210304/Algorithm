import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        
        System.out.print(Arrays.stream(arr).distinct().count());
    }
}