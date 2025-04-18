import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        Object[] sortedArr = Arrays.stream(s.split(" "))
                                    .map(Integer::valueOf)
                                    .sorted()
                                    .toArray();
        
        return sortedArr[0] + " " + sortedArr[sortedArr.length-1];
    }
}