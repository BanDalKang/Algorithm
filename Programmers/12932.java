package Programmers;

class Solution {
    public int[] solution(long n) {
        // long타입을 문자열로 변환
        String numString = Long.toString(n);

        // 문자열을 각 자릿수를 원소로 가지는 배열로 변환
        int[] answer = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            // - 1 - i: 현재 순회 중인 인덱스 i를 고려하여 역순, - '0'은 문자를 정수로 변환
            answer[i] = numString.charAt(numString.length() - 1 - i) - '0';
        }

        return answer;
    }
}
