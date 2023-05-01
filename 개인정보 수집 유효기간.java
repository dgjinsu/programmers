import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Long> list = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        
        long year = Integer.parseInt(today.substring(0, 4)) * 28 * 12;
        long month = Integer.parseInt(today.substring(5,7)) * 28;
        long date = Integer.parseInt(today.substring(8,10));
        
        long today_by_date = year + month + date;
        
        for(int i = 0; i<terms.length; i++) {
            StringTokenizer st = new StringTokenizer(terms[i], " ");
            map.put(st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
        }
        
        for(int i = 0; i<privacies.length; i++) {
            int year_ = Integer.parseInt(privacies[i].substring(0, 4));
            int month_ = Integer.parseInt(privacies[i].substring(5,7));
            int date_ = Integer.parseInt(privacies[i].substring(8,10));
            
            char type = privacies[i].substring(11,12).charAt(0);
            int plus = map.get(type);
            
            
            long now = (year_ * 28 * 12) + (month_ * 28) + date_;
            long after = now + (plus * 28);
            System.out.println(after);
            
            
            list.add(after);
        }
        System.out.println(today_by_date);
        for(int i = 0; i<list.size(); i++) {
            if(today_by_date >= list.get(i)) {
                answerList.add(i);
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i = 0 ;i<answerList.size(); i++) {
            answer[i] = answerList.get(i) + 1;
        }

        return answer;
    }
}
