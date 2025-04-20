import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        sc.close();
        
        int A = Integer.valueOf(line[0]);
        int B = Integer.valueOf(line[1]);
        int C = Integer.valueOf(line[2]);
        
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*  (B%C))%C);
    }
}