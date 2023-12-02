import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 주사위 눈 입력 받기
        int[] count = new int[7]; // 주사위 눈의 개수를 나타내는 배열
        for (int i = 0; i < 3; i++) {
            count[Integer.parseInt(st.nextToken())]++;
        }

        // 상금 계산
        int prize = 0;
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 3) {
                prize = 10000 + i * 1000;
                break;
            } else if (count[i] == 2) {
                prize = 1000 + i * 100;
                break;
            } else if (count[i] == 1) {
                prize = i * 100;
            }
        }

        // 결과 출력
        System.out.println(prize);

        br.close();
    }
}