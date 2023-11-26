class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;

        for(int i=0; i<goal.length; i++){
            String target = goal[i];
            // 현재 단어가 cards1에 있는 경우 해당 카드의 인덱스를 증가
            if(cardIdx1 < cards1.length && target.equals(cards1[cardIdx1]))
                cardIdx1++;
            // 현재 단어가 cards2에 있는 경우 해당 카드의 인덱스를 증가
            else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2]))
                cardIdx2++;
            // 현재 단어가 둘 다에 없는 경우 goal을 완성할 수 없으므로 "No" 반환
            else
                return "No";
        }
        return "Yes";
    }
}