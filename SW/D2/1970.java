package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine()); // 거슬러 줘야 할 금액

            int[] moneyTypes = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
            int[] moneyCount = new int[8];

            for (int i = 0; i < 8; i++) {
                moneyCount[i] = N / moneyTypes[i];
                N = N % moneyTypes[i];
            }

            // 결과 출력
            System.out.print("#" + t + "\n");
            for (int i = 0; i < 8; i++) {
                System.out.print(moneyCount[i] + " ");
            }
            System.out.println();
        }
    }
}