package Baekjun;

import java.util.*;

class P2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = 1;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++) {	//큐에 카드 넣기
            q.offer(i);
        }
        
        while(!(q.size() == 1)) {
            q.poll();	//제일 위 카드 버림
            last = q.poll();	//제일 위 카드 last에 저장
            q.offer(last);	//last를 마지막으로 옮김
        }
        System.out.println(last);
    }
}