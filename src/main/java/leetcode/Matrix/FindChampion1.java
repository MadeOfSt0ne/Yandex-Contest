package leetcode.Matrix;

public class FindChampion1 {
    /**
     * Leetcode 2923
     * There are n teams numbered from 0 to n - 1 in a tournament.
     * Given a 0-indexed 2D boolean matrix grid of size n * n. For all i, j that 0 <= i, j <= n - 1 and i != j team i
     * is stronger than team j if grid[i][j] == 1, otherwise, team j is stronger than team i.
     * Team a will be the champion of the tournament if there is no team b that is stronger than team a.
     * Return the team that will be the champion of the tournament.
     */
    static int findChampion(int[][] grid) {
        int n = grid.length;
        int winner = 0;
        for (int i = 0; i < n; i++) {
            if (i == winner) {
                continue;
            }
            if (grid[winner][i] == 0) {
                winner = i;
            }
        }
        return winner;
    }
}
