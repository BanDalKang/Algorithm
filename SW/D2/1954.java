package D2;

import java.util.Scanner;

class Solution {
    static int[] dr = { 0, 1, 0, -1 }; // 우하좌상 순서
    static int[] dc = { 1, 0, -1, 0 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt(); // n 입력 받기
            int[][] nums = new int[N][N]; // n x n 배열 생성

            int dir = 0; // 현재 방향 인덱스
            int r = 0, c = 0; // 시작 좌표

            for (int i = 1; i <= N * N; i++) {
                nums[r][c] = i; // 현재 위치에 숫자 넣기

                int nr = r + dr[dir];
                int nc = c + dc[dir];

                // 배열을 벗어나는지 또는 이미 숫자가 들어가있는지 확인
                if (nr >= N || nr < 0 || nc >= N || nc < 0 || nums[nr][nc] != 0) {
                    dir = (dir + 1) % 4; // 방향전환
                }

                r += dr[dir]; // 새로운 위치로 이동
                c += dc[dir];
            }

            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                for (int n : nums[i])
                    System.out.print(n + " ");
                System.out.println();
            }
        }
    }
}

