import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int res1 = num_list[0];
        for (int i=1; i<num_list.length; i++) {
            res1 = res1 * num_list[i];
        }
        int res2 = Arrays.stream(num_list)
            .sum();
        return res1 < res2*res2 ? 1 : 0;
    }
}