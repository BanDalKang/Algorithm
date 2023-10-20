class Solution {
    public long solution(int a, int b) {
        // a와 b가 같은 경우 아무 수나 리턴
        if (a == b) {
            return a;
        }

        // a와 b의 대소관계에 따라 합을 계산
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // 등차수열의 합 공식을 이용하여 합 계산
        long sum = (long) (start + end) * (end - start + 1) / 2;

        // 실행시간 최적화 X 코드
        //for (int i = start; i <= end; i++) {
        //    answer += i;
        //}

        return sum;
    }
}