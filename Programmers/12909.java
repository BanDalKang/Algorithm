import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) { // ')'인데 스택이 비어있으면 올바르지 않은 괄호
                    return false;
                }
                stack.pop(); // 짝이 맞는 경우 스택에서 제거
            }
        }
        
        return stack.isEmpty(); // 순회 후, 스택이 비어있으면 올바른 괄호
    }
}