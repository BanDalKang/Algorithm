package D2;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int startMonth = sc.nextInt();
            int startDay = sc.nextInt();
            int endMonth = sc.nextInt();
            int endDay = sc.nextInt();

            int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int days = 0;
            for (int i = startMonth; i <= endMonth; i++) {
                if (i == startMonth) {
                    days += daysInMonth[i] - startDay + 1;
                } else if (i == endMonth) {
                    days += endDay;
                } else {
                    days += daysInMonth[i];
                }
            }

            System.out.println("#" + t + " " + days);
        }
    }
}