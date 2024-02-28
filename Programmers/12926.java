class Solution {
    public static String solution(String s, int n) {
        // 결과를 저장할 StringBuilder 생성
        StringBuilder answer = new StringBuilder();

        // 문자열 s의 각 문자에 대해 반복
        for (char ch : s.toCharArray()) {
            // 알파벳인 경우만 처리
            if (Character.isLetter(ch)) {
                // 대문자인지 소문자인지에 따라 기준값(base) 설정
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                // 현재 문자를 밀어서 새로운 문자 생성
                char encrypted = (char) ((ch - base + n) % 26 + base);
                // 결과에 새로운 문자 추가
                answer.append(encrypted);
            } else {
                // 알파벳이 아닌 경우 그대로 추가
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
