package D2;

import java.util.Base64;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            String result = new String(Base64.getDecoder().decode(br.readLine()));
            System.out.println("#" + testCase + " " + result);
        }
    }
}
