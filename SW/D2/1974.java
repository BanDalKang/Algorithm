import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 개수

        for (int t = 1; t <= T; t++) {
            int[][] board = new int[9][9]; // 9x9 스도쿠 보드 생성

            // 스도쿠 퍼즐 입력
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    board[i][j] = scanner.nextInt();
                }
            }

            int result = isValidSudoku(board) ? 1 : 0;
            System.out.println("#" + t + " " + result);
        }
    }

    // 스도쿠 유효성 검사 함수
    private static boolean isValidSudoku(int[][] board) {
        // 행 검사
        for (int row = 0; row < 9; row++) {
            if (!isValidRow(board, row)) {
                return false;
            }
        }

        // 열 검사
        for (int col = 0; col < 9; col++) {
            if (!isValidColumn(board, col)) {
                return false;
            }
        }

        // 작은 격자(3x3) 검사
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!isValidGrid(board, row, col)) {
                    return false;
                }
            }
        }

        return true;
    }

    // 행 검사
    private static boolean isValidRow(int[][] board, int row) {
        boolean[] used = new boolean[9];
        for (int i = 0; i < 9; i++) {
            int num = board[row][i];
            if (num != 0) {
                if (used[num - 1]) {
                    return false;
                }
                used[num - 1] = true;
            }
        }
        return true;
    }

    // 열 검사
    private static boolean isValidColumn(int[][] board, int col) {
        boolean[] used = new boolean[9];
        for (int i = 0; i < 9; i++) {
            int num = board[i][col];
            if (num != 0) {
                if (used[num - 1]) {
                    return false;
                }
                used[num - 1] = true;
            }
        }
        return true;
    }

    // 작은 격자(3x3) 검사
    private static boolean isValidGrid(int[][] board, int startRow, int startCol) {
        boolean[] used = new boolean[9];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int num = board[startRow + row][startCol + col];
                if (num != 0) {
                    if (used[num - 1]) {
                        return false;
                    }
                    used[num - 1] = true;
                }
            }
        }
        return true;
    }
}
