import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int cnt = schedules.length;
        
        for (int i=0; i<schedules.length; i++) {
            int add10mins = schedules[i]+10;
            
            if (add10mins%100 >= 60) 
                add10mins += 40;
                
            boolean success = true;
            
            for (int j=0; j<7; j++) {
                int currentDay = (startday + j - 1) % 7;
                
                if (currentDay == 5 || currentDay == 6)
                    continue;
                
                if (add10mins < timelogs[i][j]) {
                    success = false;
                    break;
                }
            }
            if (!success) cnt--;
        }
            
        return cnt;
    }
}