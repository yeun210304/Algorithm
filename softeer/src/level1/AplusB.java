package level1;

import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a;
        int b;

        for (int i=1; i<=t; i++) {            
            do {
                a = sc.nextInt();
                b = sc.nextInt();
            } while(a < 1 || 9 < a || b < 1 || 9 <b);    
            
            System.out.printf("Case #%d: %d\n", i, a+b);
        }
    }
}
