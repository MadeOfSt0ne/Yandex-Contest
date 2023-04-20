package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixNotation {

    public static long solveTaskB(String str) {
        String[] s = str.split(" ");
        Deque<String> stack = new ArrayDeque<>();
        for (String s1 : s) {
            if (s1.equals("+")) {
                long b = Long.parseLong(stack.pollLast());
                long a = Long.parseLong(stack.pollLast());
                long result = a + b;
                stack.offer(String.valueOf(result));
            } else if (s1.equals("-")) {
                long b = Long.parseLong(stack.pollLast());
                long a = Long.parseLong(stack.pollLast());
                long result = a - b;
                stack.offer(String.valueOf(result));
            } else if (s1.equals("*")) {
                long b = Long.parseLong(stack.pollLast());
                long a = Long.parseLong(stack.pollLast());
                long result = a * b;
                stack.offer(String.valueOf(result));
            } else {
                stack.offer(s1);
            }
        }
        return Long.parseLong(stack.pollLast());
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine().trim();
            System.out.println(solveTaskB(str));
        }
    }

}
