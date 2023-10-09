package Programmers;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // n의 제곱근까지만 반복
        for (int i = 1; i * i <= n; i++) {
            // n을 i로 나누어 떨어지면 i와 n/i는 n의 약수
            if (n % i == 0) {
                answer += i;
                // i와 n/i가 같지 않으면 중복된 약수를 방지하기 위해 n/i도 처리
                if (i != n / i) {
                    answer += n / i;
                }
            }
        }

        // 약수의 합을 반환
        return answer;
    }
}