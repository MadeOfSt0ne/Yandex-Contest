package training2022.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Dates {

    public static int defineDate(Integer[] array) {
        if ((Objects.equals(array[0], array[1]) && array[0] <= 12)) {
            return 1;
        } else if (array[0] > 12 || array[1] > 12) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] array = readIntArray(br);
            System.out.println(defineDate(array));
        }
    }

    private static Integer[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}
