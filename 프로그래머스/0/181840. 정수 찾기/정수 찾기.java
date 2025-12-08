import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list)
                .anyMatch(c -> c == n) ? 1 : 0;
    }
}