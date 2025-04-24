import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        
        for (int i=0; i<arr.length; i++) { 
            if (arr[i] == max) {
                System.out.println(i+1);
                break;
            }
        }
    }
}