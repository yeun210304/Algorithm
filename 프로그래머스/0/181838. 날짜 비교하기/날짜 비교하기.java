import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate dt1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dt2 = LocalDate.of(date2[0], date2[1], date2[2]);
        
        return dt1.isBefore(dt2) ? 1 : 0;
    }
}