import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        sc.close();
        
        System.out.print(Integer.valueOf(c));
    }
}