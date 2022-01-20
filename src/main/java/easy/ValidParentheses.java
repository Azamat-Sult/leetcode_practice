package easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        if (s.length() < 2) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Character extracted = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            extracted = stack.pop();
            if (extracted == '(' && s.charAt(i) != ')') {
                return false;
            }
            if (extracted == '[' && s.charAt(i) != ']') {
                return false;
            }
            if (extracted == '{' && s.charAt(i) != '}') {
                return false;
            }
        }
        return stack.empty();

    }

}