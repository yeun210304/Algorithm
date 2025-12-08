class Solution {
    public int solution(int num, int k) {
        int idx = String.valueOf(num).indexOf(k+"");
        return idx>-1 ? idx+1 : idx;
    }
}