class Solution {
    public static boolean solution(int x) {
        // 입력된 수의 각 자릿수 합 구하기
        int digitSum = 0;
        int tempX = x;
        while (tempX > 0) {
            digitSum += tempX % 10;
            tempX /= 10;
        }

        // 입력된 수가 자릿수의 합으로 나누어 떨어지는지 확인
        return (x % digitSum == 0);
    }
}