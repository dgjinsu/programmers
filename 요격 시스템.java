import java.util.*;

class Target implements Comparable<Target> {
    int a;
    int b;
    int len;
    int broken;
    public Target(int a, int b, int len, int broken) {
        this.a = a;
        this.b = b;
        this.len = len;
        this.broken = broken;
    }
    
    public int compareTo(Target t) {
        return this.b - t.b;
    }
}

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        ArrayList<Target> list = new ArrayList<>();
        
        for(int i = 0; i<targets.length; i++) {
            Target t = new Target(targets[i][0], targets[i][1],
                                 targets[i][1]-targets[i][0], 0);
            list.add(t);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i<list.size(); i++) {
            Target t1 = list.get(i);
            if(t1.broken == 1) continue;
            for(int j = i+1; j<list.size(); j++) {
                Target t2 = list.get(j);
                if(t2.a < t1.b) {
                    t2.broken = 1;
                }
            }
            answer++;
        }
        
        return answer;
    }
}
