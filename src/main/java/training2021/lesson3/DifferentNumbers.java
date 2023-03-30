package training2021.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DifferentNumbers {

    public static int countNumbers(List<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        return set.size();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> arr = readList(reader);
            int result = countNumbers(arr);
            System.out.println(result);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
