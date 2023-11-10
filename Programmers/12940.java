class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대공약수 구하기
        int gcd = getGCD(n, m);
        answer[0] = gcd;
        
        // 최소공배수 구하기
        int lcm = n * m / gcd;
        answer[1] = lcm;

        return answer;
    }

    // 최대공약수를 구하는 메서드
    private int getGCD(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
