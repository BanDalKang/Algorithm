import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        scanner.close();
        
        String exclamation = "??!";
        String reaction = username + exclamation;
        
        System.out.println(reaction);
    }
}