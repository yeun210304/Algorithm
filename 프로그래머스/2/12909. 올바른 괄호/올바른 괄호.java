import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.split("");
        
        if (")".equals(arr[0]) || "(".equals(arr[s.length()-1])) {
            answer = false;
        }
        else {
            int cnt = 0;
            
            for (String e : arr) {
                if (0 > cnt) {
                    answer = false; 
                    break;
                }
                
                if ("(".equals(e)) 
                    cnt++;
                else 
                    cnt--;
            }
            answer = cnt == 0;
        }

        return answer;
    }
}