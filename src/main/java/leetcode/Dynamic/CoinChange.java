package leetcode.Dynamic;

import java.util.Arrays;

public class CoinChange {
    /**
     * Leetcode 322
     * You are given an integer array coins representing coins of different denominations and an integer amount
     * representing a total amount of money.
     * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made
     * up by any combination of the coins, return -1.
     * You may assume that you have an infinite number of each kind of coin.
     */
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
