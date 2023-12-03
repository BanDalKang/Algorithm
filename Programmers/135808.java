import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        if (score.length >= m) {
            Arrays.sort(score); // 점수를 오름차순으로 정렬
            reverse(score); // 정렬된 점수 배열을 내림차순으로

            int boxes = score.length / m; // 총 상자의 개수
            for (int i = 1; i <= boxes; i++) {
                answer += score[m * i - 1] * m;
            }
        }
        return answer;
    }

    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}

class Solution2 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            int index = i - m;
            answer += score[index] * m;
        }
        return answer;
    }
}