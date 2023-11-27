import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // HashSet 사용해서 중복 저장 없게 함
        HashSet<Integer> chosenPoketmon = new HashSet<>();

        for (int i : nums) {
            chosenPoketmon.add(i);
            if (chosenPoketmon.size() == nums.length / 2) {
                break;
            }
        }

        return chosenPoketmon.size();
    }
}