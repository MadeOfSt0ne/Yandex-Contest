package leetcode.Matrix;

public class NumberOfIslands {
    /**
     * Leetcode 200
     * Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of
     * islands.
     * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may
     * assume all five edges of the grid are all surrounded by water.
     */
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    clearRestIsland(grid, i, j);
                }
            }
        }
        return count;
    }

    private void clearRestIsland(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        clearRestIsland(grid, i + 1, j);
        clearRestIsland(grid, i - 1, j);
        clearRestIsland(grid, i, j + 1);
        clearRestIsland(grid, i, j - 1);
    }
}
