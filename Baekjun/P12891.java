package Baekjun;

import java.io.*;
import java.util.*;

public class P12891 {
    static int cArr[];
    static int mArr[];
    static int cSecret;

    public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
        int result = 0;
        cArr = new int[4];
        mArr = new int[4];
        char A[] = new char[S];
        cSecret = 0;

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            cArr[i] = Integer.parseInt(st.nextToken());
            if(cArr[i] == 0){
                cSecret++;
            }
        }
        
        for(int i=0; i<P; i++){ //부분 문자열 처음 받고 세팅
            Add(A[i]);
        }

        if(cSecret == 4) result++;

        //슬라이딩 윈도우
        for(int i=P; i<S; i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(cSecret == 4) result++;
        }
        System.out.println(result);
        br.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(mArr[0] == cArr[0]) cSecret--;
                mArr[0]--;
                break;
            case 'C':
                if(mArr[1] == cArr[1]) cSecret--;
                mArr[1]--;
            case 'G':
                if(mArr[2] == cArr[2]) cSecret--;
                mArr[2]--;
            case 'T':
                if(mArr[3] == cArr[3]) cSecret--;
                mArr[3]--;
                break;
        }
    }

    private static void Add(char c){
        switch (c) {
            case 'A':
                mArr[0]++;
                if(mArr[0] == cArr[0]) cSecret++;
                break;
            case 'C':
                mArr[1]++;
                if(mArr[1] == cArr[1]) cSecret++;
                break;
            case 'G':
                mArr[2]++;
                if(mArr[2] == cArr[2]) cSecret++;
                break;
            case 'T':
                mArr[3]++;
                if(mArr[3] == cArr[3]) cSecret++;
                break;
        }
    }
}