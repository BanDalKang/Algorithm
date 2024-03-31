import java.util.HashSet;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        HashSet<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int increment = index % 26;
            for (int j = 0; j < increment; j++) {
                c++;
                if (c > 'z') {
                    c -= 26;
                }
                while (skipSet.contains(c)) {
                    c++;
                    if (c > 'z') {
                        c -= 26;
                    }
                }
            }
            answer.append(c);
        }

        return answer.toString();
    }
}
