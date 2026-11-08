class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] > 1) {
                int e = num_list[i];
                num_list[i] = 
                    e % 2 == 0
                        ? e / 2
                        : (e - 1) / 2 ;
                answer++;
            }
        }
        return answer;
    }
}