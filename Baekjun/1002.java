import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 개수
        
        for (int i = 0; i < T; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();
            
            int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // 두 점 사이의 거리의 제곱
            
            // 두 원의 반지름을 더한 것과 두 점 사이의 거리를 비교하여 경우의 수를 판단
            if (distance == 0) {
                if (r1 == r2)
                    System.out.println(-1); // 원이 겹칠 때
                else
                    System.out.println(0); // 한 원이 다른 원의 내부에 있을 때
            } else {
                if (distance == Math.pow(r1 + r2, 2) || distance == Math.pow(r1 - r2, 2))
                    System.out.println(1); // 한 점에서 만날 때
                else if (distance < Math.pow(r1 + r2, 2) && distance > Math.pow(r1 - r2, 2))
                    System.out.println(2); // 두 점에서 만날 때
                else
                    System.out.println(0); // 만나지 않을 때
            }
        }
        scanner.close();
    }
}