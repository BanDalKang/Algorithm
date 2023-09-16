package D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine()); // 입력값 N

            int[] exponents = new int[5]; // 지수를 저장할 배열 [a, b, c, d, e]

            // 소인수 분해
            while (N % 2 == 0) {
                exponents[0]++;
                N /= 2;
            }
            while (N % 3 == 0) {
                exponents[1]++;
                N /= 3;
            }
            while (N % 5 == 0) {
                exponents[2]++;
                N /= 5;
            }
            while (N % 7 == 0) {
                exponents[3]++;
                N /= 7;
            }
            while (N % 11 == 0) {
                exponents[4]++;
                N /= 11;
            }

            // 결과 출력
            System.out.print("#" + t + " ");
            for (int i = 0; i < 5; i++) {
                System.out.print(exponents[i] + " ");
            }
            System.out.println();
        }
    }
}
