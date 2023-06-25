package handbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddMatrix {

    static byte addMatrix(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] size = readArrayInt(br);
            int[][] a = new int[size[0]][];
            for (int i = 0; i < size[0]; i++) {
                a[i] = readArrayInt(br);
            }
            int[][] b = new int[size[0]][];
            for (int i = 0; i < size[0]; i++) {
                b[i] = readArrayInt(br);
            }
            addMatrix(a, b);
        }
    }

    private static int[] readArrayInt(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
