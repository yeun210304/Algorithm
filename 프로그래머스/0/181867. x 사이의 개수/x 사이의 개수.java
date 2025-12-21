class Solution {
    public int[] solution(String myString) {        
        int length = myString.split("x").length;
        boolean isEndsWithX = myString.endsWith("x");
        int[] answer = new int[isEndsWithX ? length+1 : length];
        String[] arr = myString.split("x");
        
        for (int i=0; i<arr.length; i++) {
            answer[i] = arr[i].length();
        }
        
        return answer;
    }
}