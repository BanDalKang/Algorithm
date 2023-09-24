package D2;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수

        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt(); // 명령어 개수
            int velocity = 0; // 초기 속도
            int distance = 0; // 이동거리

            for (int i = 0; i < N; i++) {
                int command = scanner.nextInt();

                if (command == 0) {
                    // 현재 속도 유지
                } else if (command == 1) {
                    int acceleration = scanner.nextInt();
                    velocity += acceleration;
                } else if (command == 2) {
                    int deceleration = scanner.nextInt();
                    velocity -= deceleration;
                    if (velocity < 0) {
                        velocity = 0; // 속도가 음수가 되지 않도록 보정
                    }
                }

                distance += velocity;
            }

            System.out.println("#" + t + " " + distance);
        }

        scanner.close();
    }
}
