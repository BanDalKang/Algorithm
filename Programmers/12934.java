package Programmers;

class Solution {
    public long solution(long n) {
        // 양의 정수 x 찾기
        long sqrt = (long) Math.sqrt(n);

        // n이 양의 정수 x의 제곱이면 (x+1)^2 반환, 아니면 -1 반환
        return (sqrt * sqrt == n) ? (sqrt + 1) * (sqrt + 1) : -1;
    }
}
