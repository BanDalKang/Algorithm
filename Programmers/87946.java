class Solution {
    public static boolean check[];
    public static int result = 0;

    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        dfs(k, dungeons, 0);

        return result;
    }
    public static void dfs(int fatigue, int[][] dungeons, int cnt){
        for(int i=0; i<dungeons.length; i++){
            if(!check[i] && dungeons[i][0]<=fatigue){
                check[i] = true;
                dfs(fatigue-dungeons[i][1], dungeons, cnt+1);
                check[i] = false;
            }
        }
        result = Math.max(result, cnt);
    }
}