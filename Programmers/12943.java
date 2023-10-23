public class Solution {
    public int solution(int num) {
        long number = (long) num; // int 범위를 넘어가는 경우를 대비하여 long으로 변환

        for (int i = 0; i < 500; i++) {
            if (number == 1) {
                return i; // 1이 되면 반복 횟수를 반환
            }

            number = (number % 2 == 0) ? number / 2 : number * 3 + 1;
        }

        return -1; // 500번 반복해도 1이 되지 않으면 -1 반환
    }

}