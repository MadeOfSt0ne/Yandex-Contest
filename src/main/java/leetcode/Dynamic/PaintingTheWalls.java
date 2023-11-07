package leetcode.Dynamic;

public class PaintingTheWalls {
    /**
     * Leetcode 2742
     * You are given two 0-indexed integer arrays, 'cost' and 'time', of size 'n' representing the costs and the time
     * taken to paint 'n' different walls respectively. There are two painters available:
     * A paid painter that paints the ith wall in 'time[i]' units of time and takes 'cost[i]' units of money.
     * A free painter that paints any wall in 1 unit of time at a cost of 0. But the free painter can only be used if
     * the paid painter is already occupied.
     * Return the minimum amount of money required to paint the 'n' walls.
     */
    static int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[n][i] = (int) 1e9;
        }
        int opt1;
        int opt2;
        for (int i = n - 1; i >= 0; i--) {
            for (int remain = 1; remain <= n; remain++) {
                opt1 = cost[i] + dp[i + 1][Math.max(0, remain - 1 - time[i])];
                opt2 = dp[i + 1][remain];
                dp[i][remain] = Math.min(opt1, opt2);
            }
        }
        return dp[0][n];
    }
}
