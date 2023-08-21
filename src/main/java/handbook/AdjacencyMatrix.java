package handbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacencyMatrix {

    public static byte buildMatrix(int busStops, List<int[]> routes) {
        int[][] one = new int[busStops][busStops];
        int[][] two = new int[busStops][busStops];
        return 0;
    }

    private static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nm = readArrayInt(br);
            int busStops = nm[0];
            int routes = nm[1];
            List<int[]> routeList = new ArrayList<>();
            for (int i = 0; i < routes; i++) {
                routeList.add(readArrayInt(br));
            }
            buildMatrix(busStops, routeList);
        }
    }

    private static int[] readArrayInt(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
