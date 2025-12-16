import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr2.length != arr1.length) {
            return arr2.length>arr1.length ? -1 : 1;
        }
        
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        return sum2>sum1 ? -1 : (sum2<sum1 ? 1 : 0);
        
    }
}