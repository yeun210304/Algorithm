import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b, int c) {
        long cnt = IntStream.of(a, b, c)
            .distinct()
            .count();
        
        int p1 = a+b+c;
        int p2 = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int p3 = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        
        return cnt == 3 ? p1 
                : (cnt == 2 ? p1 * p2
                  : p1 * p2 * p3
                  );
    }
}