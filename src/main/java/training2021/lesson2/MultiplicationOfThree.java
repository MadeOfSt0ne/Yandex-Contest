package training2021.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MultiplicationOfThree {

    public static String findThree(Long[] numbers) {
        if (numbers.length == 3) {
            return numbers[0] + " " + numbers[1] + " " + numbers[2];
        }
        long big;
        long biggest;
        long small;
        long smallest;
        if (numbers[0] >= numbers[1]) {
            big = numbers[1];
            biggest = numbers[0];
            small = numbers[0];
            smallest = numbers[1];
        } else {
            big = numbers[0];
            biggest = numbers[1];
            small = numbers[1];
            smallest = numbers[0];
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Long[] arr = readList2(reader);
            String result = findThree(arr);
            System.out.println(result);
        }
    }

    private static Long[] readList2(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Long::parseLong)
                .toArray(Long[]::new);
    }
}
