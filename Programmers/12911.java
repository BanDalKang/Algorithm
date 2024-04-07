class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n); 
        int nextNumber = n + 1; 

        while (true) {
            if (Integer.bitCount(nextNumber) == count) {
                return nextNumber;
            }
            nextNumber++;
        }
    }
}