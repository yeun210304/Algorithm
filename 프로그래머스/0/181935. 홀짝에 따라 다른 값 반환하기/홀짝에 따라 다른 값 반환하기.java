import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(0, n)
            .filter(e -> n%2 == 0 ? e%2 == 0 : e%2 != 0)
            .map(e -> n%2 == 0 ? e*e : e)
            .sum();
    }
}