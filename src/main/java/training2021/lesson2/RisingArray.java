package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RisingArray {

    public static String countDetails(List<Integer> arr) {
        String result = "YES";

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                return "NO";
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> arr = readList(reader);
            String result = countDetails(arr);
            System.out.println(result);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
