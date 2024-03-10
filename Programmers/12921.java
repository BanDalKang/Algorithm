class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        int answer = 0;

        // 배열 초기화
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수 개수 세기
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer += 1;
            }
        }
        return answer;
    }
}