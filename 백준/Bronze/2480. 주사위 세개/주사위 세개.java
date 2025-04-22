import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int[] dice = {a, b, c};

        boolean allSame = Arrays.stream(dice).allMatch(e -> e == a);

        if (allSame) {
            System.out.print(10000 + a * 1000);
        } 
        else {
            if ((a == b) || (a == c)) {
                System.out.print(1000 + a * 100);
            } 
            else if (b == c) {
                System.out.print(1000 + b * 100);
            } 
            else {
                System.out.print(Arrays.stream(dice).max().orElse(0) * 100);
            }
        }
    }
}