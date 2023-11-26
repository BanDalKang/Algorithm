class Solution {
    public String solution(int a, int b) {
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 1월1일부터 a월 b일까지 일 수 계산
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i];
        }
        //totalDays에는 1월 1일이 포함되어 있으므로 1 빼기
        totalDays += b - 1;
        
        // 2016년 1월 1일이 금요일이므로 금요일부터 시작하여 계산
        return daysOfWeek[totalDays % 7];
    }
}

class TryHelloWorld // 타인의 풀이
{
    public String getDayName(int a, int b) {
       String answer = " ";
        int[] monthDay={31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1; i < a; i++) {
            b+=monthDay[i-1];
        }
        switch(b%7){
        case 3:answer="SUN";break;
        case 4:answer="MON";break;
        case 5:answer="TUE";break;
        case 6:answer="WED";break;
        case 0:answer="THU";break;
        case 1:answer="FRI";break;
        case 2:answer="SAT";break;
        }
        return answer;
    }
}