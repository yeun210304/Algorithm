import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return IntStream.range(0, 5)
            .map(e -> num_list[e])
            .toArray();
    }
}