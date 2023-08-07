package Baekjun;

import java.util.*;

public class P11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] -'0'; // '0'(=48) 문자 0은 아스키코드 숫자 48
        }
        System.out.println(sum);
    }
}