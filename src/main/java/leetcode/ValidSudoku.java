package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    /**
     * Leetcode 36
     * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the
     * following rules:
     * 1. Each row must contain the digits 1-9 without repetition.
     * 2. Each column must contain the digits 1-9 without repetition.
     * 3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     * Note:
     * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
     * Only the filled cells need to be validated according to the mentioned rules.
     */
    static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char number = board[row][column];
                if (number != '.') {
                    if (!set.add(number + " row " + row)
                            || !set.add(number + " column " + column)
                            || !set.add(number + " block " + (row / 3) + "." + (column / 3))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
