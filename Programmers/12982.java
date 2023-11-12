import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        // 부서별 신청 금액을 오름차순으로 정렬
        Arrays.sort(d);
        
        int answer = 0;
        int total = 0;

        // 정렬된 부서별 신청 금액을 순회하면서 예산을 초과하지 않도록 지원
        for (int i = 0; i < d.length; i++) {
            total += d[i];
            
            // 예산을 초과하지 않으면 해당 부서 지원 가능
            if (total <= budget) {
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
