class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        // a와 b의 내적 계산
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}