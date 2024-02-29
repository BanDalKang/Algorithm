class Solution {
    public String solution(int[] food) {
        StringBuilder answerBuilder = new StringBuilder("0");
        
        // 배열을 끝에서부터 순회
        for (int i = food.length - 1; i >= 1; i--) {
            // 음식의 양이 2로 나눌 수 있는 경우
            if (food[i] / 2 > 0) {
                // 음식의 종류를 문자열로 변환
                String eatable = String.valueOf(i);
                // 음식의 양을 반으로 나눈 만큼 반복하여 StringBuilder에 추가
                for (int j = 0; j < food[i] / 2; j++) {
                    // 결과 문자열의 앞에 음식의 종류를 추가하고, 뒤에도 추가
                    answerBuilder.insert(0, eatable).append(eatable);
                }
            }
        }
                return answerBuilder.toString();
    }
}