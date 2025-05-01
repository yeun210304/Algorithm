import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int max = Arrays.stream(arr).max().getAsInt();
        Arrays.stream(arr)
            .mapToDouble(e -> (e / (double)max) * 100)
            .average()
            .ifPresent(System.out::print);
    }
}

