import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        long startTime = System.currentTimeMillis(); // 시작 시간 기록
        answer = answerByStream(num_list);
        long endTime = System.currentTimeMillis();   // 종료 시간 기록
        long elapsedTime = endTime - startTime;      // 실행 시간 계산
        System.out.println("코드 실행 시간: " + elapsedTime + " ms");
        // For문보다 스트림이 더 빠른 실행 시간이 나왔다.
        return answer;
    }
    
    public static int answerByStream(int[] num_list) {
        return Integer.valueOf(Arrays.stream(num_list)
                    .filter(e -> e%2 != 0)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining()))
                    +
                    Integer.valueOf(Arrays.stream(num_list)
                    .filter(e -> e%2 == 0)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining()));
    }
    
    public static int answerByForLoop(int[] num_list) {
        StringBuffer evenBuffer = new StringBuffer();
        StringBuffer oddBuffer = new StringBuffer();
        
        for (int i=0; i<num_list.length; i++) {
            int e = num_list[i];
            if (e%2 == 0) {
                evenBuffer.append(e + "");
            }
            else {
                oddBuffer.append(e + "");
            }
        }
        return Integer.valueOf(evenBuffer.toString()) 
            + Integer.valueOf(oddBuffer.toString());
    }
}