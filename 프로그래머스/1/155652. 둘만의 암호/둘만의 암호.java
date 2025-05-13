import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s, String skip, int idx) {
        StringBuilder answer = new StringBuilder();
        
        Set<Character> skipSet = skip.chars()
                                     .mapToObj(c -> (char) c)
                                     .collect(Collectors.toSet());
        
        for (char c : s.toCharArray()) {
            int cnt = 0;
            
            while (cnt < idx) {
                do {
                    c++;
                    if (c > (int) 'z') 
                        c = 'a';
                }
                while (skipSet.contains(c));
                
                cnt++;
            }
            
            answer.append(c + "");
        }
        
        return answer.toString();
    }
}