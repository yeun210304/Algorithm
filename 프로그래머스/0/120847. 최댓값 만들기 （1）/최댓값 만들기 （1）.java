import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] arr = Arrays.stream(numbers).sorted().toArray();
        int arrLeng  =arr.length;
        return arr[arrLeng-1] * arr[arrLeng-2];
    }
}