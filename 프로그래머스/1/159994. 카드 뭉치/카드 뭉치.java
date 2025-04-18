import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cnt1 = 0;
        int cnt2 = 0;
        
        for (String s : goal) {
            if (cnt1 < cards1.length && s.equals(cards1[cnt1])) {
                cnt1++;
            }
            else if (cnt2 < cards2.length && s.equals(cards2[cnt2])) {
                cnt2++;
            }
            else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}