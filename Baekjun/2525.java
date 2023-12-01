import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentHour = scanner.nextInt();
        int currentMinute = scanner.nextInt();
        int cookingTime = scanner.nextInt();

        // 분 단위로 계산
        int totalTime = currentHour * 60 + currentMinute + cookingTime;

        // 시와 분 계산
        int endHour = totalTime / 60 % 24;
        int endMinute = totalTime % 60;

        System.out.println(endHour + " " + endMinute);
        scanner.close();
    }
}
