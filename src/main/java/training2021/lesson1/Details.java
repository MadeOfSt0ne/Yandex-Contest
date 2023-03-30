package training2021.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Details {

    public static int countDetails(List<Integer> arr) {
        int totalMass = arr.get(0);
        int bar = arr.get(1);
        int detail = arr.get(2);

        int result = 0;

        while (totalMass >= bar) {
            totalMass = totalMass - bar;
            result = result + bar / detail;
            totalMass = totalMass + bar % detail;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> arr = readList(reader);
            int result = countDetails(arr);
            System.out.println(result);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
