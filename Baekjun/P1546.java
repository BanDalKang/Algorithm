package Baekjun;

import java.util.*;

public class P1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int maX = 0;

        for(int i=0; i<N; i++){
            int n = sc.nextInt();
            sum += n;
            if(n>maX) {
                maX = n;
            }
        }

        System.out.println(sum*100.0/maX/N);
    }
}