package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BiggerThanNeighbors {

    public static int countElements(List<Integer> arr) {
        if (arr.size() <= 2) {
            return 0;
        }
        int counter = 0;
        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> arr = readList(reader);
            int result = countElements(arr);
            System.out.println(result);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
