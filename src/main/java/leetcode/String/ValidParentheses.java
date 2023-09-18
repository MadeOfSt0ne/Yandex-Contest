package leetcode.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    /**
     * Leetcode 20
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
     * is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     */
    static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.empty() && map.containsKey(c)) {
                return false;
            } else if (map.containsKey(c) && map.get(c).equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
