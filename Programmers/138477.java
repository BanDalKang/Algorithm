import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        // 우선순위 큐를 이용하여 상위 k개의 점수를 유지
        PriorityQueue<Integer> topKscores = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            // 현재 점수를 우선순위 큐에 추가
            topKscores.add(score[i]);

            // 우선순위 큐의 크기가 k를 초과하는 경우, 가장 낮은 점수를 제거
            if (topKscores.size() > k) {
                topKscores.poll();
            }

            // 현재 날짜의 명예의 전당 점수를 저장
            answer[i] = topKscores.peek();
        }
        return answer;
    }
}