package leetcode.Dynamic;

public class RichestCustomerWealth {
    /**
     * Leetcode 1672
     * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
     * i customer has in the j bank. Return the wealth that the richest customer has.
     * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the
     * customer that has the maximum wealth.
     */
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] i : accounts) {
            int currSum = 0;

            for (int j : i) {
                currSum += j;
            }

            max = Math.max(max, currSum);
        }
        return max;
    }
}
