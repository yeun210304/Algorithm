import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        
        str.chars()
            .mapToObj(c -> String.valueOf((char) c))
            .forEach(System.out::println);
    }
}