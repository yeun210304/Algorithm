 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            String[] s = sc.next().split("");
            System.out.println(s[0] + s[s.length-1]);
        }
        sc.close();
    }
}