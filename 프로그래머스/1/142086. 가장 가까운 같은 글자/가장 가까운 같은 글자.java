import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
            
        for (int i=0; s.length() > i; i++) {
            int res = -1;
            char c = s.charAt(i);
            
            for (int j=i-1,k=1; j>=0; j--,k++) {
                if (c == s.charAt(j)) {
                    res = k;
                    break;
                }
            }
            
            answer[i] = res;
        }
        
        return answer;
    }
}