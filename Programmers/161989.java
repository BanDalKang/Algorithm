class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int startIdx = 0;
        
        for (int i = 1; i < section.length; i++) {
            if (section[i] - section[startIdx] + 1 > m) {
                startIdx = i;
                answer += 1;
            }
        }
        // 마지막 구역 처리
        answer += 1;

        return answer;
    }
}