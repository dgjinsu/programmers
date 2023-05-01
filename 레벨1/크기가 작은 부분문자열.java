class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int start = 0;
        int end = p.length();
        
        while(end <= t.length()) {
            long sub = Long.parseLong(t.substring(start, end));
            long temp = Long.parseLong(p);
            if(sub <= temp) answer++;
            start++;
            end++;
        }
        return answer;
    }
}
