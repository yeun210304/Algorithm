import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String param) {
        String[] arr = param.split(" ", -1);
        StringBuffer sb = new StringBuffer();
        
        for (int i=0; i<arr.length; i++) {
            if (i != 0) 
                sb.append(" ");
            
            for (int j=0; j<arr[i].length(); j++) {
                if (j == 0) 
                    sb.append(String.valueOf(arr[i].charAt(j)).toUpperCase());
                else 
                    sb.append(String.valueOf(arr[i].charAt(j)).toLowerCase());
            }
        }
        return sb.toString();
    }
}