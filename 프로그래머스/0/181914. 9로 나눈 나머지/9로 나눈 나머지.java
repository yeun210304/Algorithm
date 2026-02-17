class Solution {
    public int solution(String number) {
        return number.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .mapToInt(s -> Integer.valueOf(s))
                    .sum() % 9;
    }
}