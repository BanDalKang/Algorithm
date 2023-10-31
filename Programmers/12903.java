class Solution {
    public String solution(String s) {
        int length = s.length();

        // 단어의 길이가 홀수일 때
        if (length % 2 == 1) {
            return String.valueOf(s.charAt(length / 2));
        }
        // 단어의 길이가 짝수일 때
        else {
            return s.substring(length / 2 - 1, length / 2 + 1);
        }
    }
}