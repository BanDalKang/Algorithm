package D2;

import java.io.*;
import java.util.*;

class Solution{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int h = (h1+h2);
            int m = (m1+m2);
            if(h>12){
                h -= 12;
            }
            if(m>60){
                m-=60;
                h++;
            }
            if(m == 60){ 
                h++;
                m =1;
            }
            System.out.println("#"+test_case+" "+h+" "+m);
        }
    }
}