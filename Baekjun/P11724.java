package Baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724 {
    static boolean visited[]; //방문 배열
    static ArrayList<Integer>[] A; //연결 리스트
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //노드개수
		int m = Integer.parseInt(st.nextToken()); //에지 개수
        visited = new boolean[n+1];
        A = new ArrayList[n+1];

        for(int i=1; i<n+1; i++){ //연결 리스트 초기화 n개수만큼
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++){ //인접리스트에 그래프 데이터 저장 m개수만큼
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
		    int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count = 0; // 연결 요소 개수
        for(int i=1; i<n+1; i++){
            if(!visited[i]){ // 방문 안한 노드 있으면 
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
	}

    private static void DFS(int v) { //DFS 구현
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}