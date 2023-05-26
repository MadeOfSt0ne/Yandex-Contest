package BackendSchool2022;

import java.util.Set;

public class Labyrinth2D {
    public static void findWay(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 'S') {
                    matrix[i][j] = '.';
                    way(matrix, i, j, 'S');
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void way(char[][] matrix, int row, int column, char ch) {
        Set<Character> set = Set.of('S', 'L', 'D', 'R', 'U');
        if (matrix[row][column] == '#' || set.contains(matrix[row][column])) {
            return;
        }
        matrix[row][column] = ch;
        way(matrix, row + 1, column, 'D');
        way(matrix, row - 1, column, 'U');
        way(matrix, row, column + 1, 'R');
        way(matrix, row, column - 1, 'L');
    }

    public static void main(String[] args) {
        char[][] matrix = new char[][] {{'#', '#', '#', '#', '#', '#', '#', '#'},
                                        {'#', '.', '.', '.', '.', '.', '.', '#'},
                                        {'#', '.', '#', 'S', '#', '.', '#', '#'},
                                        {'#', '#', '.', '.', '.', '#', '#', '#'},
                                        {'#', '#', '#', '#', '#', '#', '#', '#'}};
        char[][] matrix2 = new char[][] {{'#', '#', '#'}, {'#', 'S', '#'}, {'#', '#', '#'}};
        findWay(matrix);
    }
}
