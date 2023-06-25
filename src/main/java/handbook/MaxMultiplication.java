package handbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxMultiplication {

    static long findMax(long[] array) {
        if (array.length == 2) {
            return array[0] * array[1];
        }
        long big;
        long biggest;
        if (array[0] > array[1]) {
            biggest = array[0];
            big = array[1];
        } else {
            biggest = array[1];
            big = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] >= biggest) {
                big = biggest;
                biggest = array[i];
            } else if (array[i] > big) {
                big = array[i];
            }
        }
        return big * biggest;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            long[] array = readArrayInt(br);
            System.out.println(findMax(array));
        }
    }

    private static long[] readArrayInt(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
    }
}
