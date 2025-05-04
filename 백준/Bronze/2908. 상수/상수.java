import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> 
            Integer.valueOf(new StringBuilder(e).reverse().toString())
        ).max().ifPresent(System.out::print);
        sc.close();
    }
}