import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<keymap.length; i++) {
            for(int j = 0; j<keymap[i].length(); j++) {
                if(map.containsKey(keymap[i].charAt(j))) {
                    Integer before = map.get(keymap[i].charAt(j));
                    if(j < before) {
                        map.put(keymap[i].charAt(j), j);
                    }
                }
                else map.put(keymap[i].charAt(j), j); 
            }
        }
        
        for(int i = 0; i<targets.length; i++) {
            int sum = 0;
            for(int j = 0; j<targets[i].length(); j++) {
                if(!map.containsKey(targets[i].charAt(j))) {
                    sum = -1;
                    break;
                }
                sum += map.get(targets[i].charAt(j)) + 1;
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}
