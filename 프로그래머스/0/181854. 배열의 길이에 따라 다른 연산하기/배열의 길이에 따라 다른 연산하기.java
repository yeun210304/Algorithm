import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        boolean isEven = arr.length%2 == 0;
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            if (i%2==0) {
                answer[i] = isEven? arr[i] : arr[i]+n;
            }
            else {
                answer[i] = isEven? arr[i]+n : arr[i];
            }
        }
        return answer;
    }
}