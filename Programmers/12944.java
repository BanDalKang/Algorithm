class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i: arr){ //향상된 for문, ArrayIndexOutOfBoundsException 발생 X
            sum+=i;
        }
        answer = sum/(arr.length);
        return answer;
    }
}