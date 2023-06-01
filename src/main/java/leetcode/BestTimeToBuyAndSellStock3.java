package leetcode;

public class BestTimeToBuyAndSellStock3 {
    /**
     * Leetcode 123
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * Find the maximum profit you can achieve. You may complete at most two transactions.
     * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy
     * again).
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - min);
        }
        int max = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, prices[i]);
            right[i] = Math.max(right[i + 1], max - prices[i]);
        }
        int profit = 0;
        for (int k = 0; k < n; k++) {
            profit = Math.max(profit, left[k] + right[k]);
        }
        return profit;
    }

    static int maxProfit2(int[] prices) {
        int buy1 = Integer.MAX_VALUE;
        int buy2 = Integer.MAX_VALUE;
        int sell1 = 0;
        int sell2 = 0;

        for (int price : prices) {
            buy1 = Math.min(buy1, price);
            System.out.println("Buy1  = min(buy1, price) = " + buy1);
            sell1 = Math.max(sell1, price - buy1);
            System.out.println("Sell1 = max(sell1, price - buy1) = " + sell1);
            buy2 = Math.min(buy2, price - sell1);
            System.out.println("Buy2  = min(buy2, price - sell1) = " + buy2);
            sell2 = Math.max(sell2, price - buy2);
            System.out.println("Sell2 = max(sell2, price - buy2) = " + sell2);
            System.out.println("-----------------");
        }

        return sell2;
    }
}
