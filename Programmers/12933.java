package Programmers;

class Solution {
    public long solution(long n) {
        // long을 문자열로 변환 후 각 자릿수를 문자 배열에 저장
        char[] digits = Long.toString(n).toCharArray();

        // 문자 배열을 직접 정렬 (오름차순)
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }

        // 문자 배열을 long으로 변환하여 반환
        return Long.parseLong(new String(digits));
    }
}
