class Solution {
    public int solution(int n) {
        // 10진법을 3진법으로 변환
        String reversedTernary = reverseTernary(n);
        
        // 3진법을 10진법으로 변환
        int answer = ternaryToDecimal(reversedTernary);
        
        return answer;
    }
    
    // 10진법을 3진법으로 변환하는 메서드
    private String reverseTernary(int decimal) {
        StringBuilder result = new StringBuilder();
        
        while (decimal > 0) {
            result.append(decimal % 3);
            decimal /= 3;
        }
        
        return result.toString();
    }
    
    // 3진법을 10진법으로 변환하는 메서드
    private int ternaryToDecimal(String ternary) {
        int result = 0;
        int power = 0;
        
        for (int i = ternary.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(ternary.charAt(i));
            result += digit * Math.pow(3, power);
            power++;
        }
        
        return result;
    }
}
