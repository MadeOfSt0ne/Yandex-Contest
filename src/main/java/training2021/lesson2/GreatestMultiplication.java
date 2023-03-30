package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreatestMultiplication {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Long> arr = readList(reader);
            String result = findNumbers(arr);
            System.out.println(result);
        }
    }

    public static String findNumbers(List<Long> arr) {
        StringBuilder sb = new StringBuilder();
        long biggest;
        long big;
        long smallest;
        long small;
        if (arr.get(0) >= arr.get(1)) {
            biggest = arr.get(0);
            big = arr.get(1);
            smallest = arr.get(1);
            small = arr.get(0);
        } else {
            biggest = arr.get(1);
            big = arr.get(0);
            smallest = arr.get(0);
            small = arr.get(1);
        }

        for (int i = 2; i < arr.size(); i++) {
            if (biggest <= arr.get(i)) {
                big = biggest;
                biggest = arr.get(i);
            } else if (big < arr.get(i) && arr.get(i) < biggest) {
                big = arr.get(i);
            } else if (arr.get(i) <= smallest) {
                small = smallest;
                smallest = arr.get(i);
            } else if (smallest < arr.get(i) && arr.get(i) < small) {
                small = arr.get(i);
            }
        }

        if (big * biggest > small * smallest) {
            sb.append(big).append(" ").append(biggest);
        } else {
            sb.append(smallest).append(" ").append(small);
        }
        //System.out.println(sb);
        return sb.toString();
    }

    private static List<Long> readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Long::parseLong)
                .collect(Collectors.toList());
    }
}
