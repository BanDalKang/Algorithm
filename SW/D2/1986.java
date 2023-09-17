package D2;

import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine()); // 입력값 N
            int result = 0;

            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    result -= i; // 짝수인 경우 뺄셈
                } else {
                    result += i; // 홀수인 경우 덧셈
                }
            }

            System.out.println("#" + testCase + " " + result);
        }
    }
}

