class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = 0;
        int end = 0;
        int index = 0;
        while(index < section.length) {
            if(section[index] <= end) {
                index++;
                continue;
            }
            start = section[index];
            end = start + m -1;
            index++;
            answer++;
        }
    return answer;
    }
}
