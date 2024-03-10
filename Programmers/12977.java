class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // 세 개의 수를 선택하는 모든 조합을 확인
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // 선택한 세 수를 더한 값이 소수인지 확인
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        // 소수인 경우 answer를 증가
                        answer += 1;  
                    } 
                }
            }
        }
        return answer;
    }
    
    public Boolean isPrime(int num) {
        int count = 0;
        // 주어진 수의 제곱근까지 반복하여 나누어 떨어지는지 확인
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                count += 1; 
            }
        }
        // 나누어 떨어지는 수가 1개일 때만 소수로 판단
        return count == 1;
    }
}