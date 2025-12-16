class Solution {
    public int solution(int a, int b) {
        boolean AisEven = a%2 == 0;
        boolean BisEven = b%2 == 0;
        
        return !AisEven && !BisEven ? a*a + b*b : 
            (AisEven && BisEven ? Math.max(a, b) - Math.min(a,b) : 2*(a+b));
    }
}