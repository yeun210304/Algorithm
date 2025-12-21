import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
            .filter(e -> e.indexOf("ad") == -1)
            .map(String::valueOf)
            .toArray(String[]::new);
    }
}