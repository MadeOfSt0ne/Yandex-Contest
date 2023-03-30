package training2022.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MetroCycle {
    public static int findMinStations(Integer[] array) {
        int totalStations = array[0];
        int overCycle;
        int between;
        if (array[1] > array[2]) {
            between = array[1] - array[2] - 1;
            overCycle = totalStations - array[1] + array[2] - 1;
        } else {
            between = array[2] - array[1] - 1;
            overCycle = totalStations - array[2] + array[1] - 1;
        }
        return Math.min(between, overCycle);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] array = readIntArray(br);
            System.out.println(findMinStations(array));
        }
    }

    private static Integer[] readIntArray(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}
