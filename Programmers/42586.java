import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        
        // 각 작업의 배포까지 남은 일수 올림 계산하여 스택에 저장
        for (int i = progresses.length - 1; i >= 0; i--) {
            int remainingDays = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            stack.push(remainingDays);
        }
        
        while (!stack.isEmpty()) {
            int count = 1; // 배포되는 기능 수 카운트
            int prevProgress = stack.pop(); // 이전 기능의 배포까지 남은 일수
            
            // 스택이 비어있지 않고, 이전 기능의 배포보다 현재 기능의 배포까지 남은 일수가 더 길면 카운트 증가
            while (!stack.isEmpty() && stack.peek() <= prevProgress) {
                stack.pop();
                count++;
            }
            
            answerList.add(count); // 배포되는 기능 수 추가
        }
        
        // ArrayList를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}