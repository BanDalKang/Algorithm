package D2;

import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int testCase = 1; testCase <= T; testCase++) {
            String input = br.readLine(); // 입력받은 문자열
            int length = input.length();
            int period = 0; // 마디의 길이

            // 문자열을 순회하면서 마디의 길이를 구함
            for (int i = 1; i <= 10; i++) { // 마디의 최대 길이는 10이므로 10까지 검사
                boolean isPeriod = true;

                for (int j = 0; j < length - i; j++) {
                    if (input.charAt(j) != input.charAt(j + i)) {
                        isPeriod = false;
                        break;
                    }
                }

                if (isPeriod) {
                    period = i;
                    break;
                }
            }

            // 결과 출력
            System.out.println("#" + testCase + " " + period);
        }
    }
}
