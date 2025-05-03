import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().trim().split(" ");
        sc.close();
        
        if ("".equals(S[0])) {
            System.out.print(0);
        }
        else {
            System.out.print(S.length);
        }
    }
}