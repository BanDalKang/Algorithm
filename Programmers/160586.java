import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> key_hashmap = new HashMap<>();
        // keymap 순회하며 각 문자에 대응하는 value(누르는 최소 횟수)를 저장
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                // c가 해시맵에 없음 or i < c의 value
                if (!key_hashmap.containsKey(c) || i < key_hashmap.get(c)) {
                    key_hashmap.put(c, i + 1);
                }
            }
        }
        
        int[] answer = new int[targets.length];
        // 키를 누르는 횟수를 계산
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                // c가 해시맵에 없으면 -1
                if (!key_hashmap.containsKey(c)) {
                    count = 0;
                    break;
                } else {
                    count += key_hashmap.get(c);
                }
            }
            answer[i] = (count == 0 ? -1 : count);
        }
        
        return answer;
    }
}