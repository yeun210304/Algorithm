import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        sc.close();
        
        int A = Integer.valueOf(line[0]);
        int B = Integer.valueOf(line[1]);
        
        System.out.print(A > B ? ">" : (A < B ? "<" : "=="));
    }
}