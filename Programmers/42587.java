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


class PriorityQueueExample {
    public static void main(String[] args) {
        // 우선순위 큐 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 요소 추가
        pq.offer(3);
        pq.offer(5);
        pq.offer(2);

        // 우선순위가 가장 높은 요소 출력
        System.out.println("가장 우선순위가 높은 요소: " + pq.peek()); // 출력: 1

        // 우선순위가 가장 높은 요소 제거 후 출력
        System.out.println("가장 우선순위가 높은 요소 제거 후: " + pq.poll()); // 출력: 1

        // 요소 추가
        pq.offer(5);
        pq.offer(4);

        // 모든 요소 출력
        System.out.println("우선순위 큐의 모든 요소:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 출력: 2, 3, 4, 5 (우선순위에 따라 정렬됨)
        }
    }
}
