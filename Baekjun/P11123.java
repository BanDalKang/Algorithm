package Baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11123 {
    static int R, C, cnt;
    static int[][] deltas = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static char[][] map;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < TC; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            map = new char[R][C];
            for (int r = 0; r < R; r++) {
                String input = br.readLine();
                map[r] = input.toCharArray();
            }
            cnt = 0; // cnt 초기화

            // 입력완료
            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {
                    if (map[r][c] == '#') {
                        cnt++; // 탐색할때마다 카운트 세주기
                        dfs(r, c);
                    }
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }

    static void dfs(int r, int c) {
        map[r][c] = '.'; // 현재 위치를 '.'으로 (방문 표시)
        for (int d = 0; d < 4; d++) {
            int nr = r + deltas[d][0];
            int nc = c + deltas[d][1];
            if (isIn(nr, nc) && map[nr][nc] == '#') {
                dfs(nr, nc);
            }
        }
        printMap();
        return;
    }

    static boolean isIn(int nr, int nc) {
        return nr >= 0 && nr < R && nc >= 0 && nc < C;
    }

    // map 출력 함수
    static void printMap() {
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                System.out.print(map[r][c]);
            }
            System.out.println(); // 각 행이 끝날 때마다 개행
        }
        System.out.println(); // map 출력 간 구분을 위한 빈 줄 추가
    }
}
