import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] chars = s.toCharArray();

        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(chars);

        // 정렬된 문자 배열을 문자열로 변환하여 반환
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}