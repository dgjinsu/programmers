import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i<skip.length(); i++) {
            
            map.put((int)skip.charAt(i), 1);
        }
        
        for(int i = 0; i<s.length(); i++) {
            int letter = (int)s.charAt(i);
            int n = index;
            while(n>0) {
                letter++;
                if(letter > 'z') {
                    letter -= 26;
                }
                if(map.containsKey(letter)) continue;
                n--;
            }
            answer += (char)letter;
        }
        return answer;
    }
}
