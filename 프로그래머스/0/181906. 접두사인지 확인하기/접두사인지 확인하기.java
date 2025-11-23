import java.util.stream.IntStream;

class Solution {
    public int solution(String my_string, String is_prefix) {
        return IntStream.range(0, my_string.length())
            .filter(e -> my_string.substring(0, e).equals(is_prefix))
            .sum() > 0 ? 1 : 0;
    }
}