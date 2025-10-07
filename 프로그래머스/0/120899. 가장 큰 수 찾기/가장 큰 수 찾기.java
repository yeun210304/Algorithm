import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        return new int[]{max, Arrays.binarySearch(array, max)};
    }
}