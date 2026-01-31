import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
            .flatMapToInt(e -> IntStream.rangeClosed(e[0], e[1])
                                .map(i -> arr[i]))
            .toArray();
    }
}