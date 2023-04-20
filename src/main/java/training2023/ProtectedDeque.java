package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class ProtectedDeque {

    public static byte makeDeque(List<String> list) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (String str : list) {
            if (str.equals("size")) {
                System.out.println(deque.size());
            } else if (str.equals("pop_front")) {
                System.out.println(deque.isEmpty() ? "error" : deque.poll());
            } else if (str.equals("pop_back")) {
                System.out.println(deque.isEmpty() ? "error" : deque.pollLast());
            } else if (str.contains("push_front")) {
                String[] s = str.split(" ");
                deque.offerFirst(Integer.parseInt(s[1]));
                System.out.println("ok");
            } else if (str.contains("push_back")) {
                String[] b = str.split(" ");
                deque.offer(Integer.parseInt(b[1]));
                System.out.println("ok");
            } else if (str.equals("front")) {
                System.out.println(deque.isEmpty() ? "error" : deque.peek());
            } else if (str.equals("back")) {
                System.out.println(deque.isEmpty() ? "error" : deque.peekLast());
            } else if (str.equals("clear")) {
                deque.clear();
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
            makeDeque(list);
        }
    }
}
