import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        Integer[] arr = Arrays.stream((n+"").split("")).map(Integer::valueOf).toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        return Long.valueOf(Arrays.stream(arr)
                                .map(String::valueOf)
                                .collect(Collectors.joining()));
    }
}