class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 1];
        int answer = n;
        
        for (int l : lost)
            clothes[l]--;
        
        for (int r : reserve)
            clothes[r]++;
        
        for (int i = 1; i <= n; i++) {
            // 체육복이 없는 학생일 경우
            if (clothes[i] == -1) {
                // 앞 번호 여벌의 체육복 O
                if (i - 1 >= 1 && clothes[i - 1] == 1) {
                    clothes[i]++;
                    clothes[i - 1]--;
                }
                // 뒷 번호 체육복 O
                else if (i + 1 <= n && clothes[i + 1] == 1) {
                    clothes[i]++;
                    clothes[i + 1]--;
                } else {
                    answer--;
                }
            }
        }
        return answer;
    }
}