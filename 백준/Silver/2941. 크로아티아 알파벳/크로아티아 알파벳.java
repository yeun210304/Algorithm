import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        
        String[] words = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;
        
        for (String word : words) {
            while (input.contains(word)) {
                input = input.replaceFirst(word, " ");
                cnt++;
            }
        }
        
        input = input.replace(" ", "");
        cnt += input.length();
        
        System.out.println(cnt);
    }
}