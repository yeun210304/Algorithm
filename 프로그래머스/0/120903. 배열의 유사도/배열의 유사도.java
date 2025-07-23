import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int cnt = 0;
        List<String> lst = Arrays.asList(s1);
        for (String s : s2) {
            if (lst.contains(s))
                cnt++;
        }
        return cnt;
    }
}