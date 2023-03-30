package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AcidAndrew {
    private static Integer fillAcid(List<Integer> volumes) {
        int min = volumes.get(0);
        int max = volumes.get(volumes.size() - 1);
        for (int i = 0; i < volumes.size() - 1; i++) {
            if (volumes.get(i) > volumes.get(i + 1)) {
                return -1;
            }
        }
        return max - min;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(reader);
            List<Integer> arr = readList(reader);
            Integer result = fillAcid(arr);
            System.out.println(result);
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.asList(reader.readLine().split(" "))
                .stream()
                .map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());
    }
}
