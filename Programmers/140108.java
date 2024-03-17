class Solution {
    public int solution(String s) {
        char firstChar = 'A';
        int same = 0;
        int different = 0;
        int answer = 0;
        
        for (char c : s.toCharArray()) {
            if (firstChar == 'A') {
                firstChar = c;
                same++;
                answer++;
            } else if (firstChar == c) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                firstChar = 'A';
                same = 0; 
                different = 0;
            }
        }

        return answer;
    }
}