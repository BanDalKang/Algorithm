package Programmers;

class Solution {
    public int solution(String s) {
        // 부호 여부 확인
        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1); // 부호를 제외한 나머지 문자열로 갱신
        } else if (s.charAt(0) == '+') { // substring(Index): Index부터 문자열 끝까지 추출
            s = s.substring(1);          // substring(sIndex, eIndex): sIndex부터 eIndex 전까지 추출
        }

        // 문자열을 정수로 변환
        return Integer.parseInt(s) * sign;
    }
}
