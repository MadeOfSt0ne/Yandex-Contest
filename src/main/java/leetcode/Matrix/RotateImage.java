package leetcode.Matrix;

public class RotateImage {
    /**
     * Leetcode 48
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT
     * allocate another 2D matrix and do the rotation.
     */
    static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                System.out.println("temp = " + temp + ", i = " + i + ", j = " + j);
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
                printMatrix(matrix);
                System.out.println("------------------------");
            }
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{11, 12, 13, 14, 55}, {15, 16, 17, 18, 56}, {19, 20, 21, 22, 57}, {23, 24, 25, 26, 58},
                {27, 28, 29, 30, 59}};
        printMatrix(matrix);
        System.out.println("------------------");
        rotate(matrix);
    }
}
