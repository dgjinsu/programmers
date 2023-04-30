import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        HashMap<String, Integer> m = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<name.length; i++) {
            m.put(name[i], yearning[i]);
        }
        for(int i = 0; i<photo.length; i++) {
            int sum = 0;
            for(int j = 0; j<photo[i].length; j++) {
                if(m.containsKey(photo[i][j])) {
                    sum += m.get(photo[i][j]);
                }
            }
            list.add(sum);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
