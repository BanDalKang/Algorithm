class Solution {
    public int solution(int[][] sizes) {
        int max_w = 0; // 가로 길이 중 최대값 초기화
        int max_h = 0; // 세로 길이 중 최대값 초기화
        
        // 모든 명함을 순회하면서 최대 가로 길이와 세로 길이를 각각 구함
        for (int[] size : sizes) {
            max_w = Math.max(max_w, Math.max(size[0], size[1])); // 현재 명함의 가로 길이와 이전의 최대 가로 길이 중 큰 값을 선택
            max_h = Math.max(max_h, Math.min(size[0], size[1])); // 현재 명함의 세로 길이와 이전의 최대 세로 길이 중 큰 값을 선택
        }
        
        // 지갑의 크기를 계산하여 반환
        return max_w * max_h;
    }
}