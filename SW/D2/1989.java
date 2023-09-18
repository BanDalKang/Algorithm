package D2;

import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int testCase = 1; testCase <= T; testCase++) {
            String word = br.readLine(); // 입력받은 단어
            int length = word.length();
            boolean isPalindrome = true; // 회문 여부를 나타내는 플래그

            // 단어의 앞쪽과 뒤쪽을 비교하여 회문인지 판별
            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // 결과 출력
            int result = isPalindrome ? 1 : 0;
            System.out.println("#" + testCase + " " + result);
        }
    }
}

