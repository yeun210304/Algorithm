import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dial = sc.next();
        sc.close();
        
        char[] AtoZ = new char[26];
        int idx = 0;
        for (char i='A'; i<='Z'; i++) {
            AtoZ[idx] = i;
            idx++;
        }
        
        int sum = 0;
        for (int i=0; i<dial.length(); i++) {
            int dialIdx = Arrays.binarySearch(AtoZ, dial.charAt(i));
            if (dialIdx>=18 && dialIdx<25) {
                dialIdx--;
            }
            else if (dialIdx>24) {
                dialIdx = 23;
            }
            sum += dialIdx/3 + 3;
        }
        
        System.out.print(sum);
    }
}