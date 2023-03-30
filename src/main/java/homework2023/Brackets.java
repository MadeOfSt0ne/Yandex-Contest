package homework2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Brackets {

    public static String countBrackets(String str) {
        if (str.isBlank()) {
            return "yes";
        }
        if (str.length() % 2 != 0) {
            return "no";
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        for (Character ch : str.toCharArray()) {
            if (ch.equals('(') || ch.equals('{') || ch.equals('[')) {
                stack.offer(ch);
            } else {
                if (stack.isEmpty()) {
                    return "no";
                }
                Character prefix = map.get(ch);
                if (!prefix.equals(stack.pollLast())) {
                    return "no";
                }
            }
        }
        return "yes";
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            System.out.println(countBrackets(str));
        }
    }
}
