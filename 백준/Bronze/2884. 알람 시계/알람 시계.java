import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt() - 45;
        sc.close();
        
        if (0 > M) {
            H--;
            M+=60;
        }
        
        System.out.printf("%d %d", H < 0 ? 23 : H, M);
    }
}

