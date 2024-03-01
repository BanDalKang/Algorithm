import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> resultSet = new TreeSet<>();

        // 두 수의 합을 구하여 resultSet에 저장
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 배열로 변환
        int[] answer = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            answer[index++] = num;
        }

        return answer;
    }
}