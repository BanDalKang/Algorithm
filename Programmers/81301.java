import java.util.HashMap;

class Solution {
    public int solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        StringBuilder sb = new StringBuilder(); 
        int i = 0;

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) { // 숫자인 경우
                sb.append(s.charAt(i)); // 그대로 추가
                i++;
            } else { // 영단어인 경우
                // 영단어를 찾기 위해 연속된 문자열을 확인
                for (int j = 3; j <= 5; j++) {
                    String substr = s.substring(i, i + j); // 연속된 문자열을 추출
                    if (map.containsKey(substr)) { // 해당 영단어가 맵에 존재하는 경우
                        sb.append(map.get(substr)); // 숫자로 치환하여 추가
                        i += j; // 인덱스 업데이트
                        break;
                    }
                }
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}

class otherSolution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}