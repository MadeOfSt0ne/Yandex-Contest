package leetcode.Dynamic;

public class PartitionEqualSubsetSum {
    /**
     * Leetcode 416
     * Given an integer array 'nums', return 'true' if you can partition the array into two subsets such that the sum of
     * the elements in both subsets is equal or 'false' otherwise.
     */
    static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int j : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= j) {
                    dp[i] = dp[i] || dp[i - j];
                }
            }
        }
        return dp[sum];
    }
}
