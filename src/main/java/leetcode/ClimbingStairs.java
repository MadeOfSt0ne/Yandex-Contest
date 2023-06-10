package leetcode;

public class ClimbingStairs {
    /**
     * Leetcode
     * You are climbing a staircase. It takes n steps to reach the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 2;
        for (int i = 2; i < n; i++) {
            ans[i] = ans[i - 2] + ans[i - 1];
        }
        return ans[n - 1];
    }
}
