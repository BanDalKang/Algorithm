import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        // 패턴들 컴파일
        Pattern p1 = Pattern.compile("ayaaya|yeye|woowoo|mama");
        Pattern p2 = Pattern.compile("aya|ye|woo|ma");
        
        for(String s : babbling){
            // Matcher 객체로 패턴에 매칭되는 부분을 대체
            s = p1.matcher(s).replaceAll(" ");
            s = p2.matcher(s).replaceAll("");
            if(s.isEmpty()){
                answer++;
            }
        }
        
        return answer;
    }
}

class Solution2 {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s : babbling){
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            s = s.replaceAll("aya|ye|woo|ma", "");
            if(s.isEmpty()){
                answer++;
            }
        }
        
        return answer;
    }
}