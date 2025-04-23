import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if ("0 0".equals(s)) break;
            
            int sum = Arrays.stream(s.split(" ")).mapToInt(Integer::valueOf).sum();
            System.out.println(sum);
        }
        sc.close();
    }
}


