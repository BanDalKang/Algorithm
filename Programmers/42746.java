import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        // 정렬을 위해 String 배열로 변환
        String[] nums = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        
        // 두 문자열을 합쳐 비교 후, 내림차순으로 정렬
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        
        // 만약에 모든 숫자가 0일 경우 처리
        if (nums[0].equals("0")) {
            return "0";
        }
        
        // 정렬된 문자열 붙이기
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }
        
        return sb.toString();
    }
}