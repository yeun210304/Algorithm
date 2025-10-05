import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, n)
            .map(e -> num_list[e])
            .toArray();
    }
}