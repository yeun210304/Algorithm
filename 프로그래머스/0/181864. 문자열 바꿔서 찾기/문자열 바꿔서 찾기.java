class Solution {
    public int solution(String myString, String pat) {
        String changed = myString.replaceAll("A", "b").replaceAll("B", "a"); 
        return changed.indexOf(pat.toLowerCase()) == -1 ? 0 : 1;
    }
}