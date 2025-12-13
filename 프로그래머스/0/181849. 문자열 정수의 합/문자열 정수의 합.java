class Solution {
    public int solution(String num_str) {
        return num_str.chars()
            .mapToObj(e -> String.valueOf((char) e))
            .mapToInt(Integer::valueOf)
            .sum();
    }
}