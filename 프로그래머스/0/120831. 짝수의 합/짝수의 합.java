import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return IntStream.range(1, n+1).filter(e -> e%2 == 0).sum();
    }
}