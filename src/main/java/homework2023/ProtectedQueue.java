package homework2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class ProtectedQueue {

    public static byte makeQueue(List<String> list) {
        Queue<Integer> stack = new ArrayDeque<>();

        for (String str : list) {
            if (str.equals("size")) {
                System.out.println(stack.size());
            } else if (str.equals("pop")) {
                System.out.println(stack.isEmpty() ? "error" : stack.poll());
            } else if (str.contains("push")) {
                String[] s = str.split(" ");
                stack.offer(Integer.parseInt(s[1]));
                System.out.println("ok");
            } else if (str.equals("front")) {
                System.out.println(stack.isEmpty() ? "error" : stack.peek());
            } else if (str.equals("clear")) {
                stack.clear();
                System.out.println("ok");
            } else if (str.equals("exit")) {
                System.out.println("bye");
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> list = br.lines().collect(Collectors.toList());
            makeQueue(list);
        }
    }
}
