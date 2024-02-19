import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();

        // 의상 종류별로 개수를 세어 map에 저장
        for (String[] c : clothes) {
            String type = c[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }

        // 각 종류별 의상의 개수에 1을 더하여 곱함
        for (int val : clothesMap.values()) {
            answer *= (val + 1);
        }

        // 아무것도 선택하지 않은 경우인 1을 빼고 반환
        return answer - 1;
    }
}