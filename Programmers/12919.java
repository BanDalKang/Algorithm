class Solution {
    public String solution(String[] seoul) {
        int index = 0;

        // "Kim"의 위치 찾기
        for(String value:seoul) {
          if (value.equals("Kim")) break;
          index++;
        }

        // 결과 문자열 반환
        return "김서방은 " + index + "에 있다";
    }
}