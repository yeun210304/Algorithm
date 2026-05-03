import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.range(1, 100)
            .filter(i -> (6 * i) % n  == 0)
            .findFirst()
            .getAsInt();
    }
}