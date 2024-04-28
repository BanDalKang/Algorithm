import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> tangerineSizeHashMap = new HashMap<>();
        for(int t:tangerine){
            tangerineSizeHashMap.put(t, tangerineSizeHashMap.getOrDefault(t, 0)+1);
        }
        
        List<Integer> valueList = new ArrayList<>(tangerineSizeHashMap.values());
        Collections.sort(valueList, Collections.reverseOrder());
        
        for(int v:valueList){
            k -= v;
            answer++;
            if(k<=0){
                break;
            }
        }
        
        return answer;
    }
}