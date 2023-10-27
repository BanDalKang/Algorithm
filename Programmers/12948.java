class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        StringBuilder maskedNumber = new StringBuilder();

        // 뒷 4자리를 제외한 나머지 숫자를 *으로 가림
        for (int i = 0; i < length - 4; i++) {
            maskedNumber.append('*');
        }

        return maskedNumber.append(phone_number.substring(length - 4)).toString();

        //repeat 메서드는 Java 11 이상에서만
        //return "*".repeat(length - 4) + phone_number.substring(length - 4);
    }
}