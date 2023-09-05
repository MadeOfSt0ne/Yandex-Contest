package FallWinter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OldC {
    public static long countSum(int[][] matrix, String[] restrictions) {
        long counter = 0;
        int low = 0;
        int high = matrix.length;
        System.out.println("init high = " + high);
        for (String s : restrictions) {
            String[] str = s.split(" ");
            int q = Integer.parseInt(str[2]);
            System.out.println("q = " + q);
            if (str[1].equals(">")) {
                low = Math.max(low, q);
                System.out.println("low = " + low);
            } else {
                high = Math.min(high, q - 1);
                System.out.println("high = " + high);
            }
        }
        for (int i = low; i < high; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                counter += matrix[i][j];
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nmq = readIntArray(br);
            int rows = nmq[0];
            int columns = nmq[1];
            int restrictions = nmq[2];

            String[] words = readStringArray(br);

            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                matrix[i] = readIntArray(br);
            }

            String[] changes = new String[restrictions];
            for (int i = 0; i < restrictions; i++) {
                changes[i] = br.readLine();
            }
            System.out.println(countSum(matrix, changes));
        }
    }

    private static String[] readStringArray(BufferedReader reader) throws IOException {
        return reader.readLine().split(" ");
    }

    private static int[] readIntArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
