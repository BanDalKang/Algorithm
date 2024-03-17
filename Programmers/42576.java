import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> nameMap = new HashMap<>();
        
        // 해시맵에 참가자 추가, 이름이 중복될 경우 값 +1
        for (String p : participant) {
            nameMap.put(p, nameMap.getOrDefault(p, 0) + 1);
        }
        
        // 완주자 제거 (값 -1)
        for (String c : completion) {
            nameMap.put(c, nameMap.get(c) - 1);
        }
        
        // 값이 0이 아닌 참가자를 찾기
        // (nameMap의 key들을 포함한 Set으로 반환해서)
        for (String key : nameMap.keySet()) {
            if (nameMap.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> nameMap = new HashMap<>();
        
        // 참가자 추가하고, 이름이 중복될 경우 값을 증가시킴
        for (String p : participant) {
            nameMap.put(p, nameMap.getOrDefault(p, 0) + 1);
        }
        
        // 완주자 명단 제거
        for (String c : completion) {
            nameMap.put(c, nameMap.get(c) - 1);
        }
        
        // 값이 0이 아닌 참가자를 찾기
        // (nameMap의 key들을 포함한 Set으로 반환해서)
        for (String key : nameMap.keySet()) {
            if (nameMap.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}