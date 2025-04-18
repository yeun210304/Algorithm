import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        
        for (int i=0; photo.length > i; i++) {
            List<String> photoLst = Arrays.asList(photo[i]);
            int score = 0;
            
            for (int j=0; name.length > j; j++) {
                if (photoLst.contains(name[j])) {
                    score += yearning[j];
                }
            }
            
            answer[i] = score;
        }
        
        return answer;
    }
}