import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {        
        return Arrays.stream(myString.split("x", -1))
            .map(s -> s.length())
            .mapToInt(Integer::intValue)
            .toArray();
    }
}