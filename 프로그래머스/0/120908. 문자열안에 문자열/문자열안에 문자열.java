class Solution {
    public int solution(String str1, String str2) {
        return str1.equals(str1.replace(str2, "")) ? 2 : 1;
    }
}