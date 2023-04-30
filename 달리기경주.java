import java.util.*;
import java.util.stream.*;

class Solution {
    private static Map<String, Integer> playerName = new HashMap<>();
    private static Map<Integer, String> playerRank = new HashMap<>();
    
    public String[] solution(String[] players, String[] callings) {

        String[] answer = new String[players.length];
        for (int i = 0; i<players.length; i++) {
            playerName.put(players[i], i);
            playerRank.put(i, players[i]);
        }
        
        for(int i = 0; i<callings.length; i++) {
            int val = playerName.get(callings[i]);
            
            String frontPlayer = playerRank.get(val-1);
            playerName.put(frontPlayer, val);
            playerName.put(callings[i], val-1);
            
            playerRank.put(val-1, callings[i]);
            playerRank.put(val, frontPlayer);
        }
        for(int i = 0; i<players.length; i++) {
            answer[i] = playerRank.get(i);
        }
        
        
        return answer;
    }
}
