import java.util.stream.*;
import java.util.concurrent.atomic.*;

class Solution {
    public int solution(int n, int t) {
        AtomicInteger res = new AtomicInteger(n);
        IntStream.range(0, t).forEach(e->
            res.set(res.get() * 2));
        return res.get();
    }
}