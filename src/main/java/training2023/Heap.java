package training2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class Heap {

    public static byte makeHeap(List<String> list) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (String str : list) {
            if (str.startsWith("0")) {
                String[] ints = str.split(" ");
                queue.add(Integer.parseInt(ints[1]));
            } else if (str.startsWith("1")) {
                System.out.println(queue.poll());
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(br);
            List<String> list = br.lines().collect(Collectors.toList());
            makeHeap(list);
        }
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

}
