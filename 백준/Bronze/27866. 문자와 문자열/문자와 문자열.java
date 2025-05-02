import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split("");
        int i = sc.nextInt();
        sc.close();
        
        System.out.print(S[i-1]);
    }
}