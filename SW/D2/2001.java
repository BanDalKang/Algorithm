import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt(); // 영역 N*N
            int M = sc.nextInt(); // 파리채 사이즈 M*M

            int[][] map = new int[N][N]; // N*N 배열 생성
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int maxSum = 0; // 파리채로 잡을 수 있는 가장 큰 값, ans

            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    int sum = 0;

                    for (int k = 0; k < M; k++) {
                        for (int l = 0; l < M; l++) {
                            sum += map[i + k][j + l];
                        }
                    }

                    maxSum = Math.max(maxSum, sum);
                }
            }

            System.out.printf("#%d %d\n", t, maxSum);
        }
    }
}
