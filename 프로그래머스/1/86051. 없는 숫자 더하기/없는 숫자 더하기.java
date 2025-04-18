import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.range(1, 10)
                .filter(e -> 0 > Arrays.binarySearch(numbers, e))
                .sum();
    }
}