class Solution {
    public int solution(String num_str) {
        return num_str.chars()
            .map(e -> Integer.valueOf(e - '0'))
            .sum();
    }
}