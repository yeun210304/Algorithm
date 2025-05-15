import java.util.stream.*;

class Solution {
    public long solution(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        return LongStream.range(min, max+1).sum();
    }
}