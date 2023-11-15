import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // 각 문자의 마지막 인덱스를 기록하기 위한 HashMap 생성
        HashMap<Character,Integer> map = new HashMap<>();
        
        // 문자열을 왼쪽부터 순회하며 각 위치마다 연산 수행
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i); // 현재 문자
            // 현재 문자가 이전에 나온 적 없는 경우, -1
            // 있는 경우, 가장 가까운 곳의 위치를 뺀 결과를 저장
            answer[i] = i - map.getOrDefault(ch, i + 1);
            map.put(ch, i); // 현재 문자의 인덱스를 HashMap에 기록
        }
        
        return answer; 
    }
}