import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<6; i++) {
            int in = sc.nextInt();
            if (i<2) {
                if (in == 0) 
                    System.out.print(1);
                else 
                    System.out.print(1-in);
            }
            else if (i>=2 && i<5) {
                System.out.print(2-in);
            }
            else {
                System.out.print(8-in);
            }
            System.out.print(" ");
        }
        sc.close();
    }
}