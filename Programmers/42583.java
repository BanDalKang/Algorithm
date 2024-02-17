import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++){
            bridge.add(0);
        }

        int idx = 0;
        int trucksWeight = 0;
        int answer = 0;

        while(idx < truck_weights.length){
            answer++; 
            trucksWeight -= bridge.poll();

            if(trucksWeight + truck_weights[idx] <= weight){
                bridge.add(truck_weights[idx]);
                trucksWeight += truck_weights[idx];
                idx++;
            } else {
                bridge.add(0);
            }
        }
        return bridge_length + answer;
    }
}