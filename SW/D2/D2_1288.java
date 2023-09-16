package D2;

import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine()); // 입력값 N
            boolean[] seenDigits = new boolean[10]; // 숫자를 본 여부를 저장하는 배열
            int count = 0; // 숫자를 본 횟수

            // 0에서 9까지의 숫자를 모두 볼 때까지 반복
            while (true) {
                count++;
                int number = N * count; // N의 배수 번호 양을 센다

                // 숫자의 각 자릿수를 확인하여 본 숫자 표시
                while (number > 0) {
                    int digit = number % 10;
                    seenDigits[digit] = true;
                    number /= 10;
                }

                // 0부터 9까지 모든 숫자를 본 경우 종료
                boolean allDigitsSeen = true;
                for (int i = 0; i < 10; i++) {
                    if (!seenDigits[i]) {
                        allDigitsSeen = false;
                        break;
                    }
                }

                if (allDigitsSeen) {
                    break;
                }
            }

            // 결과 출력
            System.out.println("#" + testCase + " " + (N * count));
        }
    }
}