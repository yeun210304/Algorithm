import java.util.*;

class Solution {
    public int[] solution(long n) {
        return Arrays.stream(new StringBuffer(n+"").reverse().toString().split(""))
                    .mapToInt(Integer::valueOf)
                    .toArray();
    }
}