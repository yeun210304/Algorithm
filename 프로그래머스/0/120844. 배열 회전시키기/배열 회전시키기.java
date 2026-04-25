import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] frstArr;
        int[] nxtArr;
        
        if ("right".equals(direction)) {
            frstArr = new int[]{numbers[numbers.length - 1]};
            nxtArr = Arrays.copyOfRange(numbers, 0, numbers.length - 1);
        }
        else {
            frstArr = Arrays.copyOfRange(numbers, 1, numbers.length);
            nxtArr = new int[]{numbers[0]};
        }
        
        return IntStream.concat(
            Arrays.stream(frstArr), Arrays.stream(nxtArr)
        )
        .toArray();
    }
}