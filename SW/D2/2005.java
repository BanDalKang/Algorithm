package D2;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt(); // 파스칼의 삼각형 크기

            int[][] triangle = new int[N][N];
            triangle[0][0] = 1; // 첫 번째 줄은 1로 시작

            for (int i = 1; i < N; i++) {
                triangle[i][0] = 1; // 각 줄의 첫 번째 숫자는 항상 1
                for (int j = 1; j <= i; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }

            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
