import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = sc.nextInt();
        sc.close();
        
        int totalM = H*60 + M + time;
        int resH = (totalM/60) % 24;
        int resM = totalM % 60;
        System.out.println(resH + " " + resM);
    }
}