package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class WagonSorting {

    public static String sortWagons(Integer[] wagons) {
        int current = 1;
        Deque<Integer> deque = new ArrayDeque<>();

        for (Integer i : wagons) {
            deque.offer(i);
            while (deque.size() != 0 && deque.peekLast() == current) {
                deque.pollLast();
                current++;
            }
        }

        return deque.size() == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(br);
            Integer[] wagons = readArrayInt(br);
            System.out.println(sortWagons(wagons));
        }
    }

    private static Integer[] readArrayInt(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

}
