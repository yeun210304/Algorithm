import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String[] s = sc.next().split("");
        sc.close();
        
        System.out.print(Arrays.stream(s).mapToInt(Integer::valueOf).sum());
    }
}