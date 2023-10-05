package D2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Solution {
    static int T;          // 테스트 케이스의 수
    static int[] score;    // 숫자의 빈도 배열

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {       
            score = new int[101];
            br.readLine();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 1000; i++) {         // 숫자 횟수를 계산
                int n = Integer.parseInt(st.nextToken());
                score[n]++; // 해당 숫자의 빈도 증가
            }

            int max = 0;
            int maxIdx = 0;

            //가장 많이 등장하는 숫자
            for (int i = 0; i < score.length; i++) {
                if (score[i] >= max) {
                    max = score[i];
                    maxIdx = i;  //max와 maxIdx 업데이트
                }
            }

            // 결과 출력
            bw.write("#" + t + " " + maxIdx);
            bw.newLine(); // 줄 바꿈
        }

        bw.flush(); // 출력 스트림 출력
        bw.close(); // 출력 스트림 닫기
    }
}
