import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr, int idx) {
        return IntStream.range(0, arr.length)
            .filter(i -> arr[i] == 1 && i >= idx)
            .findFirst().orElse(-1);
    }
}