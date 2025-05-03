import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] T = new int[sc.nextInt()];
        sc.nextLine(); // 개행 문자 제거
        
        for (int i = 0; i < T.length; i++) {
            String[] S = sc.nextLine().split(" ");
            int N = Integer.valueOf(S[0]);
            String[] str = S[1].split("");

            Arrays.stream(str).forEach(e -> {
                for (int j = 0; j < N; j++) {
                    System.out.print(e);
                }
            });
            System.out.println();
        }
        
        sc.close();
    }
}