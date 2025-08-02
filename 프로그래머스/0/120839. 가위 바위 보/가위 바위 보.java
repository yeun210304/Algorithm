class Solution {
    public String solution(String rsp) {
        StringBuffer sb = new StringBuffer();
        for (char c : rsp.toCharArray()) {
            sb.append(c=='2' ? "0" : (c=='0' ? "5" : "2"));
        }
        return sb.toString();
    }
}