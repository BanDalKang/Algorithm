import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;

        // 나누어 떨어지는 값의 개수 세기
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }

        // 나누어 떨어지는 값이 없으면 -1을 담은 배열 반환
        if (count == 0) {
            return new int[]{-1};
        }

        // 나누어 떨어지는 값을 저장할 배열
        int[] answer = new int[count];
        int index = 0;

        // 나누어 떨어지는 값 찾아서 저장
        for (int num : arr) {
            if (num % divisor == 0) {
                answer[index++] = num;
            }
        }

        // 오름차순으로 정렬
        Arrays.sort(answer);

        return answer;
    }
}