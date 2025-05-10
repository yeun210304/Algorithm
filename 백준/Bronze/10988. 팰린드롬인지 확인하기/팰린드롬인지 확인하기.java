import java.util.*;
                 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String org = sc.next();
        sc.close();
        
        System.out.print(org.equals(new StringBuffer(org).reverse().toString()) ? 1 : 0);
    }
}