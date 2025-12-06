import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, String alp) {    
        return my_string.chars()
            .mapToObj(c -> String.valueOf((char) c))
            .map(s -> s.equals(alp) ? s.toUpperCase() : s)
            .collect(Collectors.joining());
    }
}