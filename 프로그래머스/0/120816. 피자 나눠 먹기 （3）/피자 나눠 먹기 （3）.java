class Solution {
    public int solution(int slice, int n) {
        return n%slice > 0 ? (int) n/slice + 1 : (int) n/slice;
    }
}