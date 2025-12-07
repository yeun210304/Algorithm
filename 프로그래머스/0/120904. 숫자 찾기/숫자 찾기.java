import java.util.List;
import java.util.Arrays;

class Solution {
    public int solution(int num, int k) {
        List<String> lst = Arrays.asList(String.valueOf(num).split(""));
        int idx = lst.indexOf(String.valueOf(k));
        return idx < 0 ? idx : idx + 1;
    }
}