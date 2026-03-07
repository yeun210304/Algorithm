import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(c -> c == 97 || c == 65 ? 
                     String.valueOf((char) 65) : 
                     String.valueOf((char) c).toLowerCase()
                    )
                .collect(Collectors.joining(""));
    }
}