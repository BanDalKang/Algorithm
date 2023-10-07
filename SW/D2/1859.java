package D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(in.readLine());

        for (int k = 1; k <= T; k++) {
            int n = Integer.parseInt(in.readLine()); // 연속된 날짜의 수
            st = new StringTokenizer(in.readLine()); // 각 날짜의 매매 가격

            long sum = 0; // 최대 이익
            long cnt = 0; // 현재까지 구매한 수량
            int[] arr = new int[n]; // 날짜별 매매 가격

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken()); // 각 날짜의 매매 가격 저장
            }

            int idx = n - 1; // 현재 분석 중인 날짜 인덱스
            for (int i = n - 2; i >= 0; i--) {
                if (arr[idx] >= arr[i]) { // 현재 가격이 이전 가격보다 크거나 같으면
                    cnt++; // 수량을 증가
                    sum -= arr[i]; // 비용을 감소
                } else {
                    sum += arr[idx] * cnt; // 현재 가격으로 판매, 이익을 증가
                    cnt = 0; // 수량 초기화
                    idx = i; // 인덱스 업데이트
                }
            }

            sum += arr[idx] * cnt; // 남은 수량에 대한 이익을 계산
            System.out.println("#" + k + " " + sum);
            Arrays.fill(arr, 0);
        }
    }
}
