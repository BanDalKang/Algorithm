class Solution {
    public int[] solution(String[] wallpaper) {
        int startX = Integer.MAX_VALUE;
        int startY = Integer.MAX_VALUE;
        int endX = Integer.MIN_VALUE;
        int endY = Integer.MIN_VALUE;
        
        for(int i=0; i< wallpaper.length;i++ ){
            for(int j=0; j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j) == '#'){
                    startX = Math.min(startX,i);
                    startY = Math.min(startY,j);
                    endX = Math.max(endX,i);
                    endY = Math.max(endY,j);
                }
            }
        }
        
        return new int[]{startX, startY, endX+1, endY+1};
    }
}