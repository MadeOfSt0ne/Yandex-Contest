package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GreatLinelandRelocation {

    public static byte findClosestSmallest(int[] prices) {
        Integer[] result = new Integer[prices.length];
        Deque<Integer[]> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            if (stack.size() != 0) {
                while (stack.size() != 0 && stack.peekLast()[0] > prices[i]) {
                    Integer[] current = stack.pollLast();
                    result[current[1]] = i;
                }
            }
            stack.offer(new Integer[]{prices[i], i});
        }

        while (!stack.isEmpty()) {
            Integer[] curr = stack.pollLast();
            result[curr[1]] = -1;
        }

        for (Integer res : result) {
            System.out.print(res + " ");
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(br);
            int[] prices = readIntArray(br);
            findClosestSmallest(prices);
        }
    }

    private static int[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

}
