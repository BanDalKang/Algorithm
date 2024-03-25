import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 우선순위 큐에 중요도를 넣고, 실행 대기 큐에는 인덱스를 넣음
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
            pq.offer(priorities[i]);
        }

        while (!queue.isEmpty()) {
            int curIndex = queue.poll();
            int curPriority = priorities[curIndex];

            if (curPriority == pq.peek()) { 
                pq.poll(); 
                answer++; 
                if (curIndex == location) 
                    break;
            } else {
                queue.offer(curIndex);
            }
        }

        return answer;
    }
}