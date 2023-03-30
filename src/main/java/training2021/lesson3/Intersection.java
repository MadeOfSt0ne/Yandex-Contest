package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Intersection {
    public static List<Integer> findIntersections(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer i : arr1) {
            map1.put(i, 1);
        }
        for (Integer j : arr2) {
            if (map1.containsKey(j)) {
                result.add(j);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> arr1 = readList(reader);
            List<Integer> arr2 = readList(reader);
            List<Integer> result = findIntersections(arr1, arr2);
            for (Integer i : result) {
                System.out.println(i + " ");
            }
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
