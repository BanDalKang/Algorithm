package D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("3") == true || arr[i].contains("6") == true || arr[i].contains("9")) {
                arr[i] = String.valueOf(i + 1).replaceAll("[369]", "-").replaceAll("\\d", "");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }       
    }
}