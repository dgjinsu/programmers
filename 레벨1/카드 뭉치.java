import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while(true) {
            if(index3 == goal.length) break;
            String target = goal[index3];
            if(index1 < cards1.length && cards1[index1].equals(target)) {
                index1++;
            }
            else if(index2 < cards2.length && cards2[index2].equals(target)) {
                index2++;
            }
            else {
                return "No";
            }
            index3++;
        }
        
        return "Yes";
    }
}
