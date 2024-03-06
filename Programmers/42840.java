import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3]; // 세 수포자의 점수
        int[] answer = {}; // 최고 점수를 받은 수포자들의 번호
        
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 정답과 비교하여 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) score[0]++;
            if (answers[i] == pattern2[i % pattern2.length]) score[1]++;
            if (answers[i] == pattern3[i % pattern3.length]) score[2]++;
        }
        
        // 최고 점수 계산
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 최고 점수를 받은 수포자들의 번호 찾기
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                list.add(i + 1); // 배열의 인덱스가 0부터 시작하므로 +1
            }
        }
        
        // List를 배열로 변환
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}