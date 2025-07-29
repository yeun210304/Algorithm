import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String sortedS = s.chars()
                        .sorted()
                        .mapToObj(c -> String.valueOf((char)c))
                        .collect(Collectors.joining());
        return new StringBuffer(sortedS).reverse().toString();
    }
}