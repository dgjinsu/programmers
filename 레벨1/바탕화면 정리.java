import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        int x_max = -1;
        int x_min = Integer.MAX_VALUE;
        int y_max = -1;
        int y_min = Integer.MAX_VALUE;
        
        
        for(int i = 0; i<wallpaper.length; i++) {
            for(int j = 0; j<wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    if(x_max < i) x_max = i;
                    if(x_min > i) x_min = i;
                    if(y_max < j) y_max = j;
                    if(y_min > j) y_min = j;
                }
            }
        }
        
        int[] answer = {x_min, y_min, x_max+1, y_max+1};
        return answer;
    }
}
