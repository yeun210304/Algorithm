import java.util.Arrays;

class Solution {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::valueOf)
            .sum();
    }
}