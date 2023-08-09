package Baekjun;
import java.io.*;
import java.util.*;

public class P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int suN = Integer.parseInt(st.nextToken());
        int quizN = Integer.parseInt(st.nextToken());

        long[]S = new long[suN+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=suN; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int q=0; q<quizN; q++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(S[b] - S[a-1]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
