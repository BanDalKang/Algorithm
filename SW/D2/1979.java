package D2;

import java.util.*;

class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc=1; tc<=t; tc++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] data = new int[n][n];
			
			int result = 0;
			for (int i=0; i<n; i++) { // 입력 및 가로 확인
				int temp_cnt = 0;
				for (int j=0; j<n; j++) {
					data[i][j] = sc.nextInt();
					if (data[i][j] == 1) {
						temp_cnt ++;
					} 
					if (data[i][j] == 0 || j == n - 1){
						if (temp_cnt == k) {
							result ++;
						}
						if (data[i][j] == 0)
							temp_cnt = 0;
					}
				}
			}

			for (int i=0; i<n; i++) { // 세로 확인
				int temp_cnt = 0;
				for (int j=0; j<n; j++) {
					if (data[j][i] == 1) {
						temp_cnt ++;
					} 
					if (data[j][i] == 0 || j == n - 1){
						if (temp_cnt == k) {
							result ++;
						}
						if (data[j][i] == 0)
							temp_cnt = 0;
					}
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}