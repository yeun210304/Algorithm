import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int even = (int) Arrays.stream(num_list).filter(e->e%2==0).count();
        return new int[]{even, num_list.length-even};
    }
}