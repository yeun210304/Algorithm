import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        
        System.out.println(Stream.of(line.split(" "))
                                .mapToLong(Long::valueOf)
                                .sum());
    }
}