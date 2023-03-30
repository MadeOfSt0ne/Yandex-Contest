package training2021.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TownChe {

    public static long countMonuments(Integer[] nk, Integer[] distance) {
        long counter = 0L;
        long maxDistance = nk[1];
        int right = 1;

        for (int i = 0; i < distance.length - 1; i++) {
            System.out.println("Entering outer cycle with i = " + i);
            for (int j = right; j < distance.length; j++) {
                long currDist = distance[j] - distance[i];
                System.out.println("Curr distance = " + currDist);
                if (currDist > maxDistance) {
                    right = j;
                    System.out.println("Right index = " + right);
                    counter += distance.length - right;
                    System.out.println("Counter = " + counter);
                    break;
                }
            }
            if (counter == 0) {
                return 0;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] nk = readList(br);
            Integer[] numbers = readList(br);
            System.out.println(countMonuments(nk, numbers));
        }
    }

    private static Integer[] readList(BufferedReader reader) throws IOException {
        return  Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }
}
