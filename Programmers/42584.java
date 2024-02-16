import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> idxStack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            // 주가 하락 O, answer에 가격이 떨어지지 않은 기간 저장
            while (!idxStack.isEmpty() && prices[i] < prices[idxStack.peek()]) {
                int j = idxStack.pop();
                answer[j] = i - j;
            }
            // 주가 하락 X, 인덱스를 스택에 저장
            idxStack.push(i);
        }

        // 스택에 저장된 인덱스로, 주가 하락 X 때의 가격이 떨어지지 않은 기간 저장
        while (!idxStack.isEmpty()) {
            int j = idxStack.pop();
            answer[j] = prices.length - 1 - j;
        }

        return answer;
    }
}