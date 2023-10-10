package Programmers;

class Solution {
    public int solution(int n) {
        for (int i = 2; i <= n / 2; i++) { // n/2를 초과하면서 나머지가 1이 되는 경우는 없음
            if (n % i == 1) {
                return i;
            }
        }
        return n - 1;
    }
}
