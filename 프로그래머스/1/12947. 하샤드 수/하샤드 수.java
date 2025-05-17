import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        int sum = Arrays.stream((x+"").split("")).mapToInt(Integer::valueOf).sum();
        return x % sum == 0;
    }
}