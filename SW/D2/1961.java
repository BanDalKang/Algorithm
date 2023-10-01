package D2;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt(); // 테스트 케이스 개수를 입력받음
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt(); // 행렬의 크기 N을 입력받음
            int[][] a = new int[n][n]; // N x N 크기의 배열 생성

            // 입력 행렬을 읽음
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" + t + " ");

            // 주어진 행렬을 90도, 180도, 270도 회전하여 출력
            for (int i = 0; i < n; i++) {
                // 90도 회전 출력
                for (int j = 0; j < n; j++) {
                    System.out.print(a[n - j - 1][i]);
                }
                System.out.print(" ");

                // 180도 회전 출력
                for (int j = 0; j < n; j++) {
                    System.out.print(a[n - i - 1][n - j - 1]);
                }
                System.out.print(" ");

                // 270도 회전 출력
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j][n - 1 - i]);
                }
                System.out.println();
            }
        }
    }
}
