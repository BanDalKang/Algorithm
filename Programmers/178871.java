import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerRank = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerRank.put(players[i], i + 1); 
        }

        for (String calling : callings) {
            int callingIndex = playerRank.get(calling) - 1; 
            if (callingIndex > 0) { 
                String temp = players[callingIndex];
                players[callingIndex] = players[callingIndex - 1]; 
                players[callingIndex - 1] = temp;
                playerRank.put(players[callingIndex], callingIndex + 1); 
                playerRank.put(players[callingIndex - 1], callingIndex); 
            }
        }

        return players;
    }
}