package homework2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GreatLinelandRelocation {

    public static byte findClosestSmallest(String str) {
        Integer[] s = Arrays.stream(str.split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Integer[] result = new Integer[s.length];
        Deque<Integer[]> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length; i++) {
            if (stack.size() != 0) {
                while (stack.size() != 0 && stack.peekLast()[0] > s[i]) {
                    Integer[] current = stack.pollLast();
                    result[current[1]] = i;
                }
            }
            stack.offer(new Integer[]{s[i], i});
        }

        while (!stack.isEmpty()) {
            Integer[] curr = stack.pollLast();
            result[curr[1]] = -1;
        }

        Arrays.stream(result).forEach(System.out::println);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(br);
            String str = br.readLine().trim();
            findClosestSmallest(str);
        }
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

}
