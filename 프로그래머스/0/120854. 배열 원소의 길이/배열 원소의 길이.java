import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
            .mapToInt(e -> e.length())
            .toArray();
    }
}