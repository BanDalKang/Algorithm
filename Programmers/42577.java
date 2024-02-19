import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> phone_numberMap = new HashMap<>();

        // 전화번호부를 해시맵에 저장
        for (String phone_number : phone_book) {
            phone_numberMap.put(phone_number, 1);
        }

        // 각 전화번호의 접두어가 해시맵에 있는지 확인
        for (String phone_number : phone_book) {
            for (int i = 1; i < phone_number.length(); i++) {
                if (phone_numberMap.containsKey(phone_number.substring(0, i))) {
                    return false; // 접두어가 있으면 false 반환
                }
            }
        }

        // 접두어가 없는 경우 true 반환
        return true;
    }
}