import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int evenSum = IntStream.range(0, num_list.length)
            .filter(i -> i%2 == 0)
            .map(i -> num_list[i])
            .sum();
        int oddSum = IntStream.range(0, num_list.length)
            .filter(i -> i%2 != 0)
            .map(i -> num_list[i])
            .sum();
        return evenSum >= oddSum ? evenSum : oddSum;
    }
}