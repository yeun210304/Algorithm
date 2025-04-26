import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        for (int i=0; i<28; i++){
            lst.add(sc.nextInt());
        }
        sc.close();
        
        IntStream.rangeClosed(1, 30).filter(e -> !lst.contains(e)).forEach(System.out::println);
    }
}