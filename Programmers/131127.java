import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        int validDays = 0;
        int discountLength = discount.length;
        
        // 슬라이딩 윈도우
        for (int start = 0; start <= discountLength - 10; start++) {
            Map<String, Integer> currentDiscounts = new HashMap<>();
            for (int i = start; i < start + 10; i++) {
                currentDiscounts.put(discount[i], currentDiscounts.getOrDefault(discount[i], 0) + 1);
            }
            
            if (matches(wantMap, currentDiscounts)) {
                validDays++;
            }
        }
        
        return validDays;
    }
    
    private boolean matches(Map<String, Integer> wantMap, Map<String, Integer> currentDiscounts) {
        for (String key : wantMap.keySet()) {
            if (wantMap.get(key).intValue() != currentDiscounts.getOrDefault(key, 0)) {
                return false;
            }
        }
        return true;
    }
}