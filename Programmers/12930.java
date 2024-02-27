class Solution {
    public String solution(String s) {
        // 주어진 문자열을 공백을 기준으로 분할하여 문자열 배열로 저장
        String[] strArr = s.split(" ", -1);
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < strArr.length; i++) {
            char[] charArr = strArr[i].toCharArray(); // 현재 단어를 문자 배열로 변환

            for(int j = 0 ; j < charArr.length ; j++) {
                if(j % 2 == 0) // 짝수번째 문자는 대문자로
                    charArr[j] = Character.toUpperCase(charArr[j]);
                else // 홀수번째 문자는 소문자로
                    charArr[j] = Character.toLowerCase(charArr[j]);
            }
            
            if(i != strArr.length - 1) // 마지막이 아닌 경우, 공백 포함하여 결과 문자열에 추가
                sb.append(new String(charArr) + " ");
            else // 마지막 단어인 경우, 공백 추가하지 않고 결과 문자열에 추가
                sb.append(new String(charArr));
        }	
        return sb.toString();
    }
}
