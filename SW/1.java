import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스의 수

        for (int t = 1; t <= T; t++) {
            int s = scanner.nextInt(); // 출발 지점
            int e = scanner.nextInt(); // 도착 지점

            // 출발 지점과 도착 지점이 속한 라인 찾기
            int startLine = findLine(s);
            int endLine = findLine(e);

            // 출발 지점과 도착 지점이 같은 라인인 경우
            if (startLine == endLine) {
                System.out.println("#" + t + " " + Math.abs(e - s));
            } else {
                // 출발 지점과 도착 지점이 다른 라인인 경우
                int distanceInStartLine = (s - (startLine * (startLine - 1)) / 2);
                int distanceInEndLine = (e - (endLine * (endLine - 1)) / 2);

                System.out.println("#" + t + " " + (Math.abs(distanceInEndLine - distanceInStartLine)));
            }
        }

        scanner.close();
    }

    // 지점이 속한 라인을 찾는 메소드
    private static int findLine(int point) {
        int line = 1;
        while ((line * (line + 1)) / 2 < point) {
            line++;
        }
        return line;
    }
}