package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

    public static byte buildMatrix(int n, int m) {
        int[][] matrix = new int[m][n];
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    count = fillDiag(matrix, i, j, count);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    private static int fillDiag(int[][] matrix, int row, int col, int count) {
        while (col >= 0 && row < matrix.length) {
            matrix[row][col] = count;
            row++;
            col--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            buildMatrix(n, m);
        }
    }
}
