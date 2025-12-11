import java.util.Arrays;

class Solution {
    public String solution(String n_str) {
        int idx = 0;
        
        for (char c : n_str.toCharArray()) {
            if (c != '0') {
                break;
            }
            idx++;
        }
            
        return n_str.substring(idx);
    }
}