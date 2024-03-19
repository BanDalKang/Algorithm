class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        // 두 배열의 각 원소를 OR 연산하여 이진수 형태의 지도를 생성
        // (arr1[i]와 arr2[i]의 비트가 하나라도 1이면, 해당 비트는 1)
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        // result[i]이진수를 n자리로 맞추고, 벽은 "#"으로, 공백은 " "으로 대체
        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }
        return result; 
    }
}