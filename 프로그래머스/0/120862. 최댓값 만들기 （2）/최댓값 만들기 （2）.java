import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int caseA = numbers[0] * numbers[1];
        int caseB = numbers[numbers.length-1] * numbers[numbers.length-2];
        return Math.max(caseA, caseB);
    }
}