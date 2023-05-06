import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++) {
            int location = s.indexOf(s.charAt(i));
            if(location < i) {
                answer[i] =  i - location;
                if(i < s.length() -1)
                s = s.substring(0,location) + "A" + s.substring(location+1);
            }
            else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
