package leetcode.Arrays;

public class MaximumSubarray {
    /**
     * Leetcode 53
     * Given an integer array nums, find the subarray with the largest sum, and return its sum.
     */
    static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
