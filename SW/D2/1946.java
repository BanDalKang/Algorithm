package D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine()); // 압축된 문서의 줄 수
            StringBuilder originalDocument = new StringBuilder();

            for (int i = 0; i < N; i++) {
                String[] line = br.readLine().split(" ");
                char character = line[0].charAt(0);
                int count = Integer.parseInt(line[1]);

                for (int j = 0; j < count; j++) {
                    originalDocument.append(character);
                }
            }

            // 결과 출력
            System.out.println("#" + t);
            String doc = originalDocument.toString();
            for (int i = 0; i < doc.length(); i += 10) {
                System.out.println(doc.substring(i, Math.min(i + 10, doc.length())));
            }
        }
    }
}
