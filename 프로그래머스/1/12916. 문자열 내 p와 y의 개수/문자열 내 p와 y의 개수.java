import java.util.*;

class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int pCnt = 0;
        int yCnt = 0;
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'P')
                pCnt++;
            else if (c == 'Y')
                yCnt++;
        }
        
        boolean answer = (pCnt!=yCnt)?false:true;
        return answer;
    }
}