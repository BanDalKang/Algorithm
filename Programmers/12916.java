package Programmers;

class Solution {
    boolean solution(String s) {
        // 대소문자 구분 없으므로 toLowerCase() 메소드 사용
        s = s.toLowerCase();

        // 'p'와 'y'의 개수 초기화
        int countP = 0;
        int countY = 0;

        // toCharArray() 메소드: 문자열을 구성하는 각 문자를 배열의 원소로 복사하여 반환
        for (char ch : s.toCharArray()) {
            if (ch == 'p') {
                countP++;
            } else if (ch == 'y') {
                countY++;
            }
        }

        return countP == countY;
    }
}