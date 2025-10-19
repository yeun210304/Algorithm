import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list)
            .reduce((i , j) -> i*j)
            .getAsInt();
        int mult = (int) Math.pow(Arrays.stream(num_list)
            .reduce((i , j) -> i+j).getAsInt(), 2);
        return sum < mult ? 1 : 0;
    }
}