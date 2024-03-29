package FallWinter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C_SQLRequest {

    public static long countSum(int[][] matrix, String[] restrictions, String[] words) {
        long counter = 0;
        int hi = matrix.length;
        System.out.println("hi = " + hi);
        Map<String, Integer> lowMap = new HashMap<>();
        Map<String, Integer> highMap = new HashMap<>();
        Map<Integer, String> names = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            names.put(i, words[i]);
        }
        for (String restriction : restrictions) {
            String[] str = restriction.split(" ");
            String name = str[0];
            int q = Integer.parseInt(str[2]);
            System.out.println("q = " + q + " name = " + name);
            if (str[1].equals(">")) {
                int prevLow = lowMap.getOrDefault(name, 0);
                int low = Math.max(prevLow, q);
                lowMap.put(name, low);
                System.out.println("low = " + low);
            } else {
                int prevHigh = highMap.getOrDefault(name, hi);
                int high = Math.min(prevHigh, q);
                highMap.put(name, high);
                System.out.println("high = " + high);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                String column = names.get(j);
                System.out.println("name = " + column + " from " + lowMap.getOrDefault(column, 0) +
                        " to " + highMap.getOrDefault(column, hi));
                if (i + 1 > lowMap.getOrDefault(column, 0) && i < highMap.getOrDefault(column, hi)) {
                    counter += matrix[i][j];
                    System.out.println("sum = " + counter);
                }
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
            System.out.println(countSum(matrix, changes, words));
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
