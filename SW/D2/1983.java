package D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]); // 학생 수
            int K = Integer.parseInt(input[1]); // 학점을 알고싶은 학생의 번호

            double[] totalScores = new double[N];
            for (int i = 0; i < N; i++) {
                String[] scores = br.readLine().split(" ");
                int midterm = Integer.parseInt(scores[0]);
                int finalExam = Integer.parseInt(scores[1]);
                int assignment = Integer.parseInt(scores[2]);
                totalScores[i] = midterm * 0.35 + finalExam * 0.45 + assignment * 0.20;
            }

            double targetScore = totalScores[K - 1]; // K번째 학생의 총점

            // 학점 부여
            String[] grades = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D" };
            int gradeIndex = 0;
            int studentsPerGrade = N / 10;
            for (int i = 0; i < N; i++) {
                if (totalScores[i] > targetScore) {
                    gradeIndex++;
                }
            }

            // 결과 출력
            System.out.println("#" + t + " " + grades[gradeIndex / studentsPerGrade]);
        }
    }
}
