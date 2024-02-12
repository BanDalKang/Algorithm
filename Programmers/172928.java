class Solution {
    public int[] solution(String[] park, String[] routes) {
        int parkH = park.length;
        int parkW = park[0].length();

        int startH = 0;
        int startW = 0;

        for(int i=0; i<parkH; i++){
            if(park[i].contains("S"))
            {
                startH = i;
                startW = park[i].indexOf("S"); 
            }
        }

        for(String route : routes){
            String direction = route.split(" ")[0];
            int move = Integer.parseInt(route.split(" ")[1]);
            int moveH = startH;
            int moveW = startW;

            for(int i=0; i<move; i++)
            {
                switch(direction) {
                    case "S" : moveH++; break; 
                    case "N" : moveH--; break;
                    case "E" : moveW++; break;
                    case "W" : moveW--; break;
                }

                if (moveH >= 0 && moveH < parkH && moveW >= 0 && moveW < parkW) {
                    if (park[moveH].charAt(moveW) == 'X') {
                        break;
                    }
                    if (i == move - 1) {
                        startH=moveH;
                        startW=moveW;
                    }
                }    
            }
        }

        int[] answer = {startH,startW};
        return answer;
    }
}