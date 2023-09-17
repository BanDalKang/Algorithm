package D2;

import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken()); // A사 1리터당 요금
            int Q = Integer.parseInt(st.nextToken()); // B사 기본 요금
            int R = Integer.parseInt(st.nextToken()); // B사 기본 요금 적용 리터 수
            int S = Integer.parseInt(st.nextToken()); // B사 초과량 요금
            int W = Integer.parseInt(st.nextToken()); // 종민이가 사용한 수도 양

            // A사와 B사의 요금을 계산
            int costA = P * W;
            int costB;
            if (W <= R) {
                costB = Q;
            } else {
                costB = Q + (W - R) * S;
            }

            // 더 저렴한 요금 선택
            int minCost = Math.min(costA, costB);

            // 결과 출력
            System.out.println("#" + testCase + " " + minCost);
        }
    }
}

