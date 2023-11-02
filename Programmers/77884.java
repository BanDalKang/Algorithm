class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int num = left; num <= right; num++) {
            int divisorCount = countDivisors(num);

            // 약수의 개수가 짝수인 경우 더하고, 홀수인 경우 빼기
            if (divisorCount % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }

        return answer;
    }

    // 약수의 개수를 계산하는 함수
    private int countDivisors(int num) {
        int count = 0;
        int sqrt = (int) Math.sqrt(num); // 수의 제곱근 계산

        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                count += 2; // 약수의 쌍이므로 2씩 증가
                if (i == num / i) {
                    count--; // 제곱수의 경우 중복 카운트를 피하기 위해 1 감소
                }
            }
        }

        return count;
    }
}
