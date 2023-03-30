package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SymmetricalSequence {
    public static Collection<Integer> makeSymmetrical(List<Integer> arr, int size) {
        if (symmetrical(arr)) {
            return new ArrayList<>();
        }
        Queue<Integer> que = new LinkedList<>(arr);
        Deque<Integer> deq = new ArrayDeque<>();
        while (!symmetrical(que)) {
            deq.addFirst(que.poll());
        }
        return deq;
    }

    public static boolean symmetrical(Collection<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (var j : list) {
            sb.append(j);
        }
        for (var i = 0; i < sb.length() / 2; i++ ) {
            if (!Objects.equals(sb.charAt(i), sb.charAt(list.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size = readInt(reader);
            List<Integer> arr = readList(reader);
            Collection<Integer> result = makeSymmetrical(arr, size);
            System.out.println(result.size());
            if (result.size() != 0) {
                for (Integer v : result) {
                    System.out.print(v + " ");
                }
            }
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}
