import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list)
            .filter(s -> s.indexOf(ex) == -1)
            .collect(Collectors.joining());
    }
}