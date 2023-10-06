package D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); //결과 문자열
 
        int n = Integer.parseInt(br.readLine());
 
        for (int t = 1; t <= n; t++) {
            sb.append("#" + t + " ");
 
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine()); // 숫자를 공백으로 구분하여 토큰화
 
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken()); // 각 숫자를 배열에 저장
            }
            
            Arrays.sort(arr); // 배열 오름차순 정렬
 
            double sum = 0.0;
            for (int i = 1; i < 9; i++) { // 최대값과 최소값을 제외
                sum += arr[i];
            }
 
            double avg = sum / 8.0;
            sb.append(Math.round(avg) + "\n"); // 평균값을 반올림
        }
        System.out.println(sb.toString()); // 결과 문자열을 출력
    }
}
