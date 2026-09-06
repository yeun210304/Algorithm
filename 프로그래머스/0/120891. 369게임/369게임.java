class Solution {
    public int solution(int order) {
        return (int) String.valueOf(order)
                            .chars()
                            .mapToObj(e -> String.valueOf((char) e))
                            .map(e -> Integer.valueOf(e))
                            .filter(e -> e != 0 && Integer.valueOf(e) % 3 == 0)
                            .count();
    }
}