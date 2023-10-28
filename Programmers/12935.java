class Solution {
    public int[] solution(int[] arr) {
        // 배열이 비어있는 경우 -1을 담은 배열 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 최솟값 찾기
        int min = arr[0];

        // 최솟값을 제외한 배열 생성
        int count = 0;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        int[] answer = new int[arr.length - 1];
        for (int num : arr) {
            if (num != min) {
                answer[count++] = num;
            }
        }

        return answer;
    }
}