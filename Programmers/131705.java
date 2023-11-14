class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // 첫 번째 학생 선택
        for(int i = 0; i<number.length; i++) {
            // 두 번째 학생 선택
            for(int j = i+1; j<number.length; j++) {
                // 세 번째 학생 선택
                for(int k = j+1; k<number.length; k++) {
                    // 세 명의 학생의 정수 번호를 더한 값이 0인지 확인
                    if(number[i]+number[j]+number[k] == 0) {
                        // 만약 0이면 가능한 삼총사의 경우의 수 증가
                        answer++;
                    }
                }
            }
        }
        return answer; 
    }
}
