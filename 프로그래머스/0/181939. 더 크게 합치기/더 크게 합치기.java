class Solution {
    public int solution(int a, int b) {
        int AplusB = Integer.valueOf(a + "" + b);
        int BplusA = Integer.valueOf(b + "" + a);
        
        return AplusB > BplusA ? AplusB : BplusA;
    }
}