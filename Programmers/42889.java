import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> failureRatesMap = new HashMap<>();
        int[] playersOnStage = new int[N + 2]; // 0번째 스테이지, (N+1)번째 스테이지 고려

        // 스테이지에 도달한 플레이어 수 계산
        for (int stage : stages) {
            playersOnStage[stage]++;
        }

        // 각 스테이지의 실패율 계산
        int totalPlayers = stages.length; // 각 해당 스테이지에 도달한 플레이어의 총 수
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRatesMap.put(i, 0.0);
            } else {
                failureRatesMap.put(i, (double) playersOnStage[i] / totalPlayers);
                totalPlayers -= playersOnStage[i];
            }
        }

        // 실패율을 기준으로 내림차순 정렬
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(failureRatesMap.entrySet());
        list.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));

        // 정렬된 스테이지 번호를 배열에 저장
        int idx = 0;
        for (Map.Entry<Integer, Double> entry : list) {
            answer[idx++] = entry.getKey();
        }
        return answer;
    }
}
