package homework2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class ProtectedStack {

    public static byte makeStack(List<String> list) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String str : list) {
            if (str.contains("size")) {
                System.out.println(stack.size());
            } else if (str.contains("pop")) {
                System.out.println(stack.isEmpty() ? "error" : stack.pollLast());
            } else if (str.contains("push")) {
                String[] s = str.split(" ");
                stack.offer(Integer.parseInt(s[1]));
                System.out.println("ok");
            } else if (str.contains("back")) {
                System.out.println(stack.isEmpty() ? "error" : stack.peekLast());
            } else if (str.contains("clear")) {
                stack.clear();
                System.out.println("ok");
            } else if (str.contains("exit")) {
                System.out.println("bye");
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> list = br.lines().collect(Collectors.toList());
            makeStack(list);
        }
    }

}
