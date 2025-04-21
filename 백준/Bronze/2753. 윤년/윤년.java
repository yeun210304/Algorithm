import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        
        System.out.print(isLeapYear(year)?1:0);
    }
    
    static boolean isLeapYear(int year) {
        return year%4 == 0 && (year%100 != 0 || year%400 == 0);
    }
}