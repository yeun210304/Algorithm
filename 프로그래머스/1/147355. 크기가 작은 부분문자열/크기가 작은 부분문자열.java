class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLeng = t.length();
        Long pNum = Long.valueOf(p);
        
        for (int i=0, j=p.length(); tLeng >= j; i++,j++) {
            Long tNum = Long.valueOf(t.substring(i, j));
             if (pNum >= tNum) {
                 answer++;
             }
        }
        return answer;
    }
}