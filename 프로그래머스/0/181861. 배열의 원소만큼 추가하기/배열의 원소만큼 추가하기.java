import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int sum = IntStream.of(arr)
            .sum();
        int[] answer = new int[sum];
        
        int idx = 0;
        for (int i=0, j=1; i<answer.length; i++, j++) {
            answer[i] = arr[idx];

            if (j == arr[idx]) {
                idx++;
                j=0;
            }
        }
        
        return answer;
    }
}