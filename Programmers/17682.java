class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int currentIdx = -1;
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                if (i > 0 && Character.isDigit(dartResult.charAt(i - 1))) {
                    scores[currentIdx] = 10;
                } else {
                    currentIdx++;
                    scores[currentIdx] = c - '0';
                }
            } else {
                switch (c) {
                    case 'S':
                        scores[currentIdx] = (int) Math.pow(scores[currentIdx], 1);
                        break;
                    case 'D':
                        scores[currentIdx] = (int) Math.pow(scores[currentIdx], 2);
                        break;
                    case 'T':
                        scores[currentIdx] = (int) Math.pow(scores[currentIdx], 3);
                        break;
                    case '*':
                        scores[currentIdx] *= 2;
                        if (currentIdx > 0) {
                            scores[currentIdx - 1] *= 2;
                        }
                        break;
                    case '#':
                        scores[currentIdx] *= -1;
                        break;
                }
            }
        }
        
        int answer = 0;
        for (int score : scores) {
            answer += score;
        }
        return answer;
    }
}