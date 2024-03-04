import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new LinkedHashMap<>();
        
        // 인물의 이름과 그리움 점수를 맵에 저장
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        // 각 사진별로 반복하면서 추억 점수를 계산
        for (int i = 0; i < photo.length; i++) {
            String[] people = photo[i]; // 현재 사진에 등장하는 인물 배열
            int score = 0; // 현재 사진의 추억 점수
            
            // 현재 사진의 인물들에 대한 그리움 점수를 합산
            for (int j = 0; j < people.length; j++) {
                String person = people[j];
                if (map.containsKey(person)) { // 맵에 해당 인물이 있는지 확인
                    score += map.get(person); // 해당 인물의 그리움 점수를 합산
                }
            }
            answer[i] = score; // 현재 사진의 추억 점수를 결과 배열에 저장
        }
        return answer; // 결과 배열 반환
    }
}