import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
         return (int) IntStream.rangeClosed(4, n)
        // IntStream.rangeClosed(4, n)
            .filter(i -> isPrime(i))
            .count();
            // .forEach(System.out::println);
        // return n - primeNumCnt - (n < 4 ? n : 3);
        // return 0;
    }
    
    private boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return true;
            } 
        }
        return false;
    }
}