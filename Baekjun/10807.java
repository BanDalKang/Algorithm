import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String[] integers = scanner.nextLine().split(" ");
        int v = scanner.nextInt();

        int count = 0;
        for (String i : integers) {
            if (Integer.parseInt(i) == v) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}