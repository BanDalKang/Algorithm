class Solution {
    public String solution(String s) {
        StringBuffer result = new StringBuffer();
        // 입력 문자열을 소문자로 변환하고 각 문자를 배열로 분할
        String[] splitWords = s.toLowerCase().split("");
        boolean startWithUpper = true;

        for(String word : splitWords) {
            // 다음 문자가 대문자로 시작해야 할 경우 대문자로 변환하여 결과에 추가
            // 그렇지 않은 경우 그대로 결과에 추가
            result.append(startWithUpper ? word.toUpperCase() : word);
            // 현재 단어가 공백인 경우 다음 문자는 대문자
            startWithUpper = word.equals(" ") ? true : false;
        }
        return result.toString();
    }
}