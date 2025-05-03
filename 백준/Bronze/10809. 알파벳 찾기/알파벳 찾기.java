import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> S = Arrays.asList(sc.next().split(""));
        sc.close();
        
        for (char i='a'; i<='z'; i++) {
            System.out.print(S.indexOf(String.valueOf(i)) + " ");
        }
    }
}