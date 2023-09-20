package leetcode.Arrays;

import java.util.Arrays;

public class MinOpsToReduceXtoZero {
    /**
     * Leetcode 1658
     * You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or
     * the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for
     * future operations.
     * Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
     */
    public int minOperations(int[] nums, int x) {
        int totalSum = Arrays.stream(nums).sum();
        int target = totalSum - x;
        if  (target < 0) {
            return -1;
        }
        if (target == 0) {
            return nums.length;
        }
        int n = nums.length;
        int minOps = Integer.MAX_VALUE;
        int currSum = 0;
        int leftIdx = 0;
        int rightIdx = 0;
        while (rightIdx < n) {
            currSum += nums[rightIdx++];
            while (currSum > target && leftIdx < n) {
                currSum -= nums[leftIdx++];
            }
            if (currSum == target) {
                minOps = Math.min(minOps, n - (rightIdx - leftIdx));
            }
        }
        return (minOps == Integer.MAX_VALUE) ? -1 : minOps;
    }

    public int minOperations2(int[] nums, int x) {
        int target = -x, n = nums.length;
        for (int num : nums) {
            target += num;
        }

        if (target == 0) {
            return n;
        }

        int maxLen = 0, curSum = 0, left = 0;

        for (int right = 0; right < n; ++right) {
            curSum += nums[right];
            while (left <= right && curSum > target) {
                curSum -= nums[left];
                left++;
            }
            if (curSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen != 0 ? n - maxLen : -1;
    }
}
