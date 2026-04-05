import java.util.stream.IntStream;

class Solution {
    public String solution(int[] numLog) {
        int[] inputValues = findInputNums(numLog);
        return findInputStr(inputValues);
    }
    
    public int[] findInputNums(int[] arr) {
        return IntStream.range(1, arr.length)
                .map(i -> {
                    int prv = arr[i -1];
                    int nxt = arr[i];
                    
                    return nxt - prv;
                })
                .toArray();
    }
    
    public String findInputStr(int[] inputValues) {
        StringBuffer sb = new StringBuffer();
        
        for (int e : inputValues) {
            switch(e) {
                case 1: sb.append("w");
                    break;
                case -1: sb.append("s");
                    break;
                case 10: sb.append("d");
                    break;
                case -10: sb.append("a");
                    break;
            }
        }
        
        return sb.toString();
    }
}