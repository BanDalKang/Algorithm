class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sPoint = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sPoint++] = i;
            if (sPoint >= 4 && stack[sPoint - 1] == 1
                && stack[sPoint - 2] == 3
                && stack[sPoint - 3] == 2
                && stack[sPoint - 4] == 1) {
                sPoint -= 4;
                answer++;
            }
        }
        return answer;
    }
}