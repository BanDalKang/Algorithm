import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 정렬에 사용할 Comparator 생성
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n); // s1의 n번째 문자
                char c2 = s2.charAt(n); // s2의 n번째 문자
                
                // n번째 문자가 같을 경우에는 사전순으로 정렬
                if (c1 == c2) {
                    return s1.compareTo(s2);
                } else {
                    return c1 - c2; // n번째 문자로 비교
                }
            }
        };
        
        // Comparator를 사용하여 배열 정렬
        Arrays.sort(strings, comparator);
        
        return strings;
    }
}