import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        String[] arr1 = sc.nextLine().split(" ");
        sc.close();
        
        int[] arr2 = Arrays.stream(arr1).mapToInt(Integer::valueOf).toArray();
        Arrays.sort(arr2);
        System.out.printf("%d %d", arr2[0], arr2[arr2.length-1]);
    }
}