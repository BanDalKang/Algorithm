import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAmount = scanner.nextInt();
        int n = scanner.nextInt();
        int calculatedTotal = 0; 

        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt(); // 물건의 가격 입력 받기
            int quantity = scanner.nextInt(); // 물건의 개수 입력 받기
            calculatedTotal += price * quantity; // 가격 * 개수를 계산한 총 금액에 더하기
        }

        if (totalAmount == calculatedTotal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}