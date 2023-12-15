import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 1; i <= 9; i++) {
            int input = Integer.parseInt(br.readLine());

            if (max < input) {
                max = input;
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}