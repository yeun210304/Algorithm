import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.valueOf(sc.nextLine().split(" ")[1]);
        Arrays.stream(sc.nextLine().split(" "))
            .mapToInt(Integer::valueOf)
            .filter(e -> e < X)
            .forEach(e -> {
                System.out.print(e + " ");
            });
        sc.close();
    }
}
