package chap01;

public class Q12 {

    public static void main(String[] args) {
        for (int i = -1; i <= 9; i++) {
            if (i == -1)
                System.out.print("   |");
            else if (i == 0)
                System.out.print("---+");
            else
                System.out.printf(" %d |", i);
            for (int j = 1; j <= 9; j++) {
                if (i == -1) 
                    System.out.printf("%3d", j);
                else if (i == 0) 
                    System.out.print("---");
                else 
                    System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
