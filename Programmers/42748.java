import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            // i번째 명령어에 따라 배열 자르기
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            // 잘린 배열 정렬
            Arrays.sort(temp);
            // k번째 값 결과 배열에 저장
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}