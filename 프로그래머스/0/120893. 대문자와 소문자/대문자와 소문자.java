import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
                        .mapToObj(e -> {
                            char c = (char) e;
                            return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
                        })
                        .map(String::valueOf)
                        .collect(Collectors.joining());
    }
}