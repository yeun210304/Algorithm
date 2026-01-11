class Solution {
    public int solution(String binomial) {
        String[] AopB = binomial.split(" ");
        int a = Integer.valueOf(AopB[0]);
        int b = Integer.valueOf(AopB[2]);
        String op = AopB[1];
        return "+".equals(op) ? a+b
            : ("-".equals(op) ? a-b : a*b);
    }
}