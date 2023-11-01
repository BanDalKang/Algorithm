class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        // "수박" 패턴을 n/2번 반복
        for (int i = 0; i < n / 2; i++) {
            answer.append("수박");
        }

        // 만약 n이 홀수라면 마지막에 "수"를 추가
        if (n % 2 == 1) {
            answer.append("수");
        }

        return answer.toString();
    }
}