package training2021.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pyramid {

    public static long findHeight(List<Long[]> arr) {
        Map<Long, Long> map = new HashMap<>();
        Long counter;
        for (Long[] i : arr) {
            counter = map.getOrDefault(i[0], 0L);
            if (i[1] > counter) {
                map.put(i[0], i[1]);
            }
        }
        Long height = 0L;
        for (Long h : map.keySet()) {
            height += map.get(h);
        }
        return height;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int blocks = readInt(br);
            List<Long[]> arr = new ArrayList<>();
            for (int i = 0; i < blocks; i++) {
                arr.add(readList(br));
            }
            long result = findHeight(arr);
            System.out.println(result);
        }
    }

    private static Long[] readList(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }
}
