class Solution {
    public int solution(String s) {
        char prev = 'A';
        int same = 0;
        int different = 0;
        int answer = 0;
        
        for (char c : s.toCharArray()) {
            if (prev == 'A') {
                prev = c;
                same++;
                answer++;
            } else if (prev == c) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                prev = 'A';
                same = 0; 
                different = 0;
            }
        }

        return answer;
    }
}