class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();

        // t 문자열에서 p와 길이가 같은 부분문자열을 확인하여 비교
        for (int i = 0; i <= tLength - pLength; i++) {
            String substring = t.substring(i, i + pLength);
            if (compare(substring, p)) {
                answer++;
            }
        }
        return answer;
    }
    
    // 부분문자열이 나타내는 수가 p보다 작거나 같은지 확인하는 메소드
    private boolean compare(String substring, String p) {
        long subNum = Long.parseLong(substring);
        long pNum = Long.parseLong(p);
        return subNum <= pNum;
    }
}
