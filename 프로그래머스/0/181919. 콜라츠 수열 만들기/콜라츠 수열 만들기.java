import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while(n != 1) {
            list.add(n);
            n = n%2 == 0 ? n/2 : 3*n+1;
        }
        
        list.add(n);
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}