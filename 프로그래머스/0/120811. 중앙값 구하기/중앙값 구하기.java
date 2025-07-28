import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int[] arr = Arrays.stream(array)
                        .sorted()
                        .toArray();
        
        return arr[arr.length/2];
    }
}